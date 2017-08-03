package cn.com.flaginfo.service;

import org.springframework.transaction.annotation.Transactional;

import cn.com.flaginfo.dao.ICommonDAO;

public abstract class AbstractCommonService<T> implements ICommonService<T> {
	
	public abstract ICommonDAO<T> getCommonDAO();

	@Override
	public T getById(String id) {
		return getCommonDAO().getById(id);
	}

	@Transactional
	@Override
	public void deleteById(String id) {
		getCommonDAO().deleteById(id);
	}
	@Transactional
	@Override
	public void update(T o) {
		getCommonDAO().update(o);
	}
	@Transactional
	@Override
	public void insert(T o) {
		getCommonDAO().insert(o);
	}

}
