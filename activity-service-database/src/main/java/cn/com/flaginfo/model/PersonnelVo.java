package cn.com.flaginfo.model;

/**
 * 签到管理参数vo.
 * @author lenovo
 */
public class PersonnelVo {
	
	private int pageNo; //pageNo
	private int pageSize; //pageSize
	private String status; // int(1) DEFAULT NULL COMMENT '状态0指定报名，1报名，2签到，3签退，4取消报名',
	private String name; //  varchar(50) DEFAULT NULL COMMENT '参与人名',
	private String activityId; //活动管理.
	private String spId; //spid  如果没有手机号码，则通过spId调用api查询电话号码.
	public int getPageNo() {
		return pageNo;
	}
	public void setPageNo(int pageNo) {
		this.pageNo = pageNo;
	}
	public int getPageSize() {
		return pageSize;
	}
	public void setPageSize(int pageSize) {
		this.pageSize = pageSize;
	}
	public String getStatus() {
		return status;
	}
	public void setStatus(String status) {
		this.status = status;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getActivityId() {
		return activityId;
	}
	public void setActivityId(String activityId) {
		this.activityId = activityId;
	}
	public String getSpId() {
		return spId;
	}
	public void setSpId(String spId) {
		this.spId = spId;
	}
}
