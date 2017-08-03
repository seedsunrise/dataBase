package cn.com.flaginfo.utils.vo;

/**
 * 查询活动列表条件Vo
 * 
 * @author lenovo
 *
 */
public class QueryTypeListVo {
	/**
	 * 租户ID
	 */
	private String tenementId;
	/**
	 * 活动类型名称
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
	public String getTenementId() {
		return tenementId;
	}
	public void setTenementId(String tenementId) {
		this.tenementId = tenementId;
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
