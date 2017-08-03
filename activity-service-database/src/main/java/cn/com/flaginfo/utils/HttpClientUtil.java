package cn.com.flaginfo.utils;
import org.springframework.http.HttpEntity;
import org.springframework.http.HttpHeaders;
import org.springframework.http.MediaType;
import org.springframework.web.client.RestTemplate;

import com.alibaba.fastjson.JSON;
import com.alibaba.fastjson.JSONArray;
import com.alibaba.fastjson.JSONObject;
import com.alibaba.fastjson.serializer.SerializerFeature;
  
public class HttpClientUtil {

	public static JSONObject post(String uri, String param) throws Exception {
		RestTemplate restTemplate = new RestTemplate();
		HttpHeaders headers = new HttpHeaders();
		MediaType type = MediaType.parseMediaType("application/json; charset=UTF-8");
		headers.setContentType(type);
		headers.add("Accept", MediaType.APPLICATION_JSON.toString());
		JSONObject jsonObj = JSONObject.parseObject(param);
		HttpEntity<String> formEntity = new HttpEntity<String>(jsonObj.toString(), headers);
		String result = restTemplate.postForObject(uri, formEntity, String.class);
		if (!result.equals(new String(result.getBytes("utf-8"), "utf-8"))) {

			return JSONObject.parseObject(new String(result.getBytes("ISO8859-1"), "utf-8"));
		} else {
			return JSONObject.parseObject(result);
		}
	}
	
	public static JSONObject post(String uri, JSONArray param) throws Exception {
		RestTemplate restTemplate = new RestTemplate();
		HttpHeaders headers = new HttpHeaders();
		MediaType type = MediaType.parseMediaType("application/json; charset=UTF-8");
		headers.setContentType(type);
		headers.add("Accept", MediaType.APPLICATION_JSON.toString());
		HttpEntity<String> formEntity = new HttpEntity<String>(
				JSON.toJSONString(param, SerializerFeature.DisableCircularReferenceDetect), headers);
		String result = restTemplate.postForObject(uri, formEntity, String.class);
		if (!result.equals(new String(result.getBytes("utf-8"), "utf-8"))) {

			return JSONObject.parseObject(new String(result.getBytes("ISO8859-1"), "utf-8"));
		} else {
			return JSONObject.parseObject(result);
		}
	}

}