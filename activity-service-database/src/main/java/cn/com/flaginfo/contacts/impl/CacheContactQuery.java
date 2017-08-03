package cn.com.flaginfo.contacts.impl;

import java.util.ArrayList;
import java.util.Collection;
import java.util.List;
import java.util.concurrent.Callable;
import java.util.concurrent.ExecutionException;

import org.apache.commons.lang.StringUtils;
import org.apache.log4j.Logger;

import com.google.common.base.Preconditions;

import cn.com.flaginfo.contacts.ContactQuery;
import cn.com.flaginfo.contacts.cache.CacheFactory;
import cn.com.flaginfo.contacts.model.Group;
import cn.com.flaginfo.contacts.model.Member;
/**
 * 从缓存中获取通讯录数据
 * 
 * @author Administrator
 *
 */
public class CacheContactQuery implements ContactQuery {
	
	private static Logger log = Logger.getLogger(CacheContactQuery.class);
	
	private ContactQuery contactQuery;
	
	public CacheContactQuery( ContactQuery contactQuery ){
		this.contactQuery = contactQuery;
	}

	@Override
	public List<String> getChildrenGroupIds(final String groupId) throws Exception {
		Preconditions.checkArgument(StringUtils.isNotBlank(groupId), "groupId is not null");
		log.info("开始从缓存中获取通讯录下的所有子节点id，参数：组id："+groupId);
		return CacheFactory.getIdCache().get(groupId, new Callable<List<String>>() {
			@Override
			public List<String> call() throws Exception {
				log.info("获取通讯录下的所有子节点id，缓存没有命中，委托给其他方式查找，参数：组id："+groupId);
				return contactQuery.getChildrenGroupIds(groupId);
			}
		});
	}

	@Override
	public List<String> getChildrenGroupIds(String... groupIds) throws Exception {
		List<String> datas = new ArrayList<String>();
		for(String groupId : groupIds){
			List<String> ids = this.getChildrenGroupIds(groupId);
			for(String id : ids){
				if(datas.contains(id))continue;
				datas.add(id);
			}
		}
		return datas;
	}

	@Override
	public List<Group> getChildrenGroup(final String groupId) throws Exception{
		Preconditions.checkArgument(StringUtils.isNotBlank(groupId), "groupId is not null");
		log.info("开始从缓存中获取通讯录下的所有子节点信息，参数：组id："+groupId);
		return CacheFactory.getGroupCache().get(groupId, new Callable<List<Group>>() {
			@Override
			public List<Group> call() throws Exception {
				log.info("获取通讯录下的所有子节点信息，缓存没有命中，委托给其他方式查找，参数：组id："+groupId);
				return contactQuery.getChildrenGroup(groupId);
			}
		});
	}

	@Override
	public List<Group> getChildrenGroup(String... groupIds) throws Exception {
		List<Group> datas = new ArrayList<Group>();
		for(String groupId : groupIds){
			List<Group> groups = this.getChildrenGroup(groupId);
			for(Group group : groups){
				if(datas.contains(group))continue;
				datas.add(group);
			}
		}
		return datas;
	}

	@Override
	public String getGroupNameById(String id) throws Exception{
		return contactQuery.getGroupNameById(id);
	}

	@Override
	public Long getAllMemberNumber(final String groupId) throws Exception{
		return CacheFactory.getAllMemberCache().get(groupId, new Callable<Long>() {
			@Override
			public Long call() throws Exception {
				return contactQuery.getAllMemberNumber(groupId);
			}
		});
		
	}

	@Override
	public Long getMemberNumber(final String groupId) throws Exception{
		return CacheFactory.getAllMemberCache().get(groupId, new Callable<Long>() {
			@Override
			public Long call() throws Exception {
				return contactQuery.getMemberNumber(groupId);
			}
		});
	}

	@Override
	public Collection<Member> getMember(String groupId)throws Exception {
		return contactQuery.getMember(groupId);
	}

	@Override
	public List<String> getLastChildGroupIds(final String groupId) throws ExecutionException {
		Preconditions.checkArgument(StringUtils.isNotBlank(groupId), "groupId is not null");
		log.info("开始从缓存中获取通讯录下的所有末尾节点id，参数：组id："+groupId);
		return CacheFactory.getLastlevidcache().get(groupId, new Callable<List<String>>() {
			@Override
			public List<String> call() throws Exception {
				log.info("获取通讯录下的所有子节点id，缓存没有命中，委托给其他方式查找，参数：组id："+groupId);
				return contactQuery.getLastChildGroupIds(groupId);
			}
		});
	}

	@Override
	public Collection<Group> getNextGroups(String groupId) throws Exception {
		Preconditions.checkArgument(StringUtils.isNotBlank(groupId), "groupId is not null");
		return contactQuery.getNextGroups(groupId);
	}

	@Override
	public Group getById(String groupId) throws Exception {
		return contactQuery.getById(groupId);
	}
	
	

}
