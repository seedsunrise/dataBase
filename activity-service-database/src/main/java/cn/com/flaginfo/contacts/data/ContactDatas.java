package cn.com.flaginfo.contacts.data;

import java.util.ArrayList;
import java.util.Collection;
import java.util.HashMap;
import java.util.Map;

import org.apache.log4j.Logger;

import com.google.common.collect.ArrayListMultimap;
import com.google.common.collect.Multimap;

import cn.com.flaginfo.contacts.model.Group;
import cn.com.flaginfo.contacts.model.Member;

public class ContactDatas {
	
	private static Logger log = Logger.getLogger(ContactDatas.class);

	private ContactDatas() {
	}

	private final Multimap<String, Group> groupDatas = ArrayListMultimap.create();

	private final Map<String, Group> groupMap = new HashMap<String, Group>();

	private final Multimap<String, Member> memberDatas = ArrayListMultimap.create();

	private final static ContactDatas CONTACT_DATAS = new ContactDatas();

	private ContactCopyDatas contactCopyDatas;

	private CopyStatus copyStatus = CopyStatus.UN_COPY;

	public static ContactDatas getInstance() {
		return CONTACT_DATAS;
	}
	/**
	 * 添加一个通讯录组
	 * @param group
	 */
	public void addGroup(Group group) {
		this.groupDatas.put(group.getPid(), group);
		this.groupMap.put(group.getId(), group);
	}
	
	
	
	/**
	 * 添加一个联系人
	 * @param member
	 */
	public void addMember(Member member) {
		memberDatas.put(member.getGroupId(), member);
	}
	/**
	 * 获取通讯录组下的联系人。
	 * @param groupId
	 * @return
	 */
	public Collection<Member> getMemberChildren(String groupId) {
		if (this.copyStatus == CopyStatus.COPY_FINISH) {
			return this.contactCopyDatas.getMemberChildren(groupId);
		}
		return this.memberDatas.get(groupId);
	}
	/**
	 * 获取通讯录下的子分组
	 * @param groupId
	 * @return
	 */
	public Collection<Group> getChildren(String groupId) {
		if (this.copyStatus == CopyStatus.COPY_FINISH) {
			//log.info("从内存副本中获取通讯录组，参数：groupId:"+groupId);
			return this.contactCopyDatas.getChildren(groupId);
		}
		//log.info("从内存中获取通讯录组，参数：groupId:"+groupId);
		Collection<Group> groups = this.groupDatas.get(groupId);
		return groups == null ? new ArrayList<Group>(0) : groups;
	}
	
	public boolean isExistBranch(String groupId){
		
		if (this.copyStatus == CopyStatus.COPY_FINISH) {
			//log.info("从内存副本中获取通讯录组，参数：groupId:"+groupId);
			return this.contactCopyDatas.isExistBranch(groupId);
		}
		
		return this.groupMap.containsKey(groupId);
		
	}
	
	
	public  boolean containsKey(String groupId){
		
		if (this.copyStatus == CopyStatus.COPY_FINISH) {
			//log.info("从内存副本中获取通讯录组，参数：groupId:"+groupId);
			return this.contactCopyDatas.containsKey(groupId);
		}
		
		return this.groupDatas.containsKey(groupId);
	}
	/**
	 * 根据通讯id获取通讯录名称
	 * @param id
	 * @return
	 */
	public String getNameById(String id) {
		if (this.copyStatus == CopyStatus.COPY_FINISH) {
			log.info("从内存副本中获取通讯录名称，参数：groupId:"+id);
			return this.contactCopyDatas.getNameById(id);
		}
		return this.groupMap.get(id).getName();
	}

	/**
	 * 根据通讯录id获取通讯录分组
	 * @param id
	 * @return
	 */
	public Group getGroupById(String id) {
		if (this.copyStatus == CopyStatus.COPY_FINISH) {
			return this.contactCopyDatas.getGroupById(id);
		}
		return this.groupMap.get(id);
	}
	/**
	 * 清理通讯录的数据
	 */
	public void clear() {
		this.groupDatas.clear();
		this.groupMap.clear();
		this.memberDatas.clear();
	}
	/**
	 * 清理副本数据
	 */
	public void clearCopy() {
		if (this.copyStatus == CopyStatus.COPY_FINISH) {
			this.contactCopyDatas.clear();
			this.changeCopyStatusOnUnCopy();
		}
	}
	/**
	 * 状态修改为未复制状态。
	 */
	public void changeCopyStatusOnUnCopy() {
		this.copyStatus = CopyStatus.UN_COPY;
	}

	public void toCopy() {
		this.copyStatus = CopyStatus.COPYINT;
		this.contactCopyDatas = new ContactCopyDatas();
		this.contactCopyDatas.copy(this);
		// 拷贝完成
		this.copyStatus = CopyStatus.COPY_FINISH;
	}
	
	static public enum CopyStatus {
		UN_COPY, COPYINT, COPY_FINISH;
	}

	static public class ContactCopyDatas {

		private Multimap<String, Group> groupDatas = ArrayListMultimap.create();

		private Map<String, Group> groupMap = new HashMap<String, Group>();

		private Multimap<String, Member> memberDatas = ArrayListMultimap.create();

		public void copy(ContactDatas contactDatas) {
			this.groupDatas.putAll(contactDatas.groupDatas);
			this.groupMap.putAll(contactDatas.groupMap);
			this.memberDatas.putAll(contactDatas.memberDatas);
		}

		public Collection<Group> getChildren(String groupId) {
			Collection<Group> groups = this.groupDatas.get(groupId);
			return groups == null ? new ArrayList<Group>(0) : groups;
		}
		
		public boolean isExistBranch(String groupId){
			
			return this.groupMap.containsKey(groupId);
		}
		
		public boolean containsKey(String groupId){
			
			return this.groupDatas.containsKey(groupId);
		}

		public String getNameById(String id) {
			return this.groupMap.get(id).getName();
		}

		public Group getGroupById(String id) {
			return this.groupMap.get(id);
		}

		public Collection<Member> getMemberChildren(String groupId) {
			return this.memberDatas.get(groupId);
		}

		public void clear() {
			this.groupDatas.clear();
			this.groupMap.clear();
			this.memberDatas.clear();
		}

	}

}
