package shop.controller;

import java.io.IOException;
import java.util.ArrayList;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import shop.service.MemberService;
import shop.service.ProductService;
import shop.vo.Product;
import shop.vo.Cart;

public class CartController implements Controller{
	
	@Override
	public void execute(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
	
		String id=req.getParameter("id");
		String where=req.getParameter("where");

		
		Cart cart = null;
		ProductService service = ProductService.getInstance();
		
		System.out.println();
		if(where.equals("delete"))//장바구니에서 삭제 할때
		{
			String ccode=req.getParameter("ccode");
			service.productDelete(ccode);
			  
		}
		else if(where.equals("buy"))
		{
			System.out.println("test11");
			ArrayList<Cart> list = service.showCartlist(id);
			service.buyProduct(list, id);
		}
		else if(!where.equals("home")) {//제품상세페이지에서 왔을때

			String pcode=req.getParameter("pcode");
			int count=Integer.parseInt(req.getParameter("count"));
			
			service.insertCart(count, id, pcode);
			
		}
		
		ArrayList<Cart> list = service.showCartlist(id);
		req.setAttribute("list",list);
		req.setAttribute("logid",id);
		HttpUtil.forward(req,resp,"/Cart.jsp");
	}
}