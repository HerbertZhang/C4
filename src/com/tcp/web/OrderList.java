package com.tcp.web;

import java.io.IOException;
import java.io.PrintWriter;
import java.util.Iterator;
import java.util.List;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.tcp.pojo.Orders;
import com.tcp.pojo.User;
import com.tcp.service.OrdersService;
import com.tcp.service.impl.OrderServiceImpl;

public class OrderList extends HttpServlet {
	OrdersService os=new OrderServiceImpl();
	List<Orders> orderList=os.getOrdersList();

	@Override
	protected void doGet(HttpServletRequest req, HttpServletResponse resp)
			throws ServletException, IOException {
		// TODO Auto-generated method stub
		//super.doGet(req, resp);
		resp.setCharacterEncoding("UTF-8");
		PrintWriter out =resp.getWriter();
		
		out.write("<!DOCTYPE HTML PUBLIC \"-//W3C//DTD HTML 4.01 Transitional//EN\">");
		out.write("<html>");
		out.write("	<head>");
		out.write("		<title>达内电子商务门户</title>");
		out.write("		<meta http-equiv=\"Content-Type\" content=\"text/html; charset=UTF-8\">");
		out.write("		<meta name=\"description\" content=\"达内电子商务门户\">");
		out.write("		<link href=\"css/tarena.css\" rel=stylesheet>");
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
		out.write("					<a href=index.jsp>达内电子商务门户</a> →<img border=\"0\" src=\"images/dog.gif\" width=\"19\" height=\"18\"> 定单列表");
		out.write("				</td>");
		out.write("			</tr>");
		out.write("		</table>");
		out.write("		<br>");
		out.write("		<table cellpadding=\"3\" cellspacing=\"1\" align=\"center\" class=\"tableborder1\">");
		out.write("			<tr>");
		out.write("				<td valign=middle align=center height=25 background=\"images/bg2.gif\"><font color=\"#ffffff\"><b>序号</b></font></td>");
		out.write("				<td valign=middle align=center height=25 background=\"images/bg2.gif\"><font color=\"#ffffff\"><b>订单编号</b></font></td>");
		out.write("				<td valign=middle align=center height=25 background=\"images/bg2.gif\"><font color=\"#ffffff\"><b>订单金额</b></font></td>");
		out.write("				<td valign=middle align=center height=25 background=\"images/bg2.gif\"><font color=\"#ffffff\"><b>订单状态</b></font></td>");
		out.write("				<td valign=middle align=center height=25 background=\"images/bg2.gif\"><font color=\"#ffffff\"><b>付款方式</b></font></td>");
		out.write("				<td valign=middle align=center height=25 background=\"images/bg2.gif\"><font color=\"#ffffff\"><b>操作</b></font></td>");
		out.write("			</tr>");
		
		for (Iterator<Orders> it = orderList.iterator(); it.hasNext();) {
			Orders order = it.next();
			out.write("			<tr>");
			out.write("				<td class=tablebody2 valign=middle align=center>1</td>");
			out.write("				<td class=tablebody1 valign=middle>&nbsp;&nbsp;<a href=\"orderDetail.html\">389</a></td>");
			out.write("				<td class=tablebody2 valign=middle align=left>&nbsp;&nbsp;￥59.0</td>");
			out.write("				<td class=tablebody1 valign=middle align=center>pending</td>");
			out.write("				<td class=tablebody2 valign=middle align=left>&nbsp;&nbsp;货到付款 </td>");
			out.write("				<td class=tablebody1 valign=middle align=center>");
			out.write("					<input type=\"button\" value=\"删除\" onclick=\"javascript:window.location='orderList.html';\">&nbsp;");
			out.write("					<input type=\"button\" value=\"明细\" onclick=\"javascript:window.location='orderDetail.html';\">");
			out.write("				</td>");
			out.write("			</tr>");

			
		}
	
		
		
		
		
		out.write("		</table>");
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

	}

	@Override
	protected void doPost(HttpServletRequest req, HttpServletResponse resp)
			throws ServletException, IOException {
		// TODO Auto-generated method stub
		super.doPost(req, resp);
	}

}
