<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ page import="java.util.ArrayList" %>
<%@ page import="shop.vo.*"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD XHTML 1.0 Strict//EN" "http://www.w3.org/TR/xhtml1/DTD/xhtml1-strict.dtd">
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8" />
<title>Check!One Shop♥</title>
<meta name="keywords" content="" />
<meta name="description" content="" />
<link href="http://fonts.googleapis.com/css?family=Open+Sans:400,300,600,700|Archivo+Narrow:400,700" rel="stylesheet" type="text/css">
<link href="css/default.css" rel="stylesheet" type="text/css" media="all" />
</head>
<body onload="window.open('images/ad.jpg','','width=420px, height=540px, left=100px, top=100px, toolbar=0, status=yes, menubars=0, scrollbars=0, resizable=0, location=0, directories=0')">
<div id="wrapper-bg">
	<div id="wrapper">
		<div id="header" class="container">
			<div id="logo">
				<h1><a href=""><span>Check!One Shop</span>Welcome</a></h1>
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
					<li><a onClick="document.forms['cart'].submit();" accesskey="3" title="">Cart</a></li>
					<li><a href="#" accesskey="4" title="">Coming</a></li>
					<input type="hidden" name="id" value="<%=logid%>">
					<input type="hidden" name="where" value="home">
				</ul>
				</form>
			</div>	
			<% }%>
		</div>
		<div class='clear'></div>
		<form action="mainProduct.do" method="get">
			<nav class="container">
				<ul id="menubar">
					<li ><input type="submit" name="goto"  value="All_Item"class="button-style"></li>
					<li ><input type="submit" name="goto" value="outer"class="button-style"></li>
					<li ><input type="submit" name="goto" value="top"class="button-style"></li>
					<li ><input type="submit" name="goto" value="pants"class="button-style"></li>
					<li ><input type="submit" name="goto" value="dress"class="button-style"></li>
					<li ><input type="submit" name="goto" value="skirts"class="button-style"></li>
					<li ><input type="submit" name="goto" value="shoes"class="button-style"></li>
					<input type="hidden" name="logid" value="<%=logid%>">
				</ul>
			</nav>
		</form>		
		<%if(!(boolean)request.getAttribute("is")){%>
		<div class='clear'></div>
		<div id="banner" class="container"> <img src="images/header image.PNG" width="1200" height="400" alt="" /> </div>
		<div id="three-column" class="container">
			<header>
				<h2>BEST OF BEST 3!</h2>
			</header>
			<% ArrayList<Product> list=(ArrayList<Product>)request.getAttribute("list");
			if(!list.isEmpty())
			{
		%>		
				<% for(int i=0; i<list.size(); i++ )
				{
					Product product=list.get(i);%>
			<div class="tbox<%=i+1%>">
				<div class="box-style box-style01" >
					<form action="mainProduct.do" method="get" name="list">
					<div class="content"> <a class="image image-full" onClick="document.forms['list'].submit();" href=#">
						<input type="submit" name="goto" value="More"><img src=<%=product.getImage()%> name="img" alt="">
						<input type="hidden" name="img" value=<%=product.getImage()%>>
						<input type="hidden" name="pname" value="<%=product.getName()%>"><a>Name : <%=product.getName()%></a><br>
						<input type="hidden" name="price" value="<%=product.getPrice()%>"><a>Price : <%=product.getPrice()%></a>
						<input type="hidden" name="pcode" value="<%=product.getP_code()%>">
						<input type="hidden" name="id" value="<%=logid%>">
						</input></a>
					</div>
					</form>
				</div>
			</div>
				<%}
				}
			}
			else{%>
			<div class='clear'></div>
			<div id="three-column" class="container">
			
			<% ArrayList<Product> list=(ArrayList<Product>)request.getAttribute("list");
			int boxNumber;
			%>
			<header>
				<h2><%=request.getAttribute("name")%></h2>
				<a><%=logid%></a>
			</header>
			<%
			
			if(!list.isEmpty())
			{
				for(int i=0; i<list.size(); i++ )
				{
					if((i+1)%3 == 0) boxNumber = 3;
					else boxNumber = (i+1)%3;
					Product product=list.get(i);%>
			<div class="tbox<%=boxNumber%>">
				<div class="box-style box-style01" >
					<form action="mainProduct.do" method="get" name="list">
					<div class="content"> <a class="image image-full" onClick="document.forms['list'].submit();" href=#">
						<input type="submit" name="goto" value="More"><img src=<%=product.getImage()%> name="img" alt="">
						<input type="hidden" name="img" value=<%=product.getImage()%>>
						<input type="hidden" name="pname" value="<%=product.getName()%>"><a>Name : <%=product.getName()%></a><br>
						<input type="hidden" name="price" value="<%=product.getPrice()%>"><a>Price : <%=product.getPrice()%></a>
						<input type="hidden" name="pcode" value="<%=product.getP_code()%>">
						<input type="hidden" name="id" value="<%=logid%>">
						</input></a>
					</div>
					</form>
				</div>
			</div>
				<%}
			}%>
		</div>
			<%}%>
		</div>
		<div id="page">
			<div id="content"></div>
			<div id="sidebar"></div>
		</div>
	</div>
	
</div>
<div id="footer">
	<p>&copy; Untitled. All rights reserved. Design by <a href="http://templated.co" rel="nofollow">Checkoneshop</a>. Photos by <a href="http://m.906studio.co.kr/">906studio</a>.</p>
</div>
</body>
</html>