package cn.com.flaginfo.dao;

import java.util.List;

import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Param;

import cn.com.flaginfo.model.RecordReportPic;

@Mapper
public interface RecordReportPicDAO extends ICommonDAO<RecordReportPic> {
	void deleteBatch(@Param("ids") List ids);

	RecordReportPic getById(@Param("id") String id);

	void insertMany(List<RecordReportPic> list);
}
