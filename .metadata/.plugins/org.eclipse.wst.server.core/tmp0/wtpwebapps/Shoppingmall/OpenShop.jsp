<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ page import="java.util.ArrayList" %>
<%@ page import="shop.vo.*"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD XHTML 1.0 Strict//EN" "http://www.w3.org/TR/xhtml1/DTD/xhtml1-strict.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8" />
<title>Check!One Shop♥</title>
<meta name="keywords" content="" />
<meta name="description" content="" />
<link href="http://fonts.googleapis.com/css?family=Open+Sans:400,300,600,700|Archivo+Narrow:400,700" rel="stylesheet" type="text/css">
<link href="css/default.css" rel="stylesheet" type="text/css" media="all" />
</head>

<body onload="document.main.btn.click();">	
	<form action="mainProduct.do" name="main" method="get">
		<div id="logo">
			<input type="submit" name="goto" value="toMain" id="btn">
		<%if((String)request.getAttribute("id") != null){%>
			<a>test</a>
			<input type="hidden" name="logid" value="<%=request.getAttribute("id")%>" id="btn">
		<% }%>
		<a><%=(String)request.getAttribute("id")%></a>
		</div>
	</form>
</body>

</html>