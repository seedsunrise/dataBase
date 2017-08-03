package cn.com.flaginfo.service;


/**
 * 系统属性比率计算service
 *<p>Title: </p>* 
 *<p>Description: </p>*
 *<p>Company:flaginfo </p> 
 * @author liming
 * @date 2017年6月9日
 */
public interface SystemRateService {
	
	/**
	 * 
	 * desc:获取评论率分数
	 * @return 返回的是一个两位数的整数
	 * @author:liming
	 * @throws Exception 
	 * @date:2017年6月9日
	 */
	Integer getCommentRate(String activityId,String orgId) throws Exception;
	
	/**
	 * 
	 * desc:获取活动参与率分数
	 * @return 返回的是一个两位数的整数
	 * @author:liming
	 * @date:2017年6月9日
	 */
	Integer getActivityJoinRate(String actType,String activityId,String orgId) throws Exception;
	
	
	/**
	 * 
	 * desc:获取点赞率分数
	 * @return 返回的是一个两位数的整数比率，并非小数
	 * @author:liming
	 * @date:2017年6月9日
	 */
	Integer getPraiseRate(String activityId,String orgId) throws Exception;

}
