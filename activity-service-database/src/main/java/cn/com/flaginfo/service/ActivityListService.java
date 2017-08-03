package cn.com.flaginfo.service;

import java.util.Map;

import cn.com.flaginfo.utils.vo.QueryAllActivityListVo;
import cn.com.flaginfo.utils.vo.QueryMyActivityListVo;

public interface ActivityListService {
	/**
	 * 查询所有的活动列表
	 */
	Map<String, Object> queryAllList(QueryAllActivityListVo vo);

	/**
	 * 查询我的活动列表
	 * @param vo
	 * @return
	 */
	Map<String, Object> queryMyList(QueryMyActivityListVo vo);

	Map<String, Object> cleanUpInvalidActivity(String taskId);
}
