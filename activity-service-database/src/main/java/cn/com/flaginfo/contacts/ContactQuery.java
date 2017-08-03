package cn.com.flaginfo.contacts;

import java.util.Collection;
import java.util.List;
import java.util.concurrent.ExecutionException;

import cn.com.flaginfo.contacts.model.Group;
import cn.com.flaginfo.contacts.model.Member;

public interface ContactQuery {
	/**
	 * 查询组织下的所有组织的id
	 * 
	 * @param groupId
	 * @return
	 */
	public List<String> getChildrenGroupIds(String groupId) throws Exception;
	
	/**
	 * 
	 * desc:获取末尾子节点
	 * @param groupId
	 * @return
	 * @throws ExecutionException
	 * @author:liming
	 * @date:2017年6月18日
	 */
	public List<String> getLastChildGroupIds(String groupId) throws Exception;

	/**
	 * 查询组织下的所有组织的id
	 * 
	 * @param groupId
	 * @return
	 */
	public List<String> getChildrenGroupIds(String... groupIds) throws Exception;

	/**
	 * 查询组织下的所有组织
	 * 
	 * @param groupId
	 * @return
	 */
	public List<Group> getChildrenGroup(String groupId) throws Exception;
	
	public Collection<Group> getNextGroups(String groupId) throws Exception;
	
	public Group getById(String groupId) throws Exception;

	/**
	 * 查询组织下的所有组织
	 * 
	 * @param groupId
	 * @return
	 */
	public List<Group> getChildrenGroup(String... groupIds) throws Exception;
	/**
	 * 根据id获取名称
	 * @param id
	 * @return
	 */
	public String getGroupNameById( String id ) throws Exception ;
	/**
	 * 查询通讯录组及以下所有节点的人数
	 * @param groupId
	 * @return
	 */
	public Long getAllMemberNumber(String groupId) throws Exception;
	/**
	 * 查询通讯录组节点下的人数
	 * @param groupId
	 * @return
	 */
	public Long getMemberNumber(String groupId) throws Exception;
	/**
	 * 查询通讯录组节点下的联系人
	 * @param groupId
	 * @return
	 */
	public Collection<Member> getMember(String groupId) throws Exception;

}
