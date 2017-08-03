package cn.com.flaginfo.service;
import java.util.List;

import cn.com.flaginfo.model.OpenEnrollment;
public interface OpenEnrollmentService extends ICommonService<OpenEnrollment> {
	public void deleteBatch(List ids);
}
