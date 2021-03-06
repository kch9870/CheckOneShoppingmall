package shop.dao;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;

import shop.vo.Member;
import shop.vo.Product;
import shop.vo.Cart;

public class ProductDAO {
	private static ProductDAO productDao = new ProductDAO();
	
	private ProductDAO() {}
	
	public static ProductDAO getInstance()
	{
		return productDao;
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
	public ArrayList<Product> productList(String name)
	{
		ArrayList<Product> list=new ArrayList<Product>();
		Product product=null;
		ResultSet rs=null;
		PreparedStatement pstmt=null;
		Connection con=null;
		try {
			con = connect();
			pstmt = con.prepareStatement("select * from products where kind=?");
			pstmt.setString(1,name);
			rs = pstmt.executeQuery();
			while(rs.next()) {
				product = new Product();
				product.setP_code(rs.getString(1));
				product.setName(rs.getString(2));
				product.setKind(rs.getString(3));
				product.setPrice(rs.getString(4));
				product.setImage(rs.getString(5));
				list.add(product);		
			}
		}catch(SQLException se) {
	         throw new RuntimeException(
	                 "A database error occurred"+se.getMessage());
	        }
	

		return list;
	}
	   public ArrayList<Product> productbestList(boolean tt)
	   {
	      ArrayList<Product> list=new ArrayList<Product>();
	      Product product=null;
	      try {
	         Connection con = connect();
	        
	            PreparedStatement pstmt = con.prepareStatement("SELECT * FROM shop.products order by test desc;");
	            ResultSet rs = pstmt.executeQuery();
	            if(tt)
	            	for(int i=0;i<3;i++)
			         {           
			            if(rs.next()) {
			               product = new Product();
			               product.setP_code(rs.getString(1));
			               product.setName(rs.getString(2));
			               product.setKind(rs.getString(3));
			               product.setPrice(rs.getString(4));
			               product.setImage(rs.getString(5));
			               list.add(product);      
			            }
			         }
	            else {
	            	while(rs.next()) {
			               product = new Product();
			               product.setP_code(rs.getString(1));
			               product.setName(rs.getString(2));
			               product.setKind(rs.getString(3));
			               product.setPrice(rs.getString(4));
			               product.setImage(rs.getString(5));
			               list.add(product);      
			            }
	            }
	      }catch(Exception e)
	      {
	         e.printStackTrace();
	      }
	      return list;
	   }
	   
	   public void insertCart(int count,String id, String Pcode)
		{
		   	int ccode=0;
			try {
				Connection con = this.connect();
				
	          
				PreparedStatement pstmt = con.prepareStatement("SELECT max(c_code) FROM shop.cart;");
				ResultSet rs = pstmt.executeQuery();
				if(rs.next()) {
					ccode = rs.getInt(1)+1;
				}
				else {
					ccode = 0;
				}
				pstmt = con.prepareStatement("insert into cart values(?,?,?,?)");
				pstmt.setInt(1, ccode);
				pstmt.setString(2, Pcode);
				pstmt.setString(3, id);
				pstmt.setInt(4, count);
				pstmt.executeUpdate();
		
			}catch(Exception e)
			{
				e.printStackTrace();
			}
		}
	   public ArrayList<Cart> showCartlist(String id){
		   ArrayList<Cart> list=new ArrayList<Cart>();
		   ArrayList<String> Countlist=new ArrayList<String>();
		   ArrayList<String> Plist = new ArrayList<String>();
		   ArrayList<String> Clist = new ArrayList<String>();
		   Cart cart=null;
		   Product product=null;
		   try {
			   Connection con = this.connect();
			   PreparedStatement pstmt = con.prepareStatement("select *from shop.cart where id = ?;");
			   pstmt.setString(1, id);
			   ResultSet rs = pstmt.executeQuery();
			   while(rs.next()) {
				   Clist.add(rs.getString(1));
				   Plist.add(rs.getString(2));
				   Countlist.add(rs.getString(4));
			   }
			   for(int i = 0; i<Plist.size();i++) {
				   pstmt = con.prepareStatement("select * from shop.products where p_code = ?;");
				   pstmt.setString(1,Plist.get(i));
				   rs = pstmt.executeQuery();
				   while(rs.next()) {
					   product = new Product();
		               product.setP_code(rs.getString(1));
		               product.setName(rs.getString(2));
		               product.setKind(rs.getString(3));
		               product.setPrice(rs.getString(4));
		               product.setImage(rs.getString(5));
		               cart=new Cart();
		               cart.setCcode(Integer.parseInt(Clist.get(i)));
		               cart.setCount(Integer.parseInt(Countlist.get(i)));
		               cart.setProduct(product);
		               list.add(cart);      
				   }
			   }
		   }catch(Exception e)
			{
				e.printStackTrace();
			}
		   return list;
	   }
	   public void productDelete(String ccode)
	   {
		   try {
			   
			   Connection con = this.connect();
			   
			   PreparedStatement pstmt = con.prepareStatement("delete from shop.cart where c_code=?;");
			   pstmt.setString(1,ccode);
			   pstmt.executeUpdate();
			   }
		   catch(Exception e)
			{
				e.printStackTrace();
			}
	   }
	   public void buyProduct(ArrayList<Cart> list, String id)
	   {
		   System.out.println("test");
		   int ocode;
		   try {
			   Connection con = this.connect();
			   for(int i=0;i<list.size();i++) {
				   PreparedStatement pstmt = con.prepareStatement("SELECT max(o_code) FROM shop.order;");
					con = this.connect();
					ResultSet rs = pstmt.executeQuery();
					if(rs.next()) {
						ocode = rs.getInt(1)+1;
					}
					else {
						ocode = 0;
					}
					String pcode=list.get(i).getProduct().getP_code();
					int count=list.get(i).getCount();
					System.out.println(ocode+","+id);
					System.out.println(pcode+","+count);
				    pstmt = con.prepareStatement("insert into shop.order values(?,?,?,?);");
					pstmt.setInt(1, ocode);
					pstmt.setString(2, pcode);
					pstmt.setString(3, id);
					pstmt.setInt(4, count);
					pstmt.executeUpdate();
					productDelete(Integer.toString(list.get(i).getCcode()));
			   }
		   
	   }
		   catch(Exception e)
			{
				e.printStackTrace();
			}
	   }
}

