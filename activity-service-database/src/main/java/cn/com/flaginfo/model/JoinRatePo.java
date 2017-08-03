package cn.com.flaginfo.model;

/**
 * 返回给支部参与率页面的对象类
 * @author lenovo
 *
 */
public class JoinRatePo {
		
		//第一个月参与率
		private String month1Rate;
		//第儿个月参与率
		private String month2Rate;
		
		private  String branchName;

		public String getMonth1Rate() {
			return month1Rate==null?"0":month1Rate;
		}

		public void setMonth1Rate(String month1Rate) {
			this.month1Rate = month1Rate;
		}

		public String getMonth2Rate() {
			return month2Rate==null?"0":month2Rate;
		}

		public void setMonth2Rate(String month2Rate) {
			this.month2Rate = month2Rate;
		}

		public String getBranchName() {
			return branchName;
		}

		public void setBranchName(String branchName) {
			this.branchName = branchName;
		}
		
		
		
}
