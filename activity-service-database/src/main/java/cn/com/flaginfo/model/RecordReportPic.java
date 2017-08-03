package cn.com.flaginfo.model;
public class RecordReportPic {

	/**
	*备注：；
	*长度：48；
	*精度：0；
	*数据库类型：VARCHAR；
	*是否可以为空：false；
	*/
	private	java.lang.String	id;


	public java.lang.String getId() {
		return id;
	}

	public void setId(java.lang.String id) {
		this.id = id;
	}

	/**
	*备注：活动记录ID；
	*长度：48；
	*精度：0；
	*数据库类型：VARCHAR；
	*是否可以为空：true；
	*/
	private	java.lang.String	reportId;


	/**
	*备注：图片地址；
	*长度：100；
	*精度：0；
	*数据库类型：VARCHAR；
	*是否可以为空：true；
	*/
	private	java.lang.String	url;
	/**
	 * 图片显示顺序
	 */
	private Integer showOrder;
	
	public	void	setReportId(java.lang.String	reportId){
		this.reportId=reportId;
	}

	public	java.lang.String	getReportId(){
		return this.reportId;
	}
	public	void	setUrl(java.lang.String	url){
		this.url=url;
	}

	public	java.lang.String	getUrl(){
		return this.url;
	}

	public Integer getShowOrder() {
		return showOrder;
	}

	public void setShowOrder(Integer showOrder) {
		this.showOrder = showOrder;
	}
	
}
