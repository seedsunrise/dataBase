package cn.com.flaginfo.model;

public class Wechatbind {

	/**
	 * 备注：； 长度：48； 精度：0； 数据库类型：VARCHAR； 是否可以为空：true；
	 */
	private java.lang.String id;

	/**
	 * 备注：open_id； 长度：50； 精度：0； 数据库类型：VARCHAR； 是否可以为空：true；
	 */
	private java.lang.String openId;

	/**
	 * 备注：账号； 长度：200； 精度：0； 数据库类型：VARCHAR； 是否可以为空：true；
	 */
	private java.lang.String account;

	/**
	 * 备注：密码； 长度：200； 精度：0； 数据库类型：VARCHAR； 是否可以为空：true；
	 */
	private java.lang.String password;

	/**
	 * 备注：最近登录时间； 长度：19； 精度：0； 数据库类型：DATETIME； 是否可以为空：true；
	 */
	private java.util.Date lastLoginTime;

	/**
	 * 备注：创建时间； 长度：19； 精度：0； 数据库类型：DATETIME； 是否可以为空：true；
	 */
	private java.util.Date createTime;

	public void setOpenId(java.lang.String openId) {
		this.openId = openId;
	}

	public java.lang.String getOpenId() {
		return this.openId;
	}

	public void setAccount(java.lang.String account) {
		this.account = account;
	}

	public java.lang.String getAccount() {
		return this.account;
	}

	public void setPassword(java.lang.String password) {
		this.password = password;
	}

	public java.lang.String getPassword() {
		return this.password;
	}

	public void setLastLoginTime(java.util.Date lastLoginTime) {
		this.lastLoginTime = lastLoginTime;
	}

	public java.util.Date getLastLoginTime() {
		return this.lastLoginTime;
	}

	public void setCreateTime(java.util.Date createTime) {
		this.createTime = createTime;
	}

	public java.util.Date getCreateTime() {
		return this.createTime;
	}

	public java.lang.String getId() {
		return id;
	}

	public void setId(java.lang.String id) {
		this.id = id;
	}
}
