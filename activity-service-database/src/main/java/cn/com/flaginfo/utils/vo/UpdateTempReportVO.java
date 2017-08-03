package cn.com.flaginfo.utils.vo;

import java.util.ArrayList;
import java.util.List;

import cn.com.flaginfo.model.RecordReportPicTemp;

/**
 * 临时上报记录更新条件对象
 * 
 * @author lenovo
 *
 */
public class UpdateTempReportVO {
	/**
	 * 记录ID
	 */
	private String id;
	/**
	 * 上报记录信息
	 */
	private String recordInfo;
	/**
	 * 图片信息
	 */
	private List<RecordReportPicTemp> images = new ArrayList<RecordReportPicTemp>();
	/**
	 * 更新字段标记 0代表更新 recordInfo，1代表更images
	 */
	private Integer updateFiled;

	public String getId() {
		return id;
	}

	public void setId(String id) {
		this.id = id;
	}

	public String getRecordInfo() {
		return recordInfo;
	}

	public void setRecordInfo(String recordInfo) {
		this.recordInfo = recordInfo;
	}

	public List<RecordReportPicTemp> getImages() {
		return images;
	}

	public void setImages(List<RecordReportPicTemp> images) {
		this.images = images;
	}

	public Integer getUpdateFiled() {
		return updateFiled;
	}

	public void setUpdateFiled(Integer updateFiled) {
		this.updateFiled = updateFiled;
	}

}
