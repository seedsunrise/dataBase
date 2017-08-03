package cn.com.flaginfo.service.impl;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import cn.com.flaginfo.dao.RecordReportTempDAO;
import cn.com.flaginfo.service.RecordReportTempService;

@Service
public class RecordReportTempServiceImpl implements RecordReportTempService{

	@Autowired  RecordReportTempDAO recordReportTempDAO;
	
	@Override
	@Transactional
	public void deteleById(String id) {
		recordReportTempDAO.deleteByPrimaryKey(id);		
	}

}
