package cn.com.flaginfo.service;
import java.util.List;

import cn.com.flaginfo.model.RecordReportPic;
public interface RecordReportPicService extends ICommonService<RecordReportPic> {
	public void deleteBatch(List ids);
}
