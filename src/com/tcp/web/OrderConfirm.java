package com.tcp.web;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

public class OrderConfirm extends HttpServlet {

	@Override
	protected void doGet(HttpServletRequest req, HttpServletResponse resp)
			throws ServletException, IOException {
		// TODO Auto-generated method stub
		super.doGet(req, resp);
		resp.setCharacterEncoding("UTF-8");
		PrintWriter out = resp.getWriter();
		
		out.write("<!DOCTYPE HTML PUBLIC \"-//W3C//DTD HTML 4.01 Transitional//EN\">");
		out.write("<html>");
		out.write("	<head>");
		out.write("		<title>达内电子商务门户</title>");
		out.write("		<meta http-equiv=\"Content-Type\" content=\"text/html; charset=utf-8\">");
		out.write("		<meta name=\"description\" content=\"达内电子商务门户\">");
		out.write("		<link href=\"css/tarena.css\" rel=stylesheet>");
		out.write("	</head>");
		out.write("	<body topmargin=\"0\" leftmargin=\"0\" rightmargin=\"0\" bottommargin=\"0\">");
		out.write("	");
		out.write("<!-- Header Start -->");
		out.write("");
		out.write("		<table width=\"100%\" border=\"0\" cellspacing=\"0\" cellpadding=\"0\" id=\"table2\">");
		out.write("			<tr>");
		out.write("				<td align=\"left\" width=\"7%\" background=\"images/top_bg.gif\"><img src=\"images/logo.gif\" width=\"286\" height=\"58\"></td>");
		out.write("				<td width=\"62%\" background=\"images/top_bg.gif\">　</td>");
		out.write("				<td width=\"31%\" background=\"images/top_bg.gif\" align=\"right\"><img src=\"images/top_r.gif\" width=\"352\" height=\"58\" border=\"0\"></td>");
		out.write("			</tr>");
		out.write("		</table>");
		out.write("		");
		out.write("		<table width=\"100%\" border=\"0\" cellspacing=\"0\" cellpadding=\"0\">");
		out.write("			<tr>");
		out.write("				<td background=\"images/dh_bg.gif\" align=\"left\" height=\"12\">");
		out.write("					<table width=\"100\" border=\"0\" cellspacing=\"0\" cellpadding=\"0\" align=\"center\">");
		out.write("						<tr>");
		out.write("							<td width=\"5%\"></td>");
		out.write("							");
		out.write("          <td width=\"10%\"><a href=\"productList\"><img name=\"Image1\" border=\"0\" src=\"images/index.gif\" width=\"90\" height=\"36\"></a></td>");
		out.write("							");
		out.write("          <td width=\"10%\"><a href=\"userManage\"><img name=\"Image2\" border=\"0\" src=\"images/reg.gif\" width=\"92\" height=\"36\"></a></td>");
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
		out.write("		");
		out.write("		<table cellspacing=\"1\" cellpadding=\"3\" align=\"center\" border=\"0\" width=\"98%\">");
		out.write("			<tr>");
		out.write("				<td width=\"65%\"><br>");
		out.write("					>> 欢迎访问 <b>达内电子商务门户</b>");
		out.write("				</td>");
		out.write("				<td width=\"35%\" align=\"right\">");
		out.write("				</td>");
		out.write("			</tr>");
		out.write("		</table>");
		out.write("		");
		out.write("<!-- Header End -->");
		out.write("");
		out.write("<!-- Body Start -->");
		out.write("	<form>");
		out.write("		<table cellspacing=\"1\" cellpadding=\"3\" align=\"center\" class=\"tableBorder2\">");
		out.write("			<tr>");
		out.write("				<td height=\"25\" valign=\"middle\">");
		out.write("					<img src=\"images/Forum_nav.gif\" align=\"absmiddle\">");
		out.write("					<a href=index.jsp>达内电子商务门户</a> →&nbsp<img border=\"0\" src=\"images/dog.gif\" width=\"19\" height=\"18\">&nbsp订单确认");
		out.write("				</td>");
		out.write("			</tr>");
		out.write("		</table>");
		out.write("		");
		out.write("		<br>");
		out.write("		");
		out.write("		<table cellspacing=\"1\" cellpadding=\"3\" align=\"center\" class=\"tableborder1\">");
		out.write("			<tr>");
		out.write("				<td valign=\"middle\" align=\"center\" height=\"25\" background=\"images/bg2.gif\" width=\"8%\" colspan=\"2\">");
		out.write("						<font color=\"#ffffff\" size=\"2pt\">");
		out.write("							<b>用户信息</b>");
		out.write("						</font>");
		out.write("						<input type=\"button\" value=\"修改\" onclick=\"javascript:window.location='../user/userModify.html';\">");
		out.write("				</td>");
		out.write("			</tr>");
		out.write("			<tr>");
		out.write("				<td class=tablebody2 valign=\"middle\" align=\"right\" width=\"40%\">用户名&nbsp:&nbsp</td>");
		out.write("				<td class=tablebody1>tarena</td>");
		out.write("			</tr>");
		out.write("			<tr>");
		out.write("				<td class=tablebody2 align=\"right\">联系地址&nbsp:&nbsp</td>");
		out.write("				<td class=tablebody1>北京东路668号B区901室</td>");
		out.write("			</tr>");
		out.write("			<tr>");
		out.write("				<td class=tablebody2 align=\"right\">邮编&nbsp:&nbsp</td>");
		out.write("				<td class=tablebody1>200001</td>");
		out.write("			</tr>");
		out.write("			<tr>");
		out.write("				<td class=tablebody2 align=\"right\">家庭电话&nbsp:&nbsp</td>");
		out.write("				<td class=tablebody1>61202663</td>");
		out.write("			</tr>");
		out.write("			<tr>");
		out.write("				<td class=tablebody2 align=\"right\">办公室电话&nbsp:&nbsp</td>");
		out.write("				<td class=tablebody1>61202663</td>");
		out.write("			</tr>");
		out.write("			<tr>");
		out.write("				<td class=tablebody2 align=\"right\">手机&nbsp:&nbsp</td>");
		out.write("				<td class=tablebody1>13211161676</td>");
		out.write("			</tr>");
		out.write("			<tr>");
		out.write("				<td class=tablebody2 align=\"right\">Email地址&nbsp:&nbsp</td>");
		out.write("				<td class=tablebody1>zhouyu@tarena.com.cn</td>");
		out.write("			</tr>");
		out.write("		</table>		");
		out.write("		");
		out.write("		<br>");
		out.write("		");
		out.write("		<table cellspacing=\"1\" cellpadding=\"3\" align=\"center\" class=\"tableborder1\">");
		out.write("			<tr>");
		out.write("				<td valign=\"middle\" align=\"center\" height=\"25\" background=\"images/bg2.gif\" width=\"8%\" colspan=\"2\">");
		out.write("					<font color=\"#ffffff\" size=\"2pt\">");
		out.write("						<b>付款方式</b>");
		out.write("					</font>");
		out.write("				</td>");
		out.write("			</tr>");
		out.write("			<tr>");
		out.write("				<td class=tablebody2 align=\"center\" width=\"40%\"></td>");
		out.write("				<td class=tablebody1>");
		out.write("					<select name=\"邮局汇款\">");
		out.write("						<option value=\"0\">邮局汇款</option>");
		out.write("						<option value=\"1\">银行转帐</option>");
		out.write("						<option value=\"2\">货到付款</option>");
		out.write("					</select>");
		out.write("				</td>");
		out.write("			</tr>");
		out.write("		</table>");
		out.write("		");
		out.write("		<br>");
		out.write("		");
		out.write("		<table cellspacing=\"1\" cellpadding=\"3\" align=\"center\" class=\"tableborder1\">");
		out.write("			<tr>");
		out.write("				<td valign=\"middle\" align=\"center\" height=\"25\" background=\"images/bg2.gif\" width=\"8%\" colspan=\"5\">");
		out.write("					<font color=\"#ffffff\" size=\"2pt\">");
		out.write("							<b>商品购物清单</b>");
		out.write("					</font>");
		out.write("					<input type=\"button\" value=\"修改\" onclick=\"javascript:window.location='../order/orderList.html';\" >");
		out.write("				</td>");
		out.write("			</tr>");
		out.write("			<tr>");
		out.write("				<td class=tablebody2 align=\"center\" width=\"3%\">1</td>");
		out.write("				<td class=tablebody1 width=\"52%\">精通Hibernate</td>");
		out.write("				<td class=tablebody2 width=\"15%\">价格&nbsp;:&nbsp;59.0</td>");
		out.write("				<td class=tablebody1 width=\"15%\">数量&nbsp;:&nbsp;1</td>");
		out.write("				<td class=tablebody2 width=\"15%\">小计&nbsp;:&nbsp;￥59</td>");
		out.write("			</tr>");
		out.write("			<tr>");
		out.write("				<td class=tablebody2 align=\"center\" width=\"3%\">2</td>");
		out.write("				<td class=tablebody1 width=\"52%\">中文版</td>");
		out.write("				<td class=tablebody2 width=\"15%\">价格&nbsp;:&nbsp;39.0</td>");
		out.write("				<td class=tablebody1 width=\"15%\">数量&nbsp;:&nbsp;2</td>");
		out.write("				<td class=tablebody2 width=\"15%\">小计&nbsp;:&nbsp;￥78</td>");
		out.write("			</tr>");
		out.write("			<tr>");
		out.write("				<td class=tablebody1 align=\"center\" colspan=\"4\"></td>");
		out.write("				<td class=tablebody1>合计&nbsp:&nbsp<font color=\"red\">￥137</font></td>");
		out.write("			</tr>");
		out.write("		</table>");
		out.write("		");
		out.write("		<br>");
		out.write("		");
		out.write("		<table cellspacing=\"1\" cellpadding=\"3\" align=\"center\" border=\"0\" width=\"98%\">");
		out.write("			<tr>");
		out.write("				<td width=\"65%\" align=\"center\">");
		out.write("					<b>请认真检查以上订单信息，确认无误后，点击&nbsp;→</b>");
		out.write("					<a href=\"../order/orderList.html\"><img border=\"0\" src=\"images/submit.gif\"></a>");
		out.write("				</td>");
		out.write("			</tr>");
		out.write("		</table>");
		out.write("		");
		out.write("		<br>");
		out.write("		</form>");
		out.write("<!-- Body End -->");
		out.write("");
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
		out.write("");
		out.write("	</body>");
		out.write("</html>");
	}

	@Override
	protected void doPost(HttpServletRequest req, HttpServletResponse resp)
			throws ServletException, IOException {
		// TODO Auto-generated method stub
		super.doPost(req, resp);
	}

	
}
