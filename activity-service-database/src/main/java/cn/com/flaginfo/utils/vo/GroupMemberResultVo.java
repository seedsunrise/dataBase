package cn.com.flaginfo.utils.vo;
/**
 * 返回参与人员结果数信息
 * @author lenovo
 *
 */
public class GroupMemberResultVo {
	/**
	 * 人员记录ID
	 */
	private String id;
	/**
	 * 人员组织节点名称
	 */
	private String groupName;
	/**
	 * 人员挂在那个部门下的部门ID--groupId
	 */
	private String pid;
	/**
	 * 人员姓名
	 */
	private String name;
	/**
	 * 用户ID
	 */
	private String userId;
	/**
	 * 标记是否是人，用于区分组织和人员信息
	 */
	private Integer personFlag=1;

	public String getId() {
		return id;
	}

	public void setId(String id) {
		this.id = id;
	}

	public String getGroupName() {
		return groupName;
	}

	public void setGroupName(String groupName) {
		this.groupName = groupName;
	}

	public String getPid() {
		return pid;
	}

	public void setPid(String pid) {
		this.pid = pid;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getUserId() {
		return userId;
	}

	public void setUserId(String userId) {
		this.userId = userId;
	}

	public Integer getPersonFlag() {
		return personFlag;
	}

	public void setPersonFlag(Integer personFlag) {
		this.personFlag = personFlag;
	}
	
}
