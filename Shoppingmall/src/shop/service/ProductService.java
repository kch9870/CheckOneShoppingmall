package shop.service;

import java.util.ArrayList;

import shop.dao.ProductDAO;
import shop.vo.Member;
import shop.vo.Product;
import shop.vo.Cart;

public class ProductService {
	private static ProductService service = new ProductService();
	public ProductDAO dao = ProductDAO.getInstance();
	private ProductService(){}
	
	public static ProductService getInstance() {
		return service;
	}
	
	public ArrayList<Product> productList(String name)
	{
		return dao.productList(name);
	}
	
	public ArrayList<Product> productbestList(boolean tt)
	{
		return dao.productbestList(tt);
	}
	 public void insertCart(int count,String id, String Pcode) {
		  dao.insertCart(count,id,Pcode);
	 }
	 public ArrayList<Cart> showCartlist(String id){
		 return dao.showCartlist(id);
	 }

	 public void productDelete(String ccode)
	 {
		 dao.productDelete(ccode);
	 }
	 
	 public void buyProduct(ArrayList<Cart> list,String id)
	 {
		   dao.buyProduct(list, id);
	 }
	 
}