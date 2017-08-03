package cn.com.flaginfo.model;

import java.util.ArrayList;
import java.util.List;

public class RecordReportTemp {
	private String id;

	private String activityId;

	private String recordInfo;

	private List<RecordReportPicTemp> images = new ArrayList<RecordReportPicTemp>();

	public String getId() {
		return id;
	}

	public void setId(String id) {
		this.id = id == null ? null : id.trim();
	}

	public String getActivityId() {
		return activityId;
	}

	public void setActivityId(String activityId) {
		this.activityId = activityId == null ? null : activityId.trim();
	}

	public String getRecordInfo() {
		return recordInfo;
	}

	public void setRecordInfo(String recordInfo) {
		this.recordInfo = recordInfo == null ? null : recordInfo.trim();
	}

	public List<RecordReportPicTemp> getImages() {
		return images;
	}

	public void setImages(List<RecordReportPicTemp> images) {
		this.images = images;
	}

}