package shop.controller;

import java.io.IOException;
import java.util.ArrayList;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import shop.service.ProductService;
import shop.vo.Product;
public class ProductController implements Controller{

	@Override
	public void execute(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		// TODO Auto-generated method stub
		String togo=req.getParameter("goto");
		String test=req.getParameter("logid");
		
		boolean isPd = true;
		
		if(togo.equals("toMain")) {
			if(test == null) {
				req.setAttribute("logid",null);
			}
			else {
				req.setAttribute("logid",test);
			}
			ArrayList<Product> list=ProductService.getInstance().productbestList(true);
			req.setAttribute("list", list);
			isPd = false;
		}
		else if(togo.equals("All_Item")) {
			ArrayList<Product> list=ProductService.getInstance().productbestList(false);
			req.setAttribute("list", list);
			isPd = true;
		}
		else if(togo.equals("More"))
		{
			String img=req.getParameter("img");
			String pname=req.getParameter("pname");
			String price=req.getParameter("price");
			String pcode=req.getParameter("pcode");
			String id=req.getParameter("id");
			
			req.setAttribute("img",img);
			req.setAttribute("pname",pname);
			req.setAttribute("price",price);
			req.setAttribute("logid",id);
			req.setAttribute("pcode",pcode);
			
			HttpUtil.forward(req,resp,"/product.jsp");
		}
		else {
			ArrayList<Product> list = ProductService.getInstance().productList(togo);
			req.setAttribute("list", list);
			isPd = true;
		}
		req.setAttribute("logid",test);
		req.setAttribute("is", isPd);
		req.setAttribute("name", togo);
		HttpUtil.forward(req,resp,"/CheckOneShop.jsp");
		
	}

}
