package cn.com.flaginfo.dao;

import java.util.List;

import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Param;

import cn.com.flaginfo.model.RecordReportPicTemp;

@Mapper
public interface RecordReportPicTempDAO {
	int deleteByPrimaryKey(String id);

	int insert(RecordReportPicTemp record);

	int insertSelective(RecordReportPicTemp record);

	RecordReportPicTemp selectByPrimaryKey(String id);

	int updateByPrimaryKeySelective(RecordReportPicTemp record);

	int updateByPrimaryKey(RecordReportPicTemp record);

	void deteleByTempId(@Param("reportTempId") String reportTempId);

	RecordReportPicTemp getById(@Param("id") String id);

	void insertMany(List<RecordReportPicTemp> list);
}