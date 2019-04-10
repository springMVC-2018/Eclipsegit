package controller;

public class AdminParam {
        private String adminCode;  // 属性一定要和表单里面的name值一致。
        private String pwd;
        
		public String getAdminCode() {
			return adminCode;
		}
		public void setAdminCode(String adminCode) {
			this.adminCode = adminCode;
		}
		public String getPwd() {
			return pwd;
		}
		public void setPwd(String pwd) {
			this.pwd = pwd;
		}
  
}
