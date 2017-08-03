package cn.com.flaginfo.model;

import java.text.SimpleDateFormat;

import com.alibaba.fastjson.annotation.JSONField;

public class Personnel {

	/**
	*备注：；
	*长度：48；
	*精度：0；
	*数据库类型：VARCHAR；
	*是否可以为空：false；
	*/
	private	java.lang.String	id;


	/**
	*备注：；
	*长度：48；
	*精度：0；
	*数据库类型：VARCHAR；
	*是否可以为空：true；
	*/
	private	java.lang.String	activityId;


	/**
	*备注：；
	*长度：50；
	*精度：0；
	*数据库类型：VARCHAR；
	*是否可以为空：true；
	*/
	private	java.lang.String	name;


	/**
	*备注：；
	*长度：50；
	*精度：0；
	*数据库类型：VARCHAR；
	*是否可以为空：true；
	*/
	private	java.lang.String	userId;


	/**
	*备注：；
	*长度：10；
	*精度：0；
	*数据库类型：INT；
	*是否可以为空：true；
	*/
	private	java.lang.Integer	attendType;


	/**
	*备注：；
	*长度：50；
	*精度：0；
	*数据库类型：VARCHAR；
	*是否可以为空：true；
	*/
	private	java.lang.String	departName;


	/**
	*备注：；
	*长度：50；
	*精度：0；
	*数据库类型：VARCHAR；
	*是否可以为空：true；
	*/
	private	java.lang.String	departId;


	/**
	*备注：；
	*长度：10；
	*精度：0；
	*数据库类型：INT；
	*是否可以为空：true；
	*/
	private	java.lang.Integer	status;


	/**
	*备注：；
	*长度：10；
	*精度：0；
	*数据库类型：INT；
	*是否可以为空：true；
	*/
	private	java.lang.Integer	delFlag;


	private String mobile;
	/**
	*备注：；
	*长度：19；
	*精度：0；
	*数据库类型：DATETIME；
	*是否可以为空：true；
	*/
	@JSONField(format="yyyy-MM-dd HH:mm")
	private	java.util.Date	createTime;
	@JSONField(format="yyyy-MM-dd HH:mm")
	private	java.util.Date	updateTime;
	
	private String mdn; //用户手机号码.

	public	void	setActivityId(java.lang.String	activityId){
		this.activityId=activityId;
	}

	public	java.lang.String	getActivityId(){
		return this.activityId;
	}
	public	void	setName(java.lang.String	name){
		this.name=name;
	}

	public	java.lang.String	getName(){
		return this.name;
	}
	public	void	setUserId(java.lang.String	userId){
		this.userId=userId;
	}

	public	java.lang.String	getUserId(){
		return this.userId;
	}
	public	void	setAttendType(java.lang.Integer	attendType){
		this.attendType=attendType;
	}

	public	java.lang.Integer	getAttendType(){
		return this.attendType;
	}
	public	void	setDepartName(java.lang.String	departName){
		this.departName=departName;
	}

	public	java.lang.String	getDepartName(){
		return this.departName;
	}
	public	void	setDepartId(java.lang.String	departId){
		this.departId=departId;
	}

	public	java.lang.String	getDepartId(){
		return this.departId;
	}
	public	void	setStatus(java.lang.Integer	status){
		this.status=status;
	}

	public	java.lang.Integer	getStatus(){
		return this.status;
	}
	public	void	setDelFlag(java.lang.Integer	delFlag){
		this.delFlag=delFlag;
	}

	public	java.lang.Integer	getDelFlag(){
		return this.delFlag;
	}
	public	void	setCreateTime(java.util.Date	createTime){
		this.createTime=createTime;
	}

	/*public	java.util.Date	getCreateTime(){
		return this.createTime;
	}*/
	
	public String getCreateTime(){
		return this.createTime != null ? 
				new SimpleDateFormat("yyyy-MM-dd HH:mm:ss").format(createTime):"";
	}

	public java.lang.String getId() {
		return id;
	}

	public void setId(java.lang.String id) {
		this.id = id;
	}

	public String getMobile() {
		return mobile;
	}

	public void setMobile(String mobile) {
		this.mobile = mobile;
	}

	public String getUpdateTime() {
		return this.updateTime != null ? 
				new SimpleDateFormat("yyyy-MM-dd HH:mm:ss").format(updateTime):"";
	}

	public void setUpdateTime(java.util.Date updateTime) {
		this.updateTime = updateTime;
	}

	public String getMdn() {
		return mdn;
	}

	public void setMdn(String mdn) {
		this.mdn = mdn;
	}
	
}
