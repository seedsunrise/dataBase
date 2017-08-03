package cn.com.flaginfo.model;
public class DictConfigData {

	/**
	*备注：编号；
	*长度：50；
	*精度：0；
	*数据库类型：VARCHAR；
	*是否可以为空：true；
	*/
	private	java.lang.String	id;


	/**
	*备注：对应配置id；
	*长度：50；
	*精度：0；
	*数据库类型：VARCHAR；
	*是否可以为空：true；
	*/
	private	java.lang.String	refId;


	/**
	*备注：对应字段类型ID；
	*长度：50；
	*精度：0；
	*数据库类型：VARCHAR；
	*是否可以为空：true；
	*/
	private	java.lang.String	refFieldId;


	/**
	*备注：字段值；
	*长度：2147483647；
	*精度：0；
	*数据库类型：LONGTEXT；
	*是否可以为空：true；
	*/
	private	String	fieldValue;


	/**
	*备注：字段code；
	*长度：200；
	*精度：0；
	*数据库类型：VARCHAR；
	*是否可以为空：true；
	*/
	private	java.lang.String	fieldCode;


	/**
	*备注：字段名称；
	*长度：200；
	*精度：0；
	*数据库类型：VARCHAR；
	*是否可以为空：true；
	*/
	private	java.lang.String	fieldName;


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

	public	void	setRefId(java.lang.String	refId){
		this.refId=refId;
	}

	public	java.lang.String	getRefId(){
		return this.refId;
	}
	public	void	setRefFieldId(java.lang.String	refFieldId){
		this.refFieldId=refFieldId;
	}

	public	java.lang.String	getRefFieldId(){
		return this.refFieldId;
	}
	public	void	setFieldValue(String	fieldValue){
		this.fieldValue=fieldValue;
	}

	public	String	getFieldValue(){
		return this.fieldValue;
	}
	public	void	setFieldCode(java.lang.String	fieldCode){
		this.fieldCode=fieldCode;
	}

	public	java.lang.String	getFieldCode(){
		return this.fieldCode;
	}
	public	void	setFieldName(java.lang.String	fieldName){
		this.fieldName=fieldName;
	}

	public	java.lang.String	getFieldName(){
		return this.fieldName;
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
