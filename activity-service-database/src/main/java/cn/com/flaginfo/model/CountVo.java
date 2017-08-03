package cn.com.flaginfo.model;

/**
 * 党员参与率统计返回值vo.
 * @author lenovo .
 */
public class CountVo { 

	
	private String groupName; //组织名称. 
	
	private int joinPeopleTotal; //参加总人数.
	
	private String joinRate; //参与率.
	
	private String groupId;
	
	private int totalPeople; //党员总数.


	public String getGroupName() {
		return groupName;
	}

	public void setGroupName(String groupName) {
		this.groupName = groupName;
	}

	public int getJoinPeopleTotal() {
		return joinPeopleTotal;
	}

	public void setJoinPeopleTotal(int joinPeopleTotal) {
		this.joinPeopleTotal = joinPeopleTotal;
	}

	public String getJoinRate() {
		return joinRate;
	}

	public void setJoinRate(String joinRate) {
		this.joinRate = joinRate;
	}

	public String getGroupId() {
		return groupId;
	}

	public void setGroupId(String groupId) {
		this.groupId = groupId;
	}

	public int getTotalPeople() {
		return totalPeople;
	}

	public void setTotalPeople(int totalPeople) {
		this.totalPeople = totalPeople;
	}
	
}
