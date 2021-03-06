package shop.service;

import java.util.ArrayList;

import shop.dao.MemberDAO;
import shop.vo.Member;

public class MemberService {
	private static MemberService service = new MemberService();
	public MemberDAO dao = MemberDAO.getInstance();
	private MemberService(){}
	
	public static MemberService getInstance() {
		return service;
	}
	
	public void memberInsert(Member member) {
		dao.memberInsert(member);
	}
	
	public String memberLogin(String id) {
		String c;
		c=dao.memberLogin(id);
		return c;
	}
	public Member memberSearch(String id)
	{
		Member m;
		m=dao.memberSearch(id);
		return m;
	}
	
	public void memberUpdate(Member member)
	{
		dao.memberUpdate(member);
	}
	
	public ArrayList<Member> memberList()
	{
		return dao.memberList();
	}
	
	public void memberDelete(Member member)
	{
		dao.memberDelete(member);
	}
}