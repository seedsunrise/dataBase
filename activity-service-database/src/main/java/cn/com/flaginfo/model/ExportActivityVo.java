package cn.com.flaginfo.model;

public class ExportActivityVo {
	
	
	private String id;
	private String organizationName;
	private String endTime;
	private String actType;
	private String isOver;
	private String isOffset;
	private String countyName;
	private String fullPath;
	private String groupName;
	private String groupId;
	private String systemScore;
	private String ffcdScore;
	private String picScore;
	private String totalScore;

	public String getFfcdScore() {
		return ffcdScore;
	}

	public void setFfcdScore(String ffcdScore) {
		this.ffcdScore = ffcdScore;
	}

	public String getPicScore() {
		return picScore;
	}

	public void setPicScore(String picScore) {
		this.picScore = picScore;
	}

	public String getTotalScore() {
		return totalScore;
	}

	public void setTotalScore(String totalScore) {
		this.totalScore = totalScore;
	}

	public String getId() {
		return id;
	}
	public void setId(String id) {
		this.id = id;
	}
	public String getOrganizationName() {
		return organizationName;
	}
	public void setOrganizationName(String organizationName) {
		this.organizationName = organizationName;
	}

	public String getSystemScore() {
		return systemScore;
	}

	public void setSystemScore(String systemScore) {
		this.systemScore = systemScore;
	}

	public String getEndTime() {
		return endTime;
	}
	public void setEndTime(String endTime) {
		this.endTime = endTime;
	}
	public String getActType() {
		switch (actType) {
		case "1":
			return "室外活动";
		case "2":
			return "室内活动";
		default:
			return "-";
		}
	}
	public void setActType(String actType) {
		this.actType = actType;
	}
	public String getIsOver() {
		switch (isOver) {
		case "1":
			return "是";
		case "2":
			return "否";
		case "0":
			return "否";
		default:
			return "-";
		}
	}
	public void setIsOver(String isOver) {
		this.isOver = isOver;
	}
	public String getIsOffset() {
		if(isOffset==null){
			isOffset="";
		}
		switch (isOffset) {
		case "1":
			return "否";
		case "0":
			return "是";
		default:
			return "-";
		}
	}
	public void setIsOffset(String isOffset) {
		this.isOffset = isOffset;
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
	public String getGroupName() {
		return groupName;
	}
	public void setGroupName(String groupName) {
		this.groupName = groupName;
	}
	public String getGroupId() {
		return groupId;
	}
	public void setGroupId(String groupId) {
		this.groupId = groupId;
	}
	
}
