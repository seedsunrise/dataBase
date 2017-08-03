package cn.com.flaginfo.utils.vo;

import java.util.ArrayList;
import java.util.List;

/**
 * 新增标签VO数据对象
 * 
 * @author lenovo
 *
 */
public class AddLabelVO {
	/**
	 * 标签ID
	 */
	private String id;
	/**
	 * 企业ID
	 */
	private String spid;
	/**
	 * 标签名称
	 */
	private String labelName;
	/**
	 * 关联支部ID以及支部名称集合
	 */
	private List<GroupListVo> groupIdAndNameList = new ArrayList<GroupListVo>();
	/**
	 * 标签创建者
	 */
	private String creater;

	public String getSpid() {
		return spid;
	}

	public void setSpid(String spid) {
		this.spid = spid;
	}

	public String getLabelName() {
		return labelName;
	}

	public void setLabelName(String labelName) {
		this.labelName = labelName;
	}

	public List<GroupListVo> getGroupIdAndNameList() {
		return groupIdAndNameList;
	}

	public void setGroupIdAndNameList(List<GroupListVo> groupIdAndNameList) {
		this.groupIdAndNameList = groupIdAndNameList;
	}

	public String getCreater() {
		return creater;
	}

	public void setCreater(String creater) {
		this.creater = creater;
	}

	public String getId() {
		return id;
	}

	public void setId(String id) {
		this.id = id;
	}
}
