/**
 * 
 */
package cn.com.flaginfo.utils.vo;

/**
 * @author yangguo
 *
 */
public abstract class AbstractSubVO {

	private Integer pageNo = 1;
	private Integer pageSize = 10;
	private Integer startNum;
	private String siteId;
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
		startNum = (pageNo-1)*pageSize;
		return startNum;
	}
	public void setStartNum(Integer startNum) {
		this.startNum = startNum;
	}
	public String getSiteId() {
		return siteId;
	}
	public void setSiteId(String siteId) {
		this.siteId = siteId;
	}
	

}
