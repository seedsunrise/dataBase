package cn.com.flaginfo.service.impl;

import java.util.List;
import java.util.Map;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import cn.com.flaginfo.dao.LocalsDAO;
import cn.com.flaginfo.service.LocalsService;

@Service
public class LocalsServiceImpl implements LocalsService {
	
	@Autowired
	private LocalsDAO localsDAO;

	@Override
	public List<Map<String, String>> query(List<String> ids) {
		
		return localsDAO.query(ids);
	}

}
