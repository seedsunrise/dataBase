package cn.com.flaginfo.model;

import java.util.Date;


/**
 * 
 *<p>Title:评分类 </p>* 
 *<p>Description: </p>*
 *<p>Company:flaginfo </p> 
 * @author liming
 * @date 2017年6月11日
 */
public class EvaluateRecordPO {
	
	//字段注释如不懂，见mysql 表详情
	
	private String id;
	
	private String activityId;
	
	private String updateUserId;
	
	private String updateUserName;
	
	private Date createTime;
	
	private Date updateTime;
	
	private Integer systemScore;
	
	private Integer ffcdScore;
	
	private Integer  picScore;
	
	private Integer totalScore;
	
	private String message;
	
	
	
	public String getMessage() {
		return message;
	}

	public void setMessage(String message) {
		this.message = message;
	}

	public  static EvaluateRecordPO initEvaRecord(){
		
		EvaluateRecordPO po=new EvaluateRecordPO();
		po.setFfcdScore(0);
		po.setPicScore(0);
		po.setSystemScore(0);
		po.setTotalScore(0);
		
		return po;
	}

	public String getId() {
		return id;
	}

	public void setId(String id) {
		this.id = id;
	}

	public String getActivityId() {
		return activityId;
	}

	public void setActivityId(String activityId) {
		this.activityId = activityId;
	}

	public String getUpdateUserId() {
		return updateUserId;
	}

	public void setUpdateUserId(String updateUserId) {
		this.updateUserId = updateUserId;
	}

	public String getUpdateUserName() {
		return updateUserName;
	}

	public void setUpdateUserName(String updateUserName) {
		this.updateUserName = updateUserName;
	}

	public Date getCreateTime() {
		return createTime;
	}

	public void setCreateTime(Date createTime) {
		this.createTime = createTime;
	}

	public Date getUpdateTime() {
		return updateTime;
	}

	public void setUpdateTime(Date updateTime) {
		this.updateTime = updateTime;
	}

	public Integer getSystemScore() {
		return systemScore;
	}

	public void setSystemScore(Integer systemScore) {
		this.systemScore = systemScore;
	}

	public Integer getFfcdScore() {
		return ffcdScore;
	}

	public void setFfcdScore(Integer ffcdScore) {
		this.ffcdScore = ffcdScore;
	}

	public Integer getPicScore() {
		return picScore;
	}

	public void setPicScore(Integer picScore) {
		this.picScore = picScore;
	}

	public Integer getTotalScore() {
		return totalScore;
	}

	public void setTotalScore(Integer totalScore) {
		this.totalScore = totalScore;
	}
	
	public void convertToZero(){
		
		if(this.ffcdScore==null){
			this.ffcdScore=0;
		}
		if(this.picScore==null){
			this.picScore=0;
		}
		if(this.systemScore==null){
			this.systemScore=0;
		}
		if(this.totalScore==null){
			this.totalScore=0;
		}
	}
	
	
	

}
