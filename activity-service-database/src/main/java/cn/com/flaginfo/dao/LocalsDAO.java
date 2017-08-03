package cn.com.flaginfo.dao;

import java.util.List;
import java.util.Map;

import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Param;

@Mapper
public interface LocalsDAO {

	List<Map<String, String>> query(@Param("ids") List<String> ids);

}
