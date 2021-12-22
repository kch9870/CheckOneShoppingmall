package shop.controller;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import shop.service.MemberService;
import shop.vo.*;



public class LoginController implements Controller{

	
	@Override
	public void execute(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		// TODO Auto-generated method stub
		String id = req.getParameter("id");
		String pwd = req.getParameter("passwd");
		boolean login=false;
		
		// service ��ü
		MemberService service = MemberService.getInstance();
		String check = service.memberLogin(id);
		
		if(check.equals("")) {
			//id�� �������� �ʽ��ϴ�.
			 resp.setCharacterEncoding("UTF-8");
			 PrintWriter writer = resp.getWriter();
			 writer.println("<script type='text/javascript'>");
			 writer.println("alert('id not find');");
			 writer.println("history.back();");
			 writer.println("</script>");
			 writer.flush();
			 return;
		}
		else if(check.equals(pwd)){
			//�α��� �Ǿ����ϴ�.
			req.setAttribute("id", id);
			login=true;
			req.setAttribute("login",login);
			HttpUtil.forward(req, resp, "/OpenShop.jsp");
		}
		else {
			//��й�ȣ�� Ʋ���ϴ�.
			 resp.setCharacterEncoding("UTF-8");
			   PrintWriter writer = resp.getWriter();
			   writer.println("<script type='text/javascript'>");
			   writer.println("alert('wrong PW');");
			   writer.println("history.back();");
			   writer.println("</script>");
			   writer.flush();
			   return;
		}
	}

}