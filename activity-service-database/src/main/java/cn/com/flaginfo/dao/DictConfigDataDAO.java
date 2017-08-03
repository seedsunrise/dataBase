package cn.com.flaginfo.dao;
import java.util.List;

import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Param;

import cn.com.flaginfo.model.DictConfigData;
@Mapper
public interface DictConfigDataDAO extends ICommonDAO<DictConfigData> {
	public void deleteBatch(@Param("ids")List ids);
}
