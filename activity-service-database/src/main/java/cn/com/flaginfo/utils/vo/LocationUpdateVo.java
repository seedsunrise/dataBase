package cn.com.flaginfo.utils.vo;
/**
 * 定时活动地点更新vo
 * @author lenovo
 *
 */
public class LocationUpdateVo {
	/**
	 * 地点配置记录主键
	 */
	private String id;
	/**
	 * 活动地点
	 */
	private String location;
	/**
	 * 地点经度
	 */
	private String locationLang;
	/**
	 * 地点纬度
	 */
	private String locationLat;

	public String getId() {
		return id;
	}

	public void setId(String id) {
		this.id = id;
	}

	public String getLocation() {
		return location;
	}

	public void setLocation(String location) {
		this.location = location;
	}

	public String getLocationLang() {
		return locationLang;
	}

	public void setLocationLang(String locationLang) {
		this.locationLang = locationLang;
	}

	public String getLocationLat() {
		return locationLat;
	}

	public void setLocationLat(String locationLat) {
		this.locationLat = locationLat;
	}

}
