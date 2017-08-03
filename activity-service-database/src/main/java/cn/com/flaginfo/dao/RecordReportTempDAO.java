package cn.com.flaginfo.dao;

import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Param;

import cn.com.flaginfo.model.RecordReportTemp;

@Mapper
public interface RecordReportTempDAO {
	int deleteByPrimaryKey(String id);

	int insert(RecordReportTemp record);

	int insertSelective(RecordReportTemp record);

	RecordReportTemp selectByPrimaryKey(String id);

	int updateByPrimaryKeySelective(RecordReportTemp record);

	int updateByPrimaryKey(RecordReportTemp record);

	RecordReportTemp getByActId(@Param("activityId") String activityId);

	void updateById(@Param("recordInfo") String recordInfo, @Param("id") String id);
}