package shop.controller;

import java.io.IOException;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import shop.service.MemberService;
import shop.vo.Member;

public class MemberInsertController implements Controller{

	@Override
	public void execute(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		// TODO Auto-generated method stub
		String id = req.getParameter("id");
		String pwd = req.getParameter("passwd");
		String name = req.getParameter("name");
		String mail = req.getParameter("mail");
		
		resp.setContentType("text/html; charset=EUC-KR");
		req.setCharacterEncoding("EUC-KR");
		
		if(id.isEmpty()||pwd.isEmpty()||name.isEmpty()||mail.isEmpty()) {
			req.setAttribute("error", "Fill every part!!!!");
			HttpUtil.forward(req, resp, "/Register.jsp");
		}
		
		Member member = new Member();
		member.setId(id);
		member.setPasswd(pwd);
		member.setName(name);
		member.setMail(mail);
		
		req.setAttribute("member",member);
		
		// service ??ü
		MemberService service = MemberService.getInstance();
		service.memberInsert(member);
		
		//output
		req.setAttribute("id", id);
		HttpUtil.forward(req, resp, "/Login.jsp");
		
	}

}