package com.tcp.web;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

public class Login extends HttpServlet {

	@Override
	public void doGet(HttpServletRequest req, HttpServletResponse resp)
			throws ServletException, IOException {
		// TODO Auto-generated method stub
		//super.doGet(req, resp);
		resp.setCharacterEncoding("UTF-8");
		PrintWriter out =  resp.getWriter();
		out.write("<!DOCTYPE HTML PUBLIC \"-//W3C//DTD HTML 4.01 Transitional//EN\">");
		out.write("<html>");
		out.write("	<head>");
		out.write("		<title>达内电子商务门户</title>");
		out.write("		<meta http-equiv=\"Content-Type\" content=\"text/html; charset=UTF-8\">");
		out.write("		<meta name=\"description\" content=\"达内电子商务门户\">");
		out.write("		<link href=\"css/tarena.css\" rel=stylesheet>");
		out.write("              <script language=\"javascript\" src=\"loginvalidate.js\">");
		out.write("	       </script>");
		out.write("	</head>");
		out.write("	<body topmargin=\"0\" leftmargin=\"0\" rightmargin=\"0\" bottommargin=\"0\">");
		out.write("<!-- Header Start -->");
		out.write("		<table width=\"100%\" border=\"0\" cellspacing=\"0\" cellpadding=\"0\" id=\"table2\">");
		out.write("			<tr>");
		out.write("				<td align=\"left\" width=\"7%\" background=\"images/top_bg.gif\"><img src=\"images/logo.gif\" width=\"286\" height=\"58\"></td>");
		out.write("				<td width=\"62%\" background=\"images/top_bg.gif\">　</td>");
		out.write("				<td width=\"31%\" background=\"images/top_bg.gif\" align=\"right\"><img src=\"images/top_r.gif\" width=\"352\" height=\"58\" border=\"0\"></td>");
		out.write("			</tr>");
		out.write("		</table>");
		out.write("		<table width=\"100%\" border=\"0\" cellspacing=\"0\" cellpadding=\"0\">");
		out.write("			<tr>");
		out.write("				<td background=\"images/dh_bg.gif\" align=\"left\" height=\"12\">");
		out.write("					<table width=\"100\" border=\"0\" cellspacing=\"0\" cellpadding=\"0\" align=\"center\">");
		out.write("						<tr>");
		out.write("							<td width=\"5%\"></td>");
		out.write("							");
		out.write("          <td width=\"10%\"><a href=\"productList\"><img name=\"Image1\" border=\"0\" src=\"images/index.gif\" width=\"90\" height=\"36\"></a></td>");
		out.write("							");
		out.write("          <td width=\"10%\"><a href=\"userManager\"><img name=\"Image2\" border=\"0\" src=\"images/reg.gif\" width=\"92\" height=\"36\"></a></td>");
		out.write("							");
		out.write("          <td width=\"10%\"><a href=\"shoppingCart\"><img name=\"Image4\" border=\"0\" src=\"images/cart.gif\" width=\"92\" height=\"36\"></a></td>");
		out.write("							");
		out.write("          <td width=\"10%\"><a href=\"orderList\"><img name=\"Image5\" border=\"0\" src=\"images/order.gif\" width=\"92\" height=\"36\"></a></td>");
		out.write("							");
		out.write("          <td width=\"10%\"><a href=\"productList\"><img name=\"Image6\" border=\"0\" src=\"images/exit.gif\" width=\"92\" height=\"36\"></a></td>");
		out.write("						</tr>");
		out.write("					</table>");
		out.write("				</td>");
		out.write("			</tr>");
		out.write("		</table>");
		out.write("		<table cellspacing=\"1\" cellpadding=\"3\" align=\"center\" border=\"0\" width=\"98%\">");
		out.write("			<tr>");
		out.write("				<td width=\"65%\"><br>");
		out.write("					>> 欢迎访问 <b>达内电子商务门户</b>");
		out.write("				</td>");
		out.write("				<td width=\"35%\" align=\"right\">");
		out.write("				</td>");
		out.write("			</tr>");
		out.write("		</table>");
		out.write("<!-- Header End -->");
		out.write("<!-- Body Start -->");
		out.write("		<table cellspacing=\"1\" cellpadding=\"3\" align=\"center\" class=\"tableBorder2\">");
		out.write("			<tr>");
		out.write("				<td height=\"25\" valign=\"middle\">");
		out.write("					<img src=\"images/Forum_nav.gif\" align=\"absmiddle\">");
		out.write("					<a href=index.jsp>达内电子商务门户</a> 用户登陆");
		out.write("				</td>");
		out.write("			</tr>");
		out.write("		</table>");
		out.write("		<br>");
		out.write("		<form method=\"post\" onsubmit=\"return loginvalidate(this)\" action=\"productList\">");
		out.write("		<table cellpadding=\"3\" cellspacing=\"1\" align=\"center\" class=\"tableborder1\">");
		out.write("			<tr>");
		out.write("				<td colspan=\"4\" valign=\"middle\" align=\"center\" height=\"25\" background=\"images/bg2.gif\" width=\"50\">");
		out.write("					<font color=\"#ffffff\">");
		out.write("						<b>用户登陆</b>");
		out.write("					</font>");
		out.write("				</td>");
		out.write("				");
		out.write("			</tr>");
		out.write("			<tr>");
		out.write("				<td class=tablebody1 valign=\"middle\" height=\"20\" width=\"30%\">");
		out.write("     					 请输入您的用户名:");
		out.write("				 </td>");
		out.write("				<td class=tablebody1 valign=\"middle\" height=\"20\" width=\"80%\">");
		out.write("					");
		out.write("						<input type=\"text\">&nbsp;<a href=\"/shop/userRegister\">注册新用户</a>");
		out.write("				");
		out.write("				");
		out.write("				");
		out.write("				</td>");
		out.write("    ");
		out.write("			</tr>   ");
		out.write("			<tr>");
		out.write("				<td class=tablebody1 valign=\"middle\" width=\"30%\" height=\"25\">");
		out.write("     					 请输入您的密码:");
		out.write("				 </td>");
		out.write("				<td class=tablebody1 valign=\"middle\" width=\"80%\">");
		out.write("		");
		out.write("						<input type=password>");
		out.write("					");
		out.write("				");
		out.write("				");
		out.write("				</td>");
		out.write("    ");
		out.write("			</tr>   ");
		out.write("			");
		out.write("			");
		out.write("			<tr>");
		out.write("				<td colspan=\"4\" class=tablebody2 align=\"center\" valign=\"middle\" width=\"60%\">");
		out.write("				");
		out.write("				");
		out.write("						<input  type=submit value=登陆>");
		out.write("					");
		out.write("     					");
		out.write("				 </td>");
		out.write("				");
		out.write("    ");
		out.write("			</tr>   ");
		out.write("			");
		out.write("			");
		out.write("");
		out.write("		</table>");
		out.write("		</form>");
		out.write("		<br>");
		out.write("<!-- Body End -->");
		out.write("<!-- Footer Start -->");
		out.write("		<table width=\"100%\" border=\"0\" cellspacing=\"0\" cellpadding=\"0\" align=\"center\" height=\"28\">");
		out.write("			<tr>");
		out.write("				<td height=\"17\" background=\"images/bot_bg.gif\">");
		out.write("				</td>");
		out.write("			</tr>");
		out.write("		</table>");
		out.write("		<table width=\"100%\" border=\"0\" cellspacing=\"0\" cellpadding=\"0\" align=\"center\">");
		out.write("			<tr>");
		out.write("				<td bgcolor=\"#f1f1f6\" height=\"53\" valign=\"center\">");
		out.write("					<p align=\"center\">");
		out.write("						Copyright &copy;2004 - 2005 <a href=\"http://www.tarena.com.cn\"><b>Tarena</b><font color=\"red\">.com.cn</font></a>");
		out.write("					</p>");
		out.write("				</td>");
		out.write("			</tr>");
		out.write("		</table>");
		out.write("<!-- Footer End -->");
		out.write("	</body>");
		out.write("</html>");
		out.write("");
	}

	@Override
	protected void doPost(HttpServletRequest req, HttpServletResponse resp)
			throws ServletException, IOException {
		// TODO Auto-generated method stub
		super.doPost(req, resp);
	}

}
