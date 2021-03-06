<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ page import="java.util.ArrayList" %>
<%@ page import="shop.vo.*"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD XHTML 1.0 Strict//EN" "http://www.w3.org/TR/xhtml1/DTD/xhtml1-strict.dtd">
<head>
<meta http-equiv="Content-Type" content="text/html; charset=utf-8" />
<title>Check!One Shop♥</title>
<meta name="keywords" content="" />
<meta name="description" content="" />
<link href="http://fonts.googleapis.com/css?family=Open+Sans:400,300,600,700|Archivo+Narrow:400,700" rel="stylesheet" type="text/css">
<link href="css/default.css" rel="stylesheet" type="text/css" media="all" />
<link href="css/Cart.css" rel="stylesheet" type="text/css" media="all"/>
</head>
<body>
<div id="wrapper-bg">
	<div id="wrapper">
		<div id="header" class="container">
			<div id="logo">
				<h1><a href="CheckOneShop.jsp"><span>Check!One Shop♥</span>Welcome</a></h1>
			</div>
			<%String logid = (String)request.getAttribute("logid");%>
			<a><%=logid %></a>
			<%if(logid == null){%>
				<div id="menu">
				<ul>
					<li class="active"><a href="Login.jsp" accesskey="1" title="">Login</a></li>
					<li><a href="Register.jsp" accesskey="2" title="">Register</a></li>
					<li><a href="Cart.jsp" accesskey="3" title="">Cart</a></li>
					<li><a href="#" accesskey="4" title="">Coming</a></li>
				</ul>
			</div>	
			<% }
			else{ 
			%>
				<div id="menu">
				<form action="cart.do" method="get" name="cart">
				<ul>
					<li class="active"><a accesskey="1" title=""><%=logid+"'s Welcome"%></a></li>
					<li><input type="submit" value = "test" accesskey="2" title="">My page</a></li>
					<li><a href="Cart.jsp" accesskey="3" title="">Cart</a></li>
					<li><a href="#" accesskey="4" title="">Coming</a></li>
					<input type="hidden" name="id" value="<%=logid%>">
					<input type="hidden" name="where" value="home">
				</ul>
				</form>
			</div>	
			<% }%>
		</div>
		<div class='clear'></div>
		<div id="container">
	    <h1>MY CART</h1><br></br>
	    <hr>
	    <div id="nameList"></div>
	    <% ArrayList<Cart> list=(ArrayList<Cart>)request.getAttribute("list");
			if(!list.isEmpty())
			{
		%>		
				<% for(int i=0; i<list.size(); i++ )
				{
					Product product=list.get(i).getProduct();%>
					<div class="content">
						<h3>Name : <%=product.getName()%></h3><h3>Price : <%=product.getPrice()%></h3><h3>Count : <%=list.get(i).getCount()%></h3>
						<form action="cart.do" method="get">
						<input type="submit" name="where" value="delete">
						<input type="hidden" name="pcode" value="<%=product.getP_code()%>">
						<input type="hidden" name="id" value="<%=logid%>">
						<input type="hidden" name="ccode" value="<%=list.get(i).getCcode()%>">
						</input></form>
					</div>
				</div>
			</div>
				<%}
				}%>
	    <ul id="buttons">
	    		<form action="cart.do" method="get">
				<li>
					<input type="submit" name="where" value="buy">BUY</button>
					<input type="hidden" name="id" value="<%=logid%>">					
				</li>
				</form>
		</ul>
	  	</div>
		<script src="js/Cart.js"></script>

</div>

<div id="footer">
	<p>&copy; Untitled. All rights reserved. Design by <a href="http://templated.co" rel="nofollow">Checkoneshop</a>. Photos by <a href="http://m.906studio.co.kr/">906studio</a>.</p>
</div>
</body>
</html>
    