package shop.controller;

import java.io.IOException;
import java.io.PrintWriter;
import java.util.HashMap;

import javax.servlet.ServletConfig;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

public class FrontController extends HttpServlet{

	HashMap<String,Controller> list = null;
	
	public void init(ServletConfig config) throws ServletException
	{
		list = new HashMap<String, Controller>();
		list.put("/memberInsert.do", new MemberInsertController());
		list.put("/memberLogin.do", new LoginController());
		list.put("/mainProduct.do", new ProductController());
		list.put("/cart.do", new CartController());	
	}
	public void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException
	{
		String url = req.getRequestURI();
		String cp = req.getContextPath();
		String path = url.substring(cp.length(),url.length());
		
		Controller sc = list.get(path);
		PrintWriter out = resp.getWriter();
		out.print(path + " " + sc);
		sc.execute(req, resp);
	}
}
