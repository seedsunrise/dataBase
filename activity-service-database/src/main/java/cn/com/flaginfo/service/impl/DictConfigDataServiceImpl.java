package cn.com.flaginfo.service.impl;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import cn.com.flaginfo.dao.DictConfigDataDAO;
import cn.com.flaginfo.dao.ICommonDAO;
import cn.com.flaginfo.model.DictConfigData;
import cn.com.flaginfo.service.AbstractCommonService;
import cn.com.flaginfo.service.DictConfigDataService;
@Service
public class DictConfigDataServiceImpl extends AbstractCommonService<DictConfigData> implements DictConfigDataService{
		@Autowired
		private DictConfigDataDAO dictConfigDataDAO;

		public ICommonDAO<DictConfigData> getCommonDAO() {
			return this.dictConfigDataDAO;
		}
		public void deleteBatch(List ids){
			dictConfigDataDAO.deleteBatch(ids);
		}
}
