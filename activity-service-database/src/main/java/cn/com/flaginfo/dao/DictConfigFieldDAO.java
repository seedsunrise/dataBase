package cn.com.flaginfo.dao;
import java.util.List;

import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Param;

import cn.com.flaginfo.model.DictConfigField;
@Mapper
public interface DictConfigFieldDAO extends ICommonDAO<DictConfigField> {
	public void deleteBatch(@Param("ids")List ids);
}
