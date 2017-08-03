package cn.com.flaginfo.dao;
import java.util.List;

import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Param;

import cn.com.flaginfo.model.Wechatbind;
@Mapper
public interface WechatbindDAO extends ICommonDAO<Wechatbind> {
	public void deleteBatch(@Param("ids")List ids);

	public boolean queryCount(@Param("openId")String openId);

	public Wechatbind getByMobileAndOpenId(Wechatbind o);
	
	public void deleteByOpenIdAndAccount(@Param("openId")String openId);
}
