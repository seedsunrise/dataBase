package cn.com.flaginfo.service;

import cn.com.flaginfo.model.ErrPO;


/**
 * 
 *<p>Title:错误信息保存</p>* 
 *<p>Description: </p>*
 *<p>Company:flaginfo </p> 
 * @author liming
 * @date 2017年6月9日
 */
public interface ErrService {
	
	/**
	 * 
	 * desc:保存错误信息
	 * @author:liming
	 * @date:2017年6月9日
	 */
	void saveErr(ErrPO err);

}
