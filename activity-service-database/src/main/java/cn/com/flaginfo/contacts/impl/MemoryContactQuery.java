package cn.com.flaginfo.contacts.impl;

import java.util.ArrayList;
import java.util.Collection;
import java.util.List;

import org.apache.commons.collections.CollectionUtils;
import org.apache.log4j.Logger;

import cn.com.flaginfo.contacts.ContactQuery;
import cn.com.flaginfo.contacts.ContactQueryFactory;
import cn.com.flaginfo.contacts.data.ContactDatas;
import cn.com.flaginfo.contacts.model.Group;
import cn.com.flaginfo.contacts.model.Member;

public class MemoryContactQuery extends AbstractContactQuery{
	
	private static Logger log = Logger.getLogger(MemoryContactQuery.class);
	
	public MemoryContactQuery(ContactQuery contactQuery) {
		super(contactQuery);
	}

	@Override
	public List<String> getChildrenGroupIds(String groupId) throws Exception {
		//保存在内存中
		List<String> datas =super.getChildrenGroupIds(groupId);
		if(CollectionUtils.isEmpty(datas)){
			//从内存中获取
			log.info("开始从内存中计算通讯录下的所有子节点id，参数：组id："+groupId);
			Collection<Group> groups = ContactDatas.getInstance().getChildren(groupId);
			setIdsToArray(groups,datas);
		}
		return datas;
	}
	
	
	@Override
	public List<String> getLastChildGroupIds(String groupId) {
		
		List<String> datas =new ArrayList<String>();
		
		if(CollectionUtils.isEmpty(datas)){
			//从内存中获取
			log.info("开始从内存中计算通讯录下的所有子节点id，参数：组id："+groupId);
		
			Collection<Group> groups = ContactDatas.getInstance().getChildren(groupId);
			if(CollectionUtils.isEmpty(groups)){
				List<String> list=new ArrayList<String>(1);
				list.add(groupId);
				return list;
			}
			setIdsToArrayForLastBranch(groups, datas);
		}
		return datas;
	}

	private void setIdsToArray(Collection<Group> groups, List<String> datas) {
		for(Group group : groups){
			String id = group.getId();
			if(datas.contains(id)) continue;
			datas.add(id);
			Collection<Group> groupChildren = ContactDatas.getInstance().getChildren(id);
			setIdsToArray(groupChildren, datas);
		}
		
	}
	
	
	private void setIdsToArrayForLastBranch(Collection<Group> groups, List<String> datas) {
		for(Group group : groups){
			String id = group.getId();
			if(datas.contains(id)) continue;
			Collection<Group> groupChildren = ContactDatas.getInstance().getChildren(id);
			if(CollectionUtils.isEmpty(groupChildren)){
				datas.add(id);
				continue;
			}
			setIdsToArrayForLastBranch(groupChildren, datas);
		}
		
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
	public List<Group> getChildrenGroup(String groupId) throws Exception {
		List<Group> datas = super.getChildrenGroup(groupId);
		if(datas.isEmpty()){
			//从内存中获取
			log.info("开始从内存中计算通讯录下的所有子节点信息，参数：组id："+groupId);
			Collection<Group> groups = ContactDatas.getInstance().getChildren(groupId);
			setGroupsToArray(groups,datas);
		}
		return datas;
	}

	private void setGroupsToArray(Collection<Group> groups, List<Group> datas) {
		for(Group group : groups){
			if(datas.contains(group)) continue;
			datas.add(group);
			Collection<Group> groupChildren = ContactDatas.getInstance().getChildren(group.getId());
			setGroupsToArray(groupChildren, datas);
		}
		
	}

	@Override
	public List<Group> getChildrenGroup(String... groupIds) throws Exception {
		List<Group> datas = new ArrayList<Group>();
		for(String groupId : groupIds){
			List<Group> groups = this.getChildrenGroup(groupId);
			for(Group group : groups){
				if(datas.contains(group)) continue;
				datas.add(group);
			}
		}
		return datas;
	}
	
	@Override
	public String getGroupNameById(String id) throws Exception{
		String name = super.getGroupNameById(id);
		if(name == null){
			//从内存中获取
			name = ContactDatas.getInstance().getNameById(id);
		}
		return name;
	}

	@Override
	public Long getAllMemberNumber(String groupId) throws Exception{
		Long size = super.getAllMemberNumber(groupId);
		if(size == null){
			//从内存中计算
			List<String> groupIds = ContactQueryFactory.getContactQuery().getChildrenGroupIds(groupId);
			Long total = 0l;
			for(String id : groupIds){
				total = total +ContactQueryFactory.getContactQuery().getMemberNumber(id);
			}
			size = total;	
		}
		return size;
	}
	
	public Long getMemberNumber(String groupId)throws Exception{
		Long size = super.getMemberNumber(groupId);
		if(size == null){
			//从内存中计算
			Integer len = ContactDatas.getInstance().getMemberChildren(groupId).size();
			size = Long.valueOf(len == null ? 0 : len);
		}
		return size;
	}
	
	public Collection<Member> getMember(String groupId)throws Exception{
		Collection<Member> datas = super.getMember(groupId);
		if(datas.isEmpty()){
			datas = ContactDatas.getInstance().getMemberChildren(groupId);
		}
		return datas;
	}

	@Override
	public Collection<Group> getNextGroups(String groupId) throws Exception {
		return ContactDatas.getInstance().getChildren(groupId);
	}

	@Override
	public Group getById(String groupId) throws Exception {
		return ContactDatas.getInstance().getGroupById(groupId);
	}

	

}
