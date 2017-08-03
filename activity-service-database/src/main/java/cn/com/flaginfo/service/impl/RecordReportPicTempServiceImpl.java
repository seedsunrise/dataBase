package cn.com.flaginfo.service.impl;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import cn.com.flaginfo.dao.RecordReportPicTempDAO;
import cn.com.flaginfo.service.RecordReportPicTempService;

@Service
public class RecordReportPicTempServiceImpl implements RecordReportPicTempService {

	@Autowired
	RecordReportPicTempDAO recordReportPicTempDAO;
	
	/**
	 * 根据临时上报记录信息删除临时图片信息
	 */
	@Override
	@Transactional
	public void deteleByTempId(String reportTempId) {
		recordReportPicTempDAO.deteleByTempId(reportTempId);
	}

}
