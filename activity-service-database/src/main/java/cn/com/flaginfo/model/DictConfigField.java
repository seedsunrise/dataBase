package cn.com.flaginfo.model;
public class DictConfigField {

	/**
	*备注：编号；
	*长度：50；
	*精度：0；
	*数据库类型：VARCHAR；
	*是否可以为空：true；
	*/
	private	java.lang.String	id;


	/**
	*备注：；
	*长度：48；
	*精度：0；
	*数据库类型：VARCHAR；
	*是否可以为空：true；
	*/
	private	java.lang.String	businessId;


	/**
	*备注：；
	*长度：100；
	*精度：0；
	*数据库类型：VARCHAR；
	*是否可以为空：true；
	*/
	private	java.lang.String	bizCode;


	/**
	*备注：字段类型；
	*长度：50；
	*精度：0；
	*数据库类型：VARCHAR；
	*是否可以为空：true；
	*/
	private	java.lang.String	fieldType;


	/**
	*备注：字段选项,对应字典表的code；
	*长度：50；
	*精度：0；
	*数据库类型：VARCHAR；
	*是否可以为空：true；
	*/
	private	java.lang.String	fieldDict;


	/**
	*备注：字段名称；
	*长度：200；
	*精度：0；
	*数据库类型：VARCHAR；
	*是否可以为空：true；
	*/
	private	java.lang.String	fieldName;


	/**
	*备注：字段code；
	*长度：200；
	*精度：0；
	*数据库类型：VARCHAR；
	*是否可以为空：true；
	*/
	private	java.lang.String	fieldCode;


	/**
	*备注：删除标示：0正常1删除；
	*长度：3；
	*精度：0；
	*数据库类型：VARCHAR；
	*是否可以为空：true；
	*/
	private	java.lang.String	isDel;


	/**
	*备注：创建时间；
	*长度：19；
	*精度：0；
	*数据库类型：DATETIME；
	*是否可以为空：true；
	*/
	private	java.util.Date	createTime;


	/**
	*备注：创建人；
	*长度：20；
	*精度：0；
	*数据库类型：VARCHAR；
	*是否可以为空：true；
	*/
	private	java.lang.String	createUser;


	/**
	*备注：创建人id；
	*长度：50；
	*精度：0；
	*数据库类型：VARCHAR；
	*是否可以为空：true；
	*/
	private	java.lang.String	createId;


	/**
	*备注：更新时间；
	*长度：19；
	*精度：0；
	*数据库类型：DATETIME；
	*是否可以为空：true；
	*/
	private	java.util.Date	updateTime;


	/**
	*备注：更新人；
	*长度：20；
	*精度：0；
	*数据库类型：VARCHAR；
	*是否可以为空：true；
	*/
	private	java.lang.String	updateUser;


	/**
	*备注：创建人id；
	*长度：50；
	*精度：0；
	*数据库类型：VARCHAR；
	*是否可以为空：true；
	*/
	private	java.lang.String	updateId;

	public	void	setBusinessId(java.lang.String	businessId){
		this.businessId=businessId;
	}

	public	java.lang.String	getBusinessId(){
		return this.businessId;
	}
	public	void	setBizCode(java.lang.String	bizCode){
		this.bizCode=bizCode;
	}

	public	java.lang.String	getBizCode(){
		return this.bizCode;
	}
	public	void	setFieldType(java.lang.String	fieldType){
		this.fieldType=fieldType;
	}

	public	java.lang.String	getFieldType(){
		return this.fieldType;
	}
	public	void	setFieldDict(java.lang.String	fieldDict){
		this.fieldDict=fieldDict;
	}

	public	java.lang.String	getFieldDict(){
		return this.fieldDict;
	}
	public	void	setFieldName(java.lang.String	fieldName){
		this.fieldName=fieldName;
	}

	public	java.lang.String	getFieldName(){
		return this.fieldName;
	}
	public	void	setFieldCode(java.lang.String	fieldCode){
		this.fieldCode=fieldCode;
	}

	public	java.lang.String	getFieldCode(){
		return this.fieldCode;
	}
	public	void	setIsDel(java.lang.String	isDel){
		this.isDel=isDel;
	}

	public	java.lang.String	getIsDel(){
		return this.isDel;
	}
	public	void	setCreateTime(java.util.Date	createTime){
		this.createTime=createTime;
	}

	public	java.util.Date	getCreateTime(){
		return this.createTime;
	}
	public	void	setCreateUser(java.lang.String	createUser){
		this.createUser=createUser;
	}

	public	java.lang.String	getCreateUser(){
		return this.createUser;
	}
	public	void	setCreateId(java.lang.String	createId){
		this.createId=createId;
	}

	public	java.lang.String	getCreateId(){
		return this.createId;
	}
	public	void	setUpdateTime(java.util.Date	updateTime){
		this.updateTime=updateTime;
	}

	public	java.util.Date	getUpdateTime(){
		return this.updateTime;
	}
	public	void	setUpdateUser(java.lang.String	updateUser){
		this.updateUser=updateUser;
	}

	public	java.lang.String	getUpdateUser(){
		return this.updateUser;
	}
	public	void	setUpdateId(java.lang.String	updateId){
		this.updateId=updateId;
	}

	public	java.lang.String	getUpdateId(){
		return this.updateId;
	}

	public java.lang.String getId() {
		return id;
	}

	public void setId(java.lang.String id) {
		this.id = id;
	}
}
