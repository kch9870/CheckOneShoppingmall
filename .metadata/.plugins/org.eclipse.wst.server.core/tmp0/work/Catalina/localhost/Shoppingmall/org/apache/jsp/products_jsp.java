/*
 * Generated by the Jasper component of Apache Tomcat
 * Version: Apache Tomcat/8.5.38
 * Generated at: 2019-06-10 18:12:46 UTC
 * Note: The last modified time of this file was set to
 *       the last modified time of the source file after
 *       generation to assist with modification tracking.
 */
package org.apache.jsp;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;
import shop.vo.Product;
import java.util.ArrayList;

public final class products_jsp extends org.apache.jasper.runtime.HttpJspBase
    implements org.apache.jasper.runtime.JspSourceDependent,
                 org.apache.jasper.runtime.JspSourceImports {

  private static final javax.servlet.jsp.JspFactory _jspxFactory =
          javax.servlet.jsp.JspFactory.getDefaultFactory();

  private static java.util.Map<java.lang.String,java.lang.Long> _jspx_dependants;

  private static final java.util.Set<java.lang.String> _jspx_imports_packages;

  private static final java.util.Set<java.lang.String> _jspx_imports_classes;

  static {
    _jspx_imports_packages = new java.util.HashSet<>();
    _jspx_imports_packages.add("javax.servlet");
    _jspx_imports_packages.add("javax.servlet.http");
    _jspx_imports_packages.add("javax.servlet.jsp");
    _jspx_imports_classes = new java.util.HashSet<>();
    _jspx_imports_classes.add("shop.vo.Product");
    _jspx_imports_classes.add("java.util.ArrayList");
  }

  private volatile javax.el.ExpressionFactory _el_expressionfactory;
  private volatile org.apache.tomcat.InstanceManager _jsp_instancemanager;

  public java.util.Map<java.lang.String,java.lang.Long> getDependants() {
    return _jspx_dependants;
  }

  public java.util.Set<java.lang.String> getPackageImports() {
    return _jspx_imports_packages;
  }

  public java.util.Set<java.lang.String> getClassImports() {
    return _jspx_imports_classes;
  }

  public javax.el.ExpressionFactory _jsp_getExpressionFactory() {
    if (_el_expressionfactory == null) {
      synchronized (this) {
        if (_el_expressionfactory == null) {
          _el_expressionfactory = _jspxFactory.getJspApplicationContext(getServletConfig().getServletContext()).getExpressionFactory();
        }
      }
    }
    return _el_expressionfactory;
  }

  public org.apache.tomcat.InstanceManager _jsp_getInstanceManager() {
    if (_jsp_instancemanager == null) {
      synchronized (this) {
        if (_jsp_instancemanager == null) {
          _jsp_instancemanager = org.apache.jasper.runtime.InstanceManagerFactory.getInstanceManager(getServletConfig());
        }
      }
    }
    return _jsp_instancemanager;
  }

  public void _jspInit() {
  }

  public void _jspDestroy() {
  }

  public void _jspService(final javax.servlet.http.HttpServletRequest request, final javax.servlet.http.HttpServletResponse response)
      throws java.io.IOException, javax.servlet.ServletException {

    final java.lang.String _jspx_method = request.getMethod();
    if (!"GET".equals(_jspx_method) && !"POST".equals(_jspx_method) && !"HEAD".equals(_jspx_method) && !javax.servlet.DispatcherType.ERROR.equals(request.getDispatcherType())) {
      response.sendError(HttpServletResponse.SC_METHOD_NOT_ALLOWED, "JSPs only permit GET POST or HEAD");
      return;
    }

    final javax.servlet.jsp.PageContext pageContext;
    javax.servlet.http.HttpSession session = null;
    final javax.servlet.ServletContext application;
    final javax.servlet.ServletConfig config;
    javax.servlet.jsp.JspWriter out = null;
    final java.lang.Object page = this;
    javax.servlet.jsp.JspWriter _jspx_out = null;
    javax.servlet.jsp.PageContext _jspx_page_context = null;


    try {
      response.setContentType("text/html; charset=UTF-8");
      pageContext = _jspxFactory.getPageContext(this, request, response,
      			null, true, 8192, true);
      _jspx_page_context = pageContext;
      application = pageContext.getServletContext();
      config = pageContext.getServletConfig();
      session = pageContext.getSession();
      out = pageContext.getOut();
      _jspx_out = out;

      out.write("\r\n");
      out.write("\r\n");
      out.write("\r\n");
      out.write("<!DOCTYPE html PUBLIC \"-//W3C//DTD XHTML 1.0 Strict//EN\" \"http://www.w3.org/TR/xhtml1/DTD/xhtml1-strict.dtd\">\r\n");
      out.write("<head>\r\n");
      out.write("<meta http-equiv=\"Content-Type\" content=\"text/html; charset=utf-8\" />\r\n");
      out.write("<title>Check!One Shop???</title>\r\n");
      out.write("<meta name=\"keywords\" content=\"\" />\r\n");
      out.write("<meta name=\"description\" content=\"\" />\r\n");
      out.write("<link href=\"http://fonts.googleapis.com/css?family=Open+Sans:400,300,600,700|Archivo+Narrow:400,700\" rel=\"stylesheet\" type=\"text/css\">\r\n");
      out.write("<link href=\"css/default.css\" rel=\"stylesheet\" type=\"text/css\" media=\"all\" />\r\n");
      out.write("</head>\r\n");
      out.write("<body>\r\n");
      out.write("<div id=\"wrapper-bg\">\r\n");
      out.write("\t<div id=\"wrapper\">\r\n");
      out.write("\t\t<div id=\"header\" class=\"container\">\r\n");
      out.write("\t\t\t<div id=\"logo\">\r\n");
      out.write("\t\t\t\t<h1><a href=\"CheckOneShop.jsp\"><span>Check!One Shop???</span>Welcome</a></h1>\r\n");
      out.write("\t\t\t</div>\r\n");
      out.write("\t\t\t<div id=\"menu\">\r\n");
      out.write("\t\t\t\t<ul>\r\n");
      out.write("\t\t\t\t\t<li class=\"active\"><a href=\"Login.jsp\" accesskey=\"1\" title=\"\">Login</a></li>\r\n");
      out.write("\t\t\t\t\t<li><a href=\"register.html\" accesskey=\"2\" title=\"\">Register</a></li>\r\n");
      out.write("\t\t\t\t\t<li><a href=\"#\" accesskey=\"3\" title=\"\">Cart</a></li>\r\n");
      out.write("\t\t\t\t\t<li><a href=\"#\" accesskey=\"4\" title=\"\">MyPage</a></li>\r\n");
      out.write("\t\t\t\t\t<li><a href=\"#\" accesskey=\"5\" title=\"\">Coming</a></li>\r\n");
      out.write("\t\t\t\t</ul>\r\n");
      out.write("\t\t\t</div>\t\r\n");
      out.write("\t\t</div>\r\n");
      out.write("\t\t<div class='clear'></div>\r\n");
      out.write("\t\t<form action=\"mainProduct.do\" method=\"get\">\r\n");
      out.write("\t\t\t<nav class=\"container\">\r\n");
      out.write("\t\t\t\t<ul id=\"menubar\">\r\n");
      out.write("\t\t\t\t\t<li ><input type=\"submit\" name=\"name\"  value=\"All_Item\"class=\"button-style\"></li>\r\n");
      out.write("\t\t\t\t\t<li ><input type=\"submit\" name=\"name\" value=\"outer\"class=\"button-style\"></li>\r\n");
      out.write("\t\t\t\t\t<li ><input type=\"submit\" name=\"name\" value=\"top\"class=\"button-style\"></li>\r\n");
      out.write("\t\t\t\t\t<li ><input type=\"submit\" name=\"name\" value=\"pants\"class=\"button-style\"></li>\r\n");
      out.write("\t\t\t\t\t<li ><input type=\"submit\" name=\"name\" value=\"dress\"class=\"button-style\"></li>\r\n");
      out.write("\t\t\t\t\t<li ><input type=\"submit\" name=\"name\" value=\"skirts\"class=\"button-style\"></li>\r\n");
      out.write("\t\t\t\t\t<li ><input type=\"submit\" name=\"name\" value=\"shoes\"class=\"button-style\"></li>\r\n");
      out.write("\t\t\t\t\t<li ><input type=\"submit\" name=\"question\" value=\"Question\"class=\"button-style\"></li>\r\n");
      out.write("\t\t\t\t</ul>\r\n");
      out.write("\t\t\t</nav>\r\n");
      out.write("\t\t\t<div class='clear'></div>\r\n");
      out.write("\t\t<div id=\"three-column\" class=\"container\">\r\n");
      out.write("\t\t\t\r\n");
      out.write("\t\t\t");
 ArrayList<Product> list=(ArrayList<Product>)request.getAttribute("list");
			int boxNumber;
			
      out.write("\r\n");
      out.write("\t\t\t<header>\r\n");
      out.write("\t\t\t\t<h2>");
      out.print(request.getAttribute("name"));
      out.write("</h2>\r\n");
      out.write("\t\t\t</header>\r\n");
      out.write("\t\t\t");

			if(!list.isEmpty())
			{
				for(int i=0; i<list.size(); i++ )
				{
					if((i+1)%3 == 0) boxNumber = 3;
					else boxNumber = (i+1)%3;
					Product product=list.get(i);
      out.write("\r\n");
      out.write("\t\t\t<div class=\"tbox");
      out.print(boxNumber);
      out.write("\">\r\n");
      out.write("\t\t\t<a>");
      out.print(i);
      out.write("</a>\r\n");
      out.write("\t\t\t\t<div class=\"box-style box-style01\">\r\n");
      out.write("\t\t\t\t\t<div class=\"content\"> <a href=\"Product.jsp\" class=\"image image-full\">\r\n");
      out.write("\t\t\t\t\t\t<img src=");
      out.print(product.getImage());
      out.write(" alt=\"\"></a>\r\n");
      out.write("\t\t\t\t\t\t<h2>");
      out.print(product.getName());
      out.write("</h2>\r\n");
      out.write("\t\t\t\t\t\t<p>");
      out.print(product.getPrice());
      out.write("</p>\r\n");
      out.write("\t\t\t\t\t\t<input type=\"submit\" value=\"More\"class=\"button-style\">\r\n");
      out.write("\t\t\t\t\t</div>\r\n");
      out.write("\t\t\t\t</div>\r\n");
      out.write("\t\t\t</div>\r\n");
      out.write("\t\t\t\t");
}
			}
      out.write("\r\n");
      out.write("\t\t</div>\r\n");
      out.write("</div>\r\n");
      out.write("<div id=\"footer\">\r\n");
      out.write("\t<p>&copy; Untitled. All rights reserved. Design by <a href=\"http://templated.co\" rel=\"nofollow\">Checkoneshop</a>. Photos by <a href=\"http://m.906studio.co.kr/\">906studio</a>.</p>\r\n");
      out.write("</div>\r\n");
      out.write("</body>\r\n");
      out.write("</html>\r\n");
      out.write("    ");
    } catch (java.lang.Throwable t) {
      if (!(t instanceof javax.servlet.jsp.SkipPageException)){
        out = _jspx_out;
        if (out != null && out.getBufferSize() != 0)
          try {
            if (response.isCommitted()) {
              out.flush();
            } else {
              out.clearBuffer();
            }
          } catch (java.io.IOException e) {}
        if (_jspx_page_context != null) _jspx_page_context.handlePageException(t);
        else throw new ServletException(t);
      }
    } finally {
      _jspxFactory.releasePageContext(_jspx_page_context);
    }
  }
}
