package cn.com.flaginfo.service.impl;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import cn.com.flaginfo.dao.DictConfigFieldDAO;
import cn.com.flaginfo.dao.ICommonDAO;
import cn.com.flaginfo.model.DictConfigField;
import cn.com.flaginfo.service.AbstractCommonService;
import cn.com.flaginfo.service.DictConfigFieldService;
@Service
public class DictConfigFieldServiceImpl extends AbstractCommonService<DictConfigField> implements DictConfigFieldService{
		@Autowired
		private DictConfigFieldDAO dictConfigFieldDAO;

		public ICommonDAO<DictConfigField> getCommonDAO() {
			return this.dictConfigFieldDAO;
		}
		public void deleteBatch(List ids){
			dictConfigFieldDAO.deleteBatch(ids);
		}
}
