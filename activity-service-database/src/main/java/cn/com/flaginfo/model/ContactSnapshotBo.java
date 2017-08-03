package cn.com.flaginfo.model;

/**
 * 组织节点信息中间表.
 * @author lenovo .
 */
public class ContactSnapshotBo {
	
	private String groupId; 
	private String countyName; //区县名称.
	private String fullPath; //通讯录全路径
	private String pid;
	private String groupName; //groupName

	public String getId() {
		return id;
	}

	public void setId(String id) {
		this.id = id;
	}

	private String id;
	public String getGroupId() {
		return groupId;
	}
	public void setGroupId(String groupId) {
		this.groupId = groupId;
	}
	public String getCountyName() {
		return countyName;
	}
	public void setCountyName(String countyName) {
		this.countyName = countyName;
	}
	public String getFullPath() {
		return fullPath;
	}
	public void setFullPath(String fullPath) {
		this.fullPath = fullPath;
	}
	public String getPid() {
		return pid;
	}
	public void setPid(String pid) {
		this.pid = pid;
	}
	public String getGroupName() {
		return groupName==null?"":groupName;
	}
	public void setGroupName(String groupName) {
		this.groupName = groupName;
	}
}
