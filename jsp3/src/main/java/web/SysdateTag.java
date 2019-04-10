package web;

import java.io.IOException;
import java.text.SimpleDateFormat;
import java.util.Date;

import javax.servlet.jsp.JspException;
import javax.servlet.jsp.JspWriter;
import javax.servlet.jsp.PageContext;
import javax.servlet.jsp.tagext.SimpleTagSupport;
/**
 * �Զ��� JSTL ��ǩ�࣬�������������ʱ�䡣
 * ʱ����Ĭ�ϵĸ�ʽ��Ҳ����ָ��һ����ʽ ��
 * 
 * */
public class SysdateTag  extends SimpleTagSupport {
     
	 // ʱ��ĸ�ʽ ����Ĭ��ֵ��
	   // ����ͨ��set�����޸���ֵ
		private String format= "yyy/MM/dd HH:mm:ss";
		public String getFormat(){
			return format;			
		}
		public void setFormat(String format){
			this.format=format;
		}
		
		
	@Override
	public void doTag() throws JspException, IOException {
	  
		// ����������ʱ��
		  Date  date=new Date();
		// ��ʽ�� ������û���ϲ�����ĸ�ʽ������ͨ�� set ���������޸ġ�
		SimpleDateFormat  sdf=new SimpleDateFormat(format);
		  String now =sdf.format(date);
		// ��ʱ������������
		// �÷����������� JapContext ,
		// �÷���ʵ�ʷ��ص��� PageContext ,
		// PageContext  extends  JspContext
		  PageContext ctx=(PageContext) getJspContext();
		  JspWriter out=ctx.getOut();
		  out.println(now);
		  // �˴��������ܹرգ���Ϊ JSP �ϻ��������ı�ǩҪʹ���������
		  
	}
     
}






