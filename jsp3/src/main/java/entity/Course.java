package entity;
// 更新代码上传到 github上。
import java.io.Serializable;

public class Course implements Serializable {

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;

	       private Integer couresId;
	       private String name;
	       private Integer days;
	       
		public Integer getId() {
			return couresId;
		}
		public void setId(Integer couresId) {
			this.couresId = couresId;
		}
		public String getName() {
			return name;
		}
		public void setName(String name) {
			this.name = name;
		}
		public Integer getDays() {
			return days;
		}
		public void setDays(Integer days) {
			this.days = days;
		}
	       
	       
}
