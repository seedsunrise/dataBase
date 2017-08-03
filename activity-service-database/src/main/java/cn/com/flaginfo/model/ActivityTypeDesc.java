package cn.com.flaginfo.model;

/**
 * 返回活动类型简单描述对象
 * 
 * @author lenovo
 *
 */
public class ActivityTypeDesc {
	/**
	 * 类型记录主键
	 */
	private String id;
	/**
	 * 类型父节点ID
	 */
	private String pid;
	/**
	 * 类型名称
	 */
	private String name;
	/**
	 * 顶级类型名称
	 */
	private String topTypeName;
	/**
	 * 顶级类型节点ID
	 */
	private String topTypeId;

	public String getId() {
		return id;
	}

	public void setId(String id) {
		this.id = id;
	}

	public String getPid() {
		return pid;
	}

	public void setPid(String pid) {
		this.pid = pid;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getTopTypeName() {
		return topTypeName;
	}

	public void setTopTypeName(String topTypeName) {
		this.topTypeName = topTypeName;
	}

	public String getTopTypeId() {
		return topTypeId;
	}

	public void setTopTypeId(String topTypeId) {
		this.topTypeId = topTypeId;
	}

}
