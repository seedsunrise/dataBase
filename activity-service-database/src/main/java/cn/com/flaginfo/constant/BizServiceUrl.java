package cn.com.flaginfo.constant;

public enum BizServiceUrl {
	attachmentSaveUrl("/attachment/saveInfo"),attachmentdelUrl("/attachment/deleteBySidAndCode"), attachmentQueryUrl("/attachment/queryList");
	private String url;

	private BizServiceUrl(String url) {
		this.url = url;
	}
	
	public String getServiceUrl(){
		return url;
	}
}
