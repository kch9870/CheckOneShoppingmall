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
<link href="css/Login.css" rel="stylesheet" type="text/css" >
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
					<li class="active"><a href="" accesskey="1" title="">Login</a></li>
					<li><a href="register.jsp" accesskey="2" title="">Register</a></li>
					<li><a href="#" accesskey="3" title="">Cart</a></li>
					<li><a href="#" accesskey="4" title="">MyPage</a></li>
					<li><a href="#" accesskey="5" title="">Coming</a></li>
				</ul>
			</div>	
		</div>
		<div class='clear'></div>
			<nav class="container">
				<ul id="menubar">
					<li><a href="Best5.jsp">췤원의 Best5!</a></li>
					<li><a href="Outer.jsp">Outer</a>
						 <ul>
				           <li><a href="#">자켓</a></li>
				           <li><a href="#">점퍼</a></li>
				           <li><a href="#">코트</a></li>
				           <li><a href="#">가디건</a></li>
				         </ul>
				    </li>
					<li><a href="">Top</a>
						 <ul>
				           <li><a href="#">티셔츠</a></li>
				           <li><a href="#">민소매</a></li>
				           <li><a href="#">맨투맨/후드</a></li>
				           <li><a href="#">셔츠/블라우스</a></li>
				         </ul>
					</li>
					<li><a href="#">Pants</a>
						 <ul>
				           <li><a href="#">데님</a></li>
				           <li><a href="#">코튼</a></li>
				           <li><a href="#">슬랙스</a></li>
				           <li><a href="#">숏팬츠</a></li>
				         </ul>
					</li>
					<li><a href="#">Skirts</a>
						 <ul>
				           <li><a href="#">미니</a></li>
				           <li><a href="#">롱</a></li>
				         </ul>
					</li>
					<li><a href="#">Dress</a>
						 <ul>
				           <li><a href="#">미니</a></li>
				           <li><a href="#">롱</a></li>
				           <li><a href="#">오버롤</a></li>
				           <li><a href="#">세트</a></li>
				         </ul>
					</li>
					<li><a href="#">Shoes</a>
						 <ul>
				           <li><a href="#">로퍼/플랫</a></li>
				           <li><a href="#">스니커즈</a></li>
				           <li><a href="#">샌들/슬리퍼</a></li>
				           <li><a href="#">부츠</a></li>
				         </ul>
					</li>
					<li><a href="#">Question</a>
						 <ul>
				           <li><a href="#">문의</a></li>
				           <li><a href="#">공지사항</a></li>
				         </ul>
					</li>
				</ul>
			</nav>
			<div class='clear'></div>
		<div id="container" class="login">
		<h1>로그인</h1>
		<form action="memberLogin.do" method="get">
			<ul id="user-info">
				<li>
					<label for="id" class="field">아이디</label>
					<input type="text" name="id" placeholder="아이디를 입력하세요.">
				</li>
				<li>
					<label for="passwd" class="field">비밀번호</label>
					<input type="password" name="passwd" placeholder="비밀번호를 입력하세요.">
				</li>
			</ul>
			<ul id="buttons">
				<li>
					<button type="submit" class="btn btnBlack"">로그인</button>					
				</li>
			</ul>
		</form>
			<a href="Register.jsp">회원가입</a>
	</div>
</div>

<div id="footer">
	<p>&copy; Untitled. All rights reserved. Design by <a href="http://templated.co" rel="nofollow">Checkoneshop</a>. Photos by <a href="http://m.906studio.co.kr/">906studio</a>.</p>
</div>
</body>
</html>
