package cn.com.flaginfo.model;

import java.io.Serializable;


/**
 * *<p>Title:树形公共类 </p>* 
	<p>Description: </p>* 
     @author liming
     @date 2016年8月16日
 */
public class BaseTreePO implements Serializable {
	
	private String id;
	
	private String pid;

	public String getId() {
		return id;
	}

	public void setId(String id) {
		this.id = id;
	}

	public String getPid() {
		return pid;
	}

	public void setPid(String pid) {
		this.pid = pid;
	}
	
	
	

}
