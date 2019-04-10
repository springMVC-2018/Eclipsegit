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
		   // 1. 获取参数 (略)
		// 2. 处理业务 (查)
		Student stu=new Student();
		stu.setName("zhangsan");
		stu.setAge(23);
		stu.setSex("M");
		stu.setInterests(new String[]{"琴","棋","书","画"});
		
		Course c=new Course();
		c.setId(1);
		c.setName("JAVA");
		c.setDays(80);
		stu.setCourse(c);
		// 3. 转发或重定向 （转）
		req.setAttribute("stu1", stu);
		// 当前：/jsp3/findStudent
		// 目标：/jsp3/find_student.jsp
		req.getRequestDispatcher("find_student.jsp").forward(req, res);

	}	
}
























