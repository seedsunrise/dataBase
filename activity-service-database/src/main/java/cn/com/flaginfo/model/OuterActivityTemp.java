package cn.com.flaginfo.model;

import java.math.BigDecimal;
import java.util.Date;
import java.util.List;

import com.fasterxml.jackson.annotation.JsonFormat;

public class OuterActivityTemp {
	private String id;

	private String orgId;

	private String activityName;

	private Date startTime;

	private Integer attendNum;

	private String contactsName;

	private String contactsMdn;

	private String location;

	private BigDecimal locationLang;

	private BigDecimal locationLat;

	private String description;

	private Date createTime;

	/**
	 * 新建的室外活动临时图片信息
	 */
	private List<RecordReportPicTemp> images;

	public String getId() {
		return id;
	}

	public void setId(String id) {
		this.id = id == null ? null : id.trim();
	}

	public String getOrgId() {
		return orgId;
	}

	public void setOrgId(String orgId) {
		this.orgId = orgId == null ? null : orgId.trim();
	}

	public String getActivityName() {
		return activityName;
	}

	public void setActivityName(String activityName) {
		this.activityName = activityName == null ? null : activityName.trim();
	}

	public Date getStartTime() {
		return startTime;
	}

	@JsonFormat(pattern = "yyyy-MM-dd HH:mm:ss", timezone = "GMT+08:00")
	public void setStartTime(Date startTime) {
		this.startTime = startTime;
	}

	public Integer getAttendNum() {
		return attendNum;
	}

	public void setAttendNum(Integer attendNum) {
		this.attendNum = attendNum;
	}

	public String getContactsName() {
		return contactsName;
	}

	public void setContactsName(String contactsName) {
		this.contactsName = contactsName == null ? null : contactsName.trim();
	}

	public String getContactsMdn() {
		return contactsMdn;
	}

	public void setContactsMdn(String contactsMdn) {
		this.contactsMdn = contactsMdn == null ? null : contactsMdn.trim();
	}

	public String getLocation() {
		return location;
	}

	public void setLocation(String location) {
		this.location = location == null ? null : location.trim();
	}

	public BigDecimal getLocationLang() {
		return locationLang;
	}

	public void setLocationLang(BigDecimal locationLang) {
		this.locationLang = locationLang;
	}

	public BigDecimal getLocationLat() {
		return locationLat;
	}

	public void setLocationLat(BigDecimal locationLat) {
		this.locationLat = locationLat;
	}

	public String getDescription() {
		return description;
	}

	public void setDescription(String description) {
		this.description = description == null ? null : description.trim();
	}

	public Date getCreateTime() {
		return createTime;
	}

	@JsonFormat(pattern = "yyyy-MM-dd HH:mm:ss", timezone = "GMT+08:00")
	public void setCreateTime(Date createTime) {
		this.createTime = createTime;
	}

	public List<RecordReportPicTemp> getImages() {
		return images;
	}

	public void setImages(List<RecordReportPicTemp> images) {
		this.images = images;
	}

}