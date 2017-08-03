package cn.com.flaginfo.contacts.model;

import com.google.common.base.Preconditions;

public class Member {

	private final String id;

	private final String name;

	private final String groupId;

	private Member(Builder builder) {
		this.id = builder.getId();
		this.name = builder.getName();
		this.groupId = builder.getGroupId();
	}

	public static class Builder {

		private String id;

		private String name;

		private String groupId;

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

		public Builder groupId(String groupId) {
			Preconditions.checkNotNull(groupId);
			this.groupId = groupId;
			return this;
		}
		
		public Member builder(){
			return new Member(this);
		}

		public String getId() {
			return id;
		}

		public String getName() {
			return name;
		}

		public String getGroupId() {
			return groupId;
		}
	}

	public String getId() {
		return id;
	}

	public String getName() {
		return name;
	}

	public String getGroupId() {
		return groupId;
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
		Member other = (Member) obj;
		if (id == null) {
			if (other.id != null)
				return false;
		} else if (!id.equals(other.id))
			return false;
		return true;
	}

}
