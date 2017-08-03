package cn.com.flaginfo.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import cn.com.flaginfo.dao.ErrDAO;
import cn.com.flaginfo.model.ErrPO;


@Service("errService")
public class ErrServiceImp implements ErrService {

	@Autowired
	private ErrDAO errDao;
	
	@Override
	public void saveErr(ErrPO err) {
		errDao.insertErr(err);
	}
}
