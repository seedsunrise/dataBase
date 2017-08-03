package cn.com.flaginfo.model;

public class RecordReportPicTemp {
	/**
	 * 主键
	 */
    private String id;
    /**
     * 记录ID 可能是临时上报记录也可能是新建室外活动临时记录
     */
    private String reportTempId;
    /**
     * 上传的图片地址
     */
    private String url;
    /**
     * 图片展示顺序
     */
    private Integer showOrder;

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id == null ? null : id.trim();
    }

    public String getReportTempId() {
        return reportTempId;
    }

    public void setReportTempId(String reportTempId) {
        this.reportTempId = reportTempId == null ? null : reportTempId.trim();
    }

    public String getUrl() {
        return url;
    }

    public void setUrl(String url) {
        this.url = url == null ? null : url.trim();
    }

    public Integer getShowOrder() {
        return showOrder;
    }

    public void setShowOrder(Integer showOrder) {
        this.showOrder = showOrder;
    }
}