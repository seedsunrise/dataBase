package cn.com.flaginfo.model;

public class OrgCountBo {

	private Long month1No; //第一个月人数数量
	
	private Long month2No; //第二个月人数数量
	
	private String departId; //组织结点Id
	
	private String departName;// 组织节点名字.
	
	private Long month1Count; //室外第一个月活动次数
	
	private Long month2Count;//室外第一个月活动次数
	
	private Long times; //次数.
	
	private String userId; //人id.
	
	private String keyId;
	

	public Long getMonth1No() {
		return month1No==null?0L:month1No;
	}

	public void setMonth1No(Long month1No) {
		this.month1No = month1No;
	}

	public Long getMonth2No() {
		return month2No==null?0L:month2No;
	}

	public void setMonth2No(Long month2No) {
		this.month2No = month2No;
	}

	public String getDepartId() {
		return departId;
	}

	public void setDepartId(String departId) {
		this.departId = departId;
	}

	public String getDepartName() {
		return departName;
	}

	public void setDepartName(String departName) {
		this.departName = departName;
	}

	public Long getMonth1Count() {
		return month1Count==null?0L:month1Count;
	}

	public void setMonth1Count(Long month1Count) {
		this.month1Count = month1Count;
	}

	public Long getMonth2Count() {
		return month2Count==null?0L:month2Count;
	}

	public void setMonth2Count(Long month2Count) {
		this.month2Count = month2Count;
	}

	public Long getTimes() {
		return times;
	}

	public void setTimes(Long times) {
		this.times = times==null?0L:times;
	}

	public String getUserId() {
		return userId;
	}

	public void setUserId(String userId) {
		this.userId = userId;
	}

	public String getKeyId() {
		return keyId;
	}

	public void setKeyId(String keyId) {
		this.keyId = keyId;
	}
	
}
