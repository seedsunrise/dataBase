package cn.com.flaginfo.service;
import java.util.List;

import cn.com.flaginfo.model.Wechatbind;
public interface WechatbindService extends ICommonService<Wechatbind> {
	public void deleteBatch(List ids);

	public boolean checkBind(String openId);

	public Wechatbind getByOpenId(String string);

	public void insertAndUpdate(Wechatbind o);
	
	void deleteByOpenIdAndAccount(String openId);
}
