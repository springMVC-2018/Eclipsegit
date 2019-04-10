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
	    //读取请求参数值的第一种方式：
	    // 1. 通过request对象。
	    public String login1(HttpServletRequest request){
	    	System.out.println("login()");
	    	String adminCode=request.getParameter("adminCode");
	    	String pwd=request.getParameter("pwd");
	    	System.out.println("adminCode:"+adminCode+"pwd"+pwd);
	    	return "index";
	    }   
	    @RequestMapping("/login2.do")
	    // 读取请求参数值的第二种方式：
	    // 使用@RequestParam注解
	    public String login2(String adminCode, @RequestParam("pwd") String password){
	    	// 上面形参 需要和 表单里面的name一致。
	    	System.out.println("login2()");
	    	System.out.println("adminCode:"+adminCode+"pwd:"+ password);
	    	return "index";
	    }
	    
	    @RequestMapping("/login3.do")
	    // 读取请求参数值的第三种方式：
	    // 将请求参数封装成一个javabean.
	    public String login3(AdminParam ap){
	    	System.out.println("login3()");
	    	System.out.println("adminCode:"+ap.getAdminCode()+"pwd:"+ap.getPwd());
	    	return "index";
	    }
}
