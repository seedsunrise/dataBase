package cn.com.flaginfo.service;
import java.util.List;
import java.util.Map;

import cn.com.flaginfo.model.Personnel;
import cn.com.flaginfo.model.PersonnelVo;
public interface PersonnelService extends ICommonService<Personnel> {
	public void deleteBatch(List ids);

	public Boolean opt(Personnel params);
	
	
	/**
	 * 签到管理列表.
	 * @param personnelVo 参数vo.
	 * @return Map<String, Object>
	 */
	public Map<String, Object> getPersonnelList(PersonnelVo personnelVo);
}
