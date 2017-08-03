package cn.com.flaginfo.utils.vo;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

public class QueryMyActivityListVo {
	/**
	 * 租户ID(企业ID)
	 */
	private String tenementId;
	/**
	 * 组织ID集合
	 */
	private List<String> organizationIds = new ArrayList<String>();
	/**
	 * 通讯录ID
	 */
	private String contactsId;
	/**
	 * 登录用户ID
	 */
	private String userId;

	/**
	 * 本组织以及下级组织ID集合
	 */
	private Set<String> organizationIdList = new HashSet<String>();

	/**
	 * 类型ID
	 */
	private List<String> typeIds = new ArrayList<String>();
	/**
	 * 活动类别 1普通活动2定时活动
	 */
	private Integer actType;
	/**
	 * 默认页码
	 */
	private Integer pageNo = 1;
	/**
	 * 默认页大小
	 */
	private Integer pageSize = 10;
	/**
	 * 起始记录索引
	 */
	private Integer startNum = 0;
	/**
	 * 是否查询全部数据
	 */
	private Boolean isAll = false;

	public String getTenementId() {
		return tenementId;
	}

	public void setTenementId(String tenementId) {
		this.tenementId = tenementId;
	}

	public List<String> getOrganizationIds() {
		return organizationIds;
	}

	public void setOrganizationIds(List<String> organizationIds) {
		this.organizationIds = organizationIds;
	}

	public Integer getActType() {
		return actType;
	}

	public void setActType(Integer actType) {
		this.actType = actType;
	}

	public String getUserId() {
		return userId;
	}

	public void setUserId(String userId) {
		this.userId = userId;
	}

	public Integer getPageNo() {
		return pageNo;
	}

	public void setPageNo(Integer pageNo) {
		this.pageNo = pageNo;
	}

	public Integer getPageSize() {
		return pageSize;
	}

	public void setPageSize(Integer pageSize) {
		this.pageSize = pageSize;
	}

	public Integer getStartNum() {
		return startNum;
	}

	public void setStartNum(Integer startNum) {
		this.startNum = startNum;
	}

	public Boolean getIsAll() {
		return isAll;
	}

	public void setIsAll(Boolean isAll) {
		this.isAll = isAll;
	}

	public Set<String> getOrganizationIdList() {
		return organizationIdList;
	}

	public void setOrganizationIdList(Set<String> organizationIdList) {
		this.organizationIdList = organizationIdList;
	}

	public String getContactsId() {
		return contactsId;
	}

	public void setContactsId(String contactsId) {
		this.contactsId = contactsId;
	}

	public List<String> getTypeIds() {
		return typeIds;
	}

	public void setTypeIds(List<String> typeIds) {
		this.typeIds = typeIds;
	}

}
