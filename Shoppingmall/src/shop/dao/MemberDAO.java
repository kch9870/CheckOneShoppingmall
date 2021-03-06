package shop.dao;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.util.ArrayList;

import shop.vo.Member;

public class MemberDAO {
	private static MemberDAO memberDao = new MemberDAO();
	
	private MemberDAO() {}
	
	public static MemberDAO getInstance()
	{
		return memberDao;
	}
	public Connection connect()
	{
		Connection conn = null;
		try
		{
			Class.forName("com.mysql.cj.jdbc.Driver");
			conn = DriverManager.getConnection("jdbc:mysql://localhost:3306/shop?serverTimezone=UTC", "root", "1234");
		}catch(Exception e)
		{			
			e.printStackTrace();
		}
		return conn;
	}
	
	public void memberInsert(Member member)
	{
		try {
			Connection con = this.connect();
			PreparedStatement pstmt = con.prepareStatement("insert into member values(?,?,?,?)");
			pstmt.setString(1, member.getId());
			pstmt.setString(2, member.getPasswd());
			pstmt.setString(3, member.getName());
			pstmt.setString(4, member.getMail());
			
			pstmt.executeUpdate();
		}catch(Exception e)
		{
			e.printStackTrace();
		}
	}
	public String memberLogin(String id)
	{
		try{
			 Connection con = connect(); 
			 PreparedStatement pstmt = con.prepareStatement("select passwd from member where id=?");
			 pstmt.setString(1, id);
			 ResultSet rs = pstmt.executeQuery();
			 if(rs.next()) {
					return rs.getString(1);
				}
		 }
	 	catch(Exception e)
		{
			e.printStackTrace();
		}
		return "";
	}
	public Member memberSearch(String id)
	{
		Member member=null;
		try {
			Connection con = connect();
			PreparedStatement pstmt = con.prepareStatement("select * from member where id = ?");
			pstmt.setString(1, id);
			ResultSet rs = pstmt.executeQuery();
			if(rs.next()) {
				member = new Member();
				member.setId(rs.getString(1));
				member.setPasswd(rs.getString(2));
				member.setName(rs.getString(3));
				member.setMail(rs.getString(4));	
			}
		}catch(Exception e)
		{
			e.printStackTrace();
		}
		return member;
	}
	
	public void memberUpdate(Member member)
	{
		try {
			Connection con = this.connect();
			PreparedStatement pstmt = con.prepareStatement("update member set passwd=?,name=?,mail=? where id=?");
			pstmt.setString(1, member.getPasswd());
			pstmt.setString(2, member.getName());
			pstmt.setString(3, member.getMail());
			pstmt.setString(4, member.getId());
			
			pstmt.executeUpdate();
		}catch(Exception e)
		{
			e.printStackTrace();
		}
	}
	
	public ArrayList<Member> memberList()
	{
		ArrayList<Member> list=new ArrayList<Member>();
		Member member=null;
		try {
			Connection con = connect();
			PreparedStatement pstmt = con.prepareStatement("select * from products where kind='best'");
			ResultSet rs = pstmt.executeQuery();
			while(rs.next()) {
				member = new Member();
				member.setId(rs.getString(1));
				member.setPasswd(rs.getString(2));
				member.setName(rs.getString(3));
				member.setMail(rs.getString(4));
				list.add(member);
			}
		}catch(Exception e)
		{
			e.printStackTrace();
		}
		return list;
	}
	
	public Member memberDelete(Member member)
	{
		try {
			Connection con = this.connect();
			PreparedStatement pstmt = con.prepareStatement("delete from member where id=?");
			pstmt.setString(1, member.getId());

			pstmt.executeUpdate();
		}catch(Exception e)
		{
			e.printStackTrace();
		}
		return member;
	}
}

