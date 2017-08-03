package cn.com.flaginfo.model;

/**
 * 未开展活动的党支部..
 * @author lenovo .
 */
public class NotBeginOrgVo {
	
	private String orgName; //党支部名字。
	private String countryName; // 县区名字。
	private String fullPath; //党委结构路径.
	private String groupId;
	public String getOrgName() {
		return orgName;
	}
	public void setOrgName(String orgName) {
		this.orgName = orgName;
	}
	public String getCountryName() {
		return countryName;
	}
	public void setCountryName(String countryName) {
		this.countryName = countryName;
	}
	public String getFullPath() {
		return fullPath;
	}
	public void setFullPath(String fullPath) {
		this.fullPath = fullPath;
	}
	public String getGroupId() {
		return groupId;
	}
	public void setGroupId(String groupId) {
		this.groupId = groupId;
	}
}
