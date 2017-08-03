package cn.com.flaginfo.contacts.impl;

import java.util.ArrayList;
import java.util.Collection;
import java.util.List;

import cn.com.flaginfo.contacts.ContactQuery;
import cn.com.flaginfo.contacts.model.Group;
import cn.com.flaginfo.contacts.model.Member;

public abstract class AbstractContactQuery implements ContactQuery{
	
	private ContactQuery contactQuery;
	
	public AbstractContactQuery(ContactQuery contactQuery){
		this.contactQuery = contactQuery;
	}
    
	@Override
	public List<String> getChildrenGroupIds(String groupId) throws Exception {
		if(contactQuery == null) return new ArrayList<String>();
		return contactQuery.getChildrenGroupIds(groupId);
	}

	@Override
	public List<String> getChildrenGroupIds(String... groupIds) throws Exception {
		if(contactQuery == null) return new ArrayList<String>();
		return contactQuery.getChildrenGroupIds(groupIds);
	}

	@Override
	public List<Group> getChildrenGroup(String groupId) throws Exception {
		if(contactQuery == null) return new ArrayList<Group>();
		return contactQuery.getChildrenGroup(groupId);
	}

	@Override
	public List<Group> getChildrenGroup(String... groupIds) throws Exception {
		if(contactQuery == null)  return new ArrayList<Group>();
		return contactQuery.getChildrenGroup(groupIds);
	}
	
	public String getGroupNameById(String id) throws Exception{
		if(contactQuery == null) return null;
		return contactQuery.getGroupNameById(id);
	}
	
	public Long getAllMemberNumber(String groupId) throws Exception{
		if(contactQuery == null) return null;
		return contactQuery.getAllMemberNumber(groupId);
	}
	
	public Long getMemberNumber(String groupId) throws Exception{
		if(contactQuery == null) return null;
		return contactQuery.getMemberNumber(groupId);
	}
	
	public Collection<Member> getMember(String groupId) throws Exception{
		if(contactQuery == null) return new ArrayList<Member>();
		return contactQuery.getMember(groupId);
	}
	
	public Collection<Group> getNextGroups(String groupId) throws Exception{
		if(contactQuery == null) return new ArrayList<Group>();
		return contactQuery.getNextGroups(groupId);
	}
	
	public Group getById(String groupId) throws Exception{
		if(contactQuery == null) return null;
		return contactQuery.getById(groupId);
	}

}
