package cn.com.flaginfo.service.impl;


import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.concurrent.ConcurrentHashMap;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import cn.com.flaginfo.dao.DictMapper;
import cn.com.flaginfo.model.Dict;

@Component("dictUtil")
public class DictUtil {
    private static ConcurrentHashMap<String,List<Dict>> dictMap=new ConcurrentHashMap<String,List<Dict>>();
	@Autowired
	private DictMapper dictMapper;
	
	/**
	 * 容器启动后加载字典
	 */
	public void initDict(){
	   if(dictMap!=null){
		   dictMap = new ConcurrentHashMap<String,List<Dict>>();
		   setUpDictMap(dictMapper.getAllDict());
	   }   
	}
	
	
	
	private void setUpDictMap(List<Dict> allDict){
		 for(Dict dict : allDict){
			   List<Dict> dictList = dictMap.get(dict.getType());
			   if(dictList == null){
				   List<Dict> list=new ArrayList<Dict>();
				   list.add(dict);
				   dictMap.put(dict.getType(), list);
			   }else{
				   dictList.add(dict);
			   }
		   }
	}
    

    
    /**
     * 根据type查询字典
     * @param type
     * @return
     */
    public Map<String,List> getDictByTypes(String[] types){
    	Map<String,List> resultMap = new HashMap<String,List>();
    	for(String type : types){
    		List<Dict> dictlist = dictMap.get(type);
    		if(dictlist != null){
    			List reList = new ArrayList();
        		for(Dict dict : dictlist){
        			Map<String,String> keyValMap = new HashMap<String,String>();
        			keyValMap.put("key", dict.getCode());
        			keyValMap.put("value", dict.getValue());
        			keyValMap.put("id", dict.getId());
        			reList.add(keyValMap);
        		}
        		resultMap.put(type,reList);
    		}
    	}
    	return resultMap;
    }

    
    /**
     * 根据type和parentId查询子节点字典
     * @param type
     * @return
     */
	public Map<String, List> getDictByType(String type, String parentId) {
		Map<String, List> resultMap = new HashMap<String, List>();
		List<Dict> dictlist = dictMap.get(type);
		if (dictlist != null) {
			List reList = new ArrayList();
			for (Dict dict : dictlist) {
				if (dict.getParentId().equals(parentId)) {
					Map<String, String> keyValMap = new HashMap<String, String>();
					keyValMap.put("key", dict.getCode());
					keyValMap.put("value", dict.getValue());
					keyValMap.put("id", dict.getId());
					reList.add(keyValMap);
				}
			}
			resultMap.put(type, reList);
		}
		return resultMap;
	}
	
	 /**
     * 根据type和text查询code
     * @param type
     * @return
     */
	public String getDictCode(String type, String text) {
		List<Dict> dictlist = dictMap.get(type);
		if (dictlist != null) {
			for (Dict dict : dictlist) {
				if (dict.getValue().trim().equals(text)) {
					return dict.getCode();
				}
			}
		}
		return "";
	}
	
	public String getValue(String type,String code){
		List<Dict> dictlist = dictMap.get(type);
		if (dictlist != null) {
			for (Dict dict : dictlist) {
				if (dict.getCode().equals(code)) {
					return dict.getValue();
				}
			}
		}
		return "";
	}
	
	/**
     * 查询所有字典
     * @param type
     * @return
     */
	public ConcurrentHashMap<String,List<Dict>> getAllDict() {
		return dictMap;
	}
    
}