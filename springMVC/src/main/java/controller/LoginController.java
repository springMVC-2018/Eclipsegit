package controller;

import javax.servlet.http.HttpServletRequest;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

@Controller
public class LoginController {
	    @RequestMapping("/toLogin.do")
         public String loginL(){
        	 System.out.println("toLogin()");
        	 return "login";
         }
	    
	    @RequestMapping("/login.do")
	    //��ȡ�������ֵ�ĵ�һ�ַ�ʽ��
	    // 1. ͨ��request����
	    public String login1(HttpServletRequest request){
	    	System.out.println("login()");
	    	String adminCode=request.getParameter("adminCode");
	    	String pwd=request.getParameter("pwd");
	    	System.out.println("adminCode:"+adminCode+"pwd"+pwd);
	    	return "index";
	    }   
	    @RequestMapping("/login2.do")
	    // ��ȡ�������ֵ�ĵڶ��ַ�ʽ��
	    // ʹ��@RequestParamע��
	    public String login2(String adminCode, @RequestParam("pwd") String password){
	    	// �����β� ��Ҫ�� �������nameһ�¡�
	    	System.out.println("login2()");
	    	System.out.println("adminCode:"+adminCode+"pwd:"+ password);
	    	return "index";
	    }
	    
	    @RequestMapping("/login3.do")
	    // ��ȡ�������ֵ�ĵ����ַ�ʽ��
	    // �����������װ��һ��javabean.
	    public String login3(AdminParam ap){
	    	System.out.println("login3()");
	    	System.out.println("adminCode:"+ap.getAdminCode()+"pwd:"+ap.getPwd());
	    	return "index";
	    }
}
