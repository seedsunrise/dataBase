package cn.com.flaginfo.utils;


import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

import org.apache.commons.collections.CollectionUtils;

import cn.com.flaginfo.model.BaseTreePO;


/**
 * *<p>Title:树形util工具 </p>* 
	<p>Description: </p>* 
     @author liming
     @date 2016年8月16日
 */
public class TreeUtil<T extends BaseTreePO> {
     
    private List<T> returnList = new ArrayList<T>();
     
    /**
     * 根据父节点的ID获取所有子节点
     * @param list 分类表
     * @param typeId 传入的父节点ID
     * @return String
     */
    public Integer getChildNodes(List<T> list, String typeId) {
        if(list == null && typeId == null) return 0;
        for (T t:list) {
            // 一、根据传入的某个父节点ID,遍历该父节点的所有子节点
            if ( typeId.equals(t.getId())) {
                recursionFn(list, t);
            }
            // 二、遍历所有的父节点下的所有子节点
            /*if (node.getParentId()==0) {
                recursionFn(list, node);
            }*/
        }
        Integer size=returnList.size();
        if(size==1&&returnList.get(0).getId().equals(typeId)){
        	returnList.clear();
        	return 0;
        }
        returnList.clear();
        return size;
    }
    
    
    public List<T> getChildNodesList(List<T> list, String typeId) {
    	returnList.clear();
        if(list == null && typeId == null) return null;
        for (T t:list) {
            // 一、根据传入的某个父节点ID,遍历该父节点的所有子节点
            if ( typeId.equals(t.getId())) {
                recursionFn(list, t);
            }
            // 二、遍历所有的父节点下的所有子节点
            /*if (node.getParentId()==0) {
                recursionFn(list, node);
            }*/
        }
        return returnList;
    }
    
    
    
    /**
     * 
     * @param list
     * @param typeId
     * @param flag true返回自己所在层级，false 不返回自己
     * @return
     */
    public List<T> getChildNodesList(List<T> list, String typeId,Boolean flag) {
    	returnList.clear();
        if(list == null && typeId == null) return null;
        for (T t:list) {
            // 一、根据传入的某个父节点ID,遍历该父节点的所有子节点
            if ( typeId.equals(t.getId())) {
            	if(flag){
            	returnList.add(t);
            	}
                recursionFn(list, t);
            }
            // 二、遍历所有的父节点下的所有子节点
            /*if (node.getParentId()==0) {
                recursionFn(list, node);
            }*/
        }
        return returnList;
    }

    public List<String> getChildNodesListWithParentId(List<T> list, String typeId) {
        returnList.clear();
        List<String> groups = new ArrayList<>();
        if(list == null && typeId == null) return null;
        for (T t:list) {
            // 一、根据传入的某个父节点ID,遍历该父节点的所有子节点
            if ( typeId.equals(t.getId())) {
                recursionFn(list, t);
            }
            // 二、遍历所有的父节点下的所有子节点
            /*if (node.getParentId()==0) {
                recursionFn(list, node);
            }*/
        }
        if(CollectionUtils.isNotEmpty(returnList)){
            for (T t:returnList){
                groups.add(t.getId());
            }
        }
        if(!groups.contains(typeId)){
            groups.add(0,typeId);
        }
        return groups;
    }
    
    
    public List<T> childrenNodesList(List<T> list, String typeId) {
    	returnList.clear();
        if(list == null && typeId == null) return null;
        for (T t:list) {
            // 一、根据传入的某个父节点ID,遍历该父节点的所有子节点
            if ( typeId.equals(t.getId())) {
            	recursionFnSelf(list, t);
            }
            // 二、遍历所有的父节点下的所有子节点
            /*if (node.getParentId()==0) {
                recursionFn(list, node);
            }*/
        }
        return returnList;
    }
     
    
    public List<T> childrenNodesListWithSelf(List<T> list, String typeId) {
    	returnList.clear();
        if(list == null && typeId == null) return null;
        for (T t:list) {
            // 一、根据传入的某个父节点ID,遍历该父节点的所有子节点
            if ( typeId.equals(t.getId())) {
            	recursionFnSelf(list, t);
            }
            // 二、遍历所有的父节点下的所有子节点
            /*if (node.getParentId()==0) {
                recursionFn(list, node);
            }*/
        }
        return returnList;
    }
    private void recursionFn(List<T> list, T node) {
     
        if (hasChild(list, node)) {// 判断是否有子节点
           // returnList.add(node.getId());
        	  // 得到子节点列表
        	List<T> childList = getChildList(list, node);
          for(T t:childList){
                recursionFn(list, t);
          }
            
        } else {
            returnList.add(node);
        }
    }
    
    private void recursionFnSelf(List<T> list, T node) {
        
        if (hasChild(list, node)) {// 判断是否有子节点
            returnList.add(node);
        	  // 得到子节点列表
        	List<T> childList = getChildList(list, node);
          for(T t:childList){
        	  recursionFnSelf(list, t);
          }
            
        } else {
            returnList.add(node);
        }
    }
    
    private void researchParents(List<T> list, T node){
    	
    	 if (hasParent(list, node)) {// 判断是否有父节点
             // returnList.add(node.getId());
          	  // 得到子节点列表
    		 T pNode=getParent(list, node);
    		 returnList.add(pNode);
    		 researchParents(list,pNode);
          } else {
             
        	  
          }
    }
     
    // 得到子节点列表
    private List<T> getChildList(List<T> list, T node) {
        List<T> nodeList = new ArrayList<T>();
        for(T t:list){
            if (t.getPid().equals( node.getId())) {
                nodeList.add(t);
            }
      }
        return nodeList;
    }
    
    
    // 得到子节点列表
    private  T  getParent(List<T> list, T node) {
        for(T t:list){
            if (t.getId().equals(node.getPid())) {
            	return t;
            }
      }
        return null;
    }
    
    public List<T> findParents(List<T> list, String nodeId){
    			returnList.clear();
    			if(list == null && nodeId == null) return null;
    			   for (T t:list) {
    		            // 一、根据传入的某个父节点ID,遍历该父节点的所有子节点
    		            if ( nodeId.equals(t.getId())) {
    		            	researchParents(list, t);
    		            }
    		            // 二、遍历所有的父节点下的所有子节点
    		            /*if (node.getParentId()==0) {
    		                recursionFn(list, node);
    		            }*/
    		        }
    	return returnList;
    }
    
    /**
     * 获取所有父节点ID
     * @param list
     * @param nodeId
     * @return
     */
    public List<String> findParentsString(List<T> list, String nodeId){
    	List<T> allParentList=findParents(list,nodeId);
    	if(CollectionUtils.isNotEmpty(allParentList)){
    		List<String> keyList=new ArrayList<String>(allParentList.size());
    		for(T obj:allParentList){
    			keyList.add(obj.getId());
        	}
    		return keyList;
    	}else{
    		return null;
    	}
    }
    
    
    
 
    // 判断是否有子节点
    private boolean hasChild(List<T> list, T node) {
        return getChildList(list, node).size() > 0 ? true : false;
    }
    
    private boolean hasParent(List<T> list, T node) {
        return getParent(list, node)!=null? true : false;
    }
     
     
}