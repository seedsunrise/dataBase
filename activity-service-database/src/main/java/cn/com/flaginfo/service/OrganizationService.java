package cn.com.flaginfo.service;

public interface OrganizationService {
	
	/**
	 * 
	 * desc:搜索当前节点的父节点ID
	 * @param orgId
	 * @return
	 * @author:liming
	 * @date:2017年6月15日
	 */
	String getParentOrg(String orgId);

}
