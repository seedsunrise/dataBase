package cn.com.flaginfo.utils.vo;

import java.util.ArrayList;
import java.util.List;

/**
 * 查询某组织节点详情条件vo
 * 
 * @author lenovo
 *
 */
public class QueryGroupInfoVo {
	/**
	 * 租户ID(企业ID)
	 */
	private String tenementId;
	/**
	 * 组织ID集合
	 */
	private List<String> groupIds = new ArrayList<String>();
	/**
	 * 通讯录ID
	 */
	private String contactsId;
	/**
	 * 用户ID
	 */
	private String userId;

	public String getTenementId() {
		return tenementId;
	}

	public void setTenementId(String tenementId) {
		this.tenementId = tenementId;
	}

	public List<String> getGroupIds() {
		return groupIds;
	}

	public void setGroupIds(List<String> groupIds) {
		this.groupIds = groupIds;
	}

	public String getContactsId() {
		return contactsId;
	}

	public void setContactsId(String contactsId) {
		this.contactsId = contactsId;
	}

	public String getUserId() {
		return userId;
	}

	public void setUserId(String userId) {
		this.userId = userId;
	}
	
}
