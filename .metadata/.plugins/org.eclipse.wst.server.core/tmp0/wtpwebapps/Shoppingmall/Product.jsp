<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD XHTML 1.0 Strict//EN" "http://www.w3.org/TR/xhtml1/DTD/xhtml1-strict.dtd">
<head>
<meta http-equiv="Content-Type" content="text/html; charset=utf-8" />
<title>Check!One Shop♥</title>
<meta name="keywords" content="" />
<meta name="description" content="" />
<link href="http://fonts.googleapis.com/css?family=Open+Sans:400,300,600,700|Archivo+Narrow:400,700" rel="stylesheet" type="text/css">
<link href="css/default.css" rel="stylesheet" type="text/css" media="all" />
<link href="css/Product.css" rel="stylesheet" type="text/css" media="all" />
</head>
<body>
<div id="wrapper-bg">
	<div id="wrapper">
		<div id="header" class="container">
			<div id="logo">
				<h1><a href="CheckOneShop.jsp"><span>Check!One Shop♥</span>Welcome</a></h1>
			</div>
			<div id="menu">
				<ul>
					<li class="active"><a href="Login.jsp" accesskey="1" title="">Login</a></li>
					<li><a href="register.html" accesskey="2" title="">Register</a></li>
					<li><a href="#" accesskey="3" title="">Cart</a></li>
					<li><a href="#" accesskey="4" title="">MyPage</a></li>
					<li><a href="#" accesskey="5" title="">Coming</a></li>
				</ul>
			</div>	
		</div>
		<div class='clear'></div>
			<form action="mainProduct.do" method="get">
			<nav class="container">
				<ul id="menubar">
					<li ><input type="submit" name="name"  value="All_Item"class="button-style"></li>
					<li ><input type="submit" name="name" value="outer"class="button-style"></li>
					<li ><input type="submit" name="name" value="top"class="button-style"></li>
					<li ><input type="submit" name="name" value="pants"class="button-style"></li>
					<li ><input type="submit" name="name" value="dress"class="button-style"></li>
					<li ><input type="submit" name="name" value="skirts"class="button-style"></li>
					<li ><input type="submit" name="name" value="shoes"class="button-style"></li>
				</ul>
			</nav>
		</form>
			<div class='clear'></div>
			<div id="container">
			<%
				String img=(String)request.getAttribute("img");
				String pname=(String)request.getAttribute("pname");
				String price=(String)request.getAttribute("price");
				String pcode=(String)request.getAttribute("pcode");
				String id=(String)request.getAttribute("logid");
			%>
			<a><%=pcode %></a>
			<a><%=id %></a>
			<h1 id="heading"><%=pname%></h1>
			<div id="prod-pic">
				<img src=<%=img %> alt="에디오피아 게뎁" id="cup" width="250" height="250">
			</div>			
			<div id="desc">
			<form action="cart.do" method="get">
				<ul>
					<li id="product-name"><%=pname%></li>
					<li class="bluetext"><%=price %></li>
					<li>Delivery Fee : 2,500<br></li>
					<li>Point: 180(2%)</li>
					<li><input type="text" name="count">Count</input></li>
					<input type="submit" name="goto" value="Cart"></input>
					<input type="hidden" name="pcode" value="<%=pcode%>"></input>
					<input type="hidden" name="id" value="<%=id%>"></input>
					<input type="hidden" name="where" value="cart"></input>
					<button >Buy</button>
				</ul>
			</form>						
			</div>
			<hr>
	</div>

	<script src="js/Product.js"></script>
	</div>
	</div>	
<div id="footer">
	<p>&copy; Untitled. All rights reserved. Design by <a href="http://templated.co" rel="nofollow">Checkoneshop</a>. Photos by <a href="http://m.906studio.co.kr/">906studio</a>.</p>
</div>
<div class='clear'></div>
</body>
</html>
