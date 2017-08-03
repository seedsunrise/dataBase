package cn.com.flaginfo.service.impl;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import cn.com.flaginfo.dao.ICommonDAO;
import cn.com.flaginfo.dao.WechatbindDAO;
import cn.com.flaginfo.model.Wechatbind;
import cn.com.flaginfo.service.AbstractCommonService;
import cn.com.flaginfo.service.WechatbindService;
@Service
public class WechatbindServiceImpl extends AbstractCommonService<Wechatbind> implements WechatbindService{
		@Autowired
		private WechatbindDAO wechatbindDAO;

		public ICommonDAO<Wechatbind> getCommonDAO() {
			return this.wechatbindDAO;
		}
		public void deleteBatch(List ids){
			wechatbindDAO.deleteBatch(ids);
		}
		@Override
		public boolean checkBind(String openId) {
			return wechatbindDAO.queryCount(openId);
		}
		@Override
		public Wechatbind getByOpenId(String openId) {
			return wechatbindDAO.getById(openId);
		}
		/**
		 * 根据手机号和openId更新绑定信息
		 */
		@Override
		@Transactional
		public void insertAndUpdate(Wechatbind o) {
			Wechatbind wechat = wechatbindDAO.getByMobileAndOpenId(o);
			if(wechat!=null){
				wechatbindDAO.update(o);
			}else{
				wechatbindDAO.insert(o);
			}
			
		}
		
		@Override
		public void deleteByOpenIdAndAccount(String openId){
			
			wechatbindDAO.deleteByOpenIdAndAccount(openId);
			
		}
		
}
