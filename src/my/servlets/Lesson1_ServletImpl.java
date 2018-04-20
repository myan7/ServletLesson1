package my.servlets;

import java.io.IOException;
import java.io.PrintWriter;
import java.time.LocalDateTime;

import javax.servlet.Servlet;
import javax.servlet.ServletConfig;
import javax.servlet.ServletException;
import javax.servlet.ServletRequest;
import javax.servlet.ServletResponse;

public class Lesson1_ServletImpl implements Servlet {

	
	// 用于初始化servlet 类似于class 的constructor, 只会被调用一次.
	// 当用户第一次访问该servlet 时, 会被调用
	@Override
	public void init(ServletConfig arg0) throws ServletException {
		// TODO Auto-generated method stub
		System.out.println("init method will be only called only once when request comes to this Servlet.");
	}
	
	// 这个函数用来处理业务逻辑, 程序员应当把业务逻辑代码写在这里. 
	// 这个方法会被调用多次, 每当用户访问该servlet 时, 都会被调用
	// request 用于获得客户端(就是浏览器, 因为时B/S结构)的信息
	// response 用于向客户端返回信息
	@Override
	public void service(ServletRequest request, ServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		//证明每次都会被call, 这里我们在console里输出一条消息
		System.out.println("Service method will be called per each request.");
		
		// 从response 中的到 PrintWriter, 然后由PrintWriter 向浏览器输出
		PrintWriter pw = response.getWriter();
		pw.println("Hello it is "+LocalDateTime.now()+" now!");
	}
	
	
	// 用来销毁 servlet 实例的方法, 说白了就是释放内存
	// 1.	reload 该 servlet 所在的web application
	// 2.	关闭 server(Tomcat)
	// 3.	当你修改servlet class 内容时, 也会调用这个方法, 其实修改class 内容, 导致reload web application
	@Override
	public void destroy() {
		// TODO Auto-generated method stub
		//也是只会被调用一次.
		System.out.println("Servlet get destroyed. ");
	}
	
	
	
	@Override
	public ServletConfig getServletConfig() {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public String getServletInfo() {
		// TODO Auto-generated method stub
		return null;
	}


}
