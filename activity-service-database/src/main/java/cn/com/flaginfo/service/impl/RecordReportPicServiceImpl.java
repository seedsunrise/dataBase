package cn.com.flaginfo.service.impl;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import cn.com.flaginfo.dao.ICommonDAO;
import cn.com.flaginfo.dao.RecordReportPicDAO;
import cn.com.flaginfo.model.RecordReportPic;
import cn.com.flaginfo.service.AbstractCommonService;
import cn.com.flaginfo.service.RecordReportPicService;
@Service
public class RecordReportPicServiceImpl extends AbstractCommonService<RecordReportPic> implements RecordReportPicService{
		@Autowired
		private RecordReportPicDAO recordReportPicDAO;

		public ICommonDAO<RecordReportPic> getCommonDAO() {
			return this.recordReportPicDAO;
		}
		@Transactional
		public void deleteBatch(List ids){
			recordReportPicDAO.deleteBatch(ids);
		}
}
