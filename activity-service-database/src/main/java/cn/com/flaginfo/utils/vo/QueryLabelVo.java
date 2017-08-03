package cn.com.flaginfo.utils.vo;

/**
 * 查询标签信息条件对象
 * 
 * @author lenovo
 *
 */
public class QueryLabelVo {
	/**
	 * 租户ID(企业ID)
	 */
	private String spid;
	/**
	 * 标签名称
	 */
	private String name;
	/**
	 * 默认页码
	 */
	private Integer pageNo = 1;
	/**
	 * 默认页大小
	 */
	private Integer pageSize = 10;
	/**
	 * 起始记录索引
	 */
	private Integer startNum = 0;
	/**
	 * 是否查询全部数据
	 */
	private Boolean isAll = false;

	public String getSpid() {
		return spid;
	}

	public void setSpid(String spid) {
		this.spid = spid;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public Integer getPageNo() {
		return pageNo;
	}

	public void setPageNo(Integer pageNo) {
		this.pageNo = pageNo;
	}

	public Integer getPageSize() {
		return pageSize;
	}

	public void setPageSize(Integer pageSize) {
		this.pageSize = pageSize;
	}

	public Integer getStartNum() {
		return startNum;
	}

	public void setStartNum(Integer startNum) {
		this.startNum = startNum;
	}

	public Boolean getIsAll() {
		return isAll;
	}

	public void setIsAll(Boolean isAll) {
		this.isAll = isAll;
	}

}
