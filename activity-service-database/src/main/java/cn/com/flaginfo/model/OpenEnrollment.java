package cn.com.flaginfo.model;
public class OpenEnrollment {

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
	*长度：10；
	*精度：0；
	*数据库类型：INT；
	*是否可以为空：true；
	*/
	private	java.lang.Integer	openRange;


	/**
	*备注：；
	*长度：100；
	*精度：0；
	*数据库类型：VARCHAR；
	*是否可以为空：true；
	*/
	private	java.lang.String	organizationId;


	/**
	*备注：；
	*长度：100；
	*精度：0；
	*数据库类型：VARCHAR；
	*是否可以为空：true；
	*/
	private	java.lang.String	organizationName;


	/**
	*备注：；
	*长度：10；
	*精度：0；
	*数据库类型：INT；
	*是否可以为空：true；
	*/
	private	java.lang.Integer	numLimit;


	/**
	*备注：；
	*长度：10；
	*精度：0；
	*数据库类型：INT；
	*是否可以为空：true；
	*/
	private	java.lang.Integer	delFlag;


	/**
	*备注：；
	*长度：19；
	*精度：0；
	*数据库类型：DATETIME；
	*是否可以为空：true；
	*/
	private	java.util.Date	createTime;


	/**
	*备注：；
	*长度：50；
	*精度：0；
	*数据库类型：VARCHAR；
	*是否可以为空：true；
	*/
	private	java.lang.String	creater;

	public	void	setActivityId(java.lang.String	activityId){
		this.activityId=activityId;
	}

	public	java.lang.String	getActivityId(){
		return this.activityId;
	}
	public	void	setOpenRange(java.lang.Integer	openRange){
		this.openRange=openRange;
	}

	public	java.lang.Integer	getOpenRange(){
		return this.openRange;
	}
	public	void	setOrganizationId(java.lang.String	organizationId){
		this.organizationId=organizationId;
	}

	public	java.lang.String	getOrganizationId(){
		return this.organizationId;
	}
	public	void	setOrganizationName(java.lang.String	organizationName){
		this.organizationName=organizationName;
	}

	public	java.lang.String	getOrganizationName(){
		return this.organizationName;
	}
	public	void	setNumLimit(java.lang.Integer	numLimit){
		this.numLimit=numLimit;
	}

	public	java.lang.Integer	getNumLimit(){
		return this.numLimit;
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

	public	java.util.Date	getCreateTime(){
		return this.createTime;
	}
	public	void	setCreater(java.lang.String	creater){
		this.creater=creater;
	}

	public	java.lang.String	getCreater(){
		return this.creater;
	}

	public java.lang.String getId() {
		return id;
	}

	public void setId(java.lang.String id) {
		this.id = id;
	}
}
