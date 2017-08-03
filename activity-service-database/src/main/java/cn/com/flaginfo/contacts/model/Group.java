package cn.com.flaginfo.contacts.model;

import com.alibaba.fastjson.JSONObject;
import com.google.common.base.Preconditions;

public class Group {

	private final String id;

	private final String name;

	private final String pid;
	
	private final Long total;
	private Long personNum;
	
	

	public Long getPersonNum() {
		return personNum==null?0L:personNum;
	}
	public void setPersonNum(Long personNum) {
		this.personNum = personNum;
	}
	private Group(Builder builder) {
		this.id = builder.id;
		this.name = builder.name;
		this.pid = builder.parentId;
		this.total = builder.getTotal();
	}
	/**
	 * {"id":"1",
	 * "groupType":"1",
	 * "groupLevel":"1",
	 * "remark":"",
	 * "name":"未分组",
	 * "contactsId":"17050410420890000656",
	 * "pid":"0"}
	 * @param jsonData
	 */
	public static Group toGroup( JSONObject jsonData ){
		Builder builder = new Builder();
		builder.id(jsonData.getString("id"));
		builder.name(jsonData.getString("name"));
		builder.parentId(jsonData.getString("pid"));
		builder.total(jsonData.getLong("total"));
		return builder.builder();
	}

	public static class Builder {

		private String id;

		private String name;

		private String parentId;
		
		private Long total;

		public Builder id(String id) {
			Preconditions.checkNotNull(id);
			this.id = id;
			return this;
		}

		public Builder name(String name) {
			Preconditions.checkNotNull(name);
			this.name = name;
			return this;
		}

		public Builder parentId(String parentId) {
			Preconditions.checkNotNull(parentId);
			this.parentId = parentId;
			return this;
		}
		
		public Builder total(Long total) {
			//Preconditions.checkNotNull(total);
			this.total = total;
			return this;
		}

		public Group builder() {
			return new Group(this);
		}

		public String getId() {
			return id;
		}

		public String getName() {
			return name;
		}

		public String getParentId() {
			return parentId;
		}

		public Long getTotal() {
			return total;
		}
		
		

	}

	public String getId() {
		return id;
	}

	public String getName() {
		return name;
	}

	public String getPid() {
		return pid;
	}
	
	public Long getTotal() {
		return total;
	}
	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + ((id == null) ? 0 : id.hashCode());
		return result;
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Group other = (Group) obj;
		if (id == null) {
			if (other.id != null)
				return false;
		} else if (!id.equals(other.id))
			return false;
		return true;
	}
	
	
	
	

}
