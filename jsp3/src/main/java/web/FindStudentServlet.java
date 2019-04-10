package web;
import java.io.IOException;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import entity.Course;
import entity.Student;

public class FindStudentServlet extends HttpServlet {

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;

	@Override
	protected void service(HttpServletRequest  req, HttpServletResponse  res) throws ServletException, IOException {
		   // 1. ��ȡ���� (��)
		// 2. ����ҵ�� (��)
		Student stu=new Student();
		stu.setName("zhangsan");
		stu.setAge(23);
		stu.setSex("M");
		stu.setInterests(new String[]{"��","��","��","��"});
		
		Course c=new Course();
		c.setId(1);
		c.setName("JAVA");
		c.setDays(80);
		stu.setCourse(c);
		// 3. ת�����ض��� ��ת��
		req.setAttribute("stu1", stu);
		// ��ǰ��/jsp3/findStudent
		// Ŀ�꣺/jsp3/find_student.jsp
		req.getRequestDispatcher("find_student.jsp").forward(req, res);

	}	
}
























