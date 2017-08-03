package cn.com.flaginfo.constant;

public enum BizCode {
	activityTitleimage("ACTIVITY_TITLEIMAGE"),activityAttachment("ACTIVITY_ATTACHMENT");
	private String code;
	private BizCode(String code){
		this.code = code;
	}
	public String getCode(){
		return code;
	}
}
