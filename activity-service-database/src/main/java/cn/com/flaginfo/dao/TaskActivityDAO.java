package cn.com.flaginfo.dao;

import org.apache.ibatis.annotations.Mapper;

import cn.com.flaginfo.model.TaskActivity;

@Mapper
public interface TaskActivityDAO {
	
	public void insert(TaskActivity taskActivity);

}
