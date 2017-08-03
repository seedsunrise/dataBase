package cn.com.flaginfo.service;

import java.util.List;

import com.alibaba.fastjson.JSONObject;

public interface MemberService {
	
	Long MemberCount(String groupId);
	
	JSONObject MemberCount(List<String> groupIdList);

}
