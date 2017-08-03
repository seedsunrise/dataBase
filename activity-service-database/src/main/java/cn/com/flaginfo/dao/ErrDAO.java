package cn.com.flaginfo.dao;

import org.apache.ibatis.annotations.Mapper;

import cn.com.flaginfo.model.ErrPO;


@Mapper
public interface ErrDAO {
	
	void insertErr(ErrPO err);

}
