package com.tcp.web;

import java.io.IOException;
import java.io.PrintWriter;
import java.util.Iterator;
import java.util.List;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.tcp.pojo.Product;
import com.tcp.service.ProductService;
import com.tcp.service.impl.ProductServiceImpl;

public class ProductList extends HttpServlet {

	@Override
	protected void doGet(HttpServletRequest req, HttpServletResponse resp)
			throws ServletException, IOException {
		// TODO Auto-generated method stub
		// super.doGet(req, resp);
		try {
			ProductService productService = new ProductServiceImpl();
			// ProductService productService =
			// ServiceFactory.getProductService();
			List productList = productService.getProductList();
			toProductList(resp, productList);
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
			toError(resp, e.getMessage());
		}
	}

	private void toError(HttpServletResponse resp, String message)
			throws IOException {
		PrintWriter out = resp.getWriter();

		out.println("<html>");
		out.println("<head>");
		out.println("	<title>Error</title>");
		out.println("</head>");
		out.println("<body>");
		out.println("	<h2 align=\"center\">Error</h2>");
		out.println("	<hr>");
		out.println("	System Error," + message + "!");
		out.println("</body>");
		out.println("</html>");

		out.close();
	}

	private void toProductList(HttpServletResponse resp, List productList)
			throws IOException {
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
		out.write("					<a href=../../index.jsp>达内电子商务门户</a> →<img border=\"0\" src=\"images/dog.gif\" width=\"19\" height=\"18\">欢迎<font color=\"red\">admin</font>光临！");
		out.write("				</td>");
		out.write("			</tr>");
		out.write("		</table>");
		out.write("		<br>");
		out.write("		<table cellpadding=\"3\" cellspacing=\"1\" align=\"center\" class=\"tableborder1\">");
		out.write("			<tr>");
		out.write("				<td valign=\"middle\" align=\"center\" height=\"25\" background=\"images/bg2.gif\" width=\"8%\">");
		out.write("					<font color=\"#ffffff\">");
		out.write("						<b>序号</b>");
		out.write("					</font>");
		out.write("				</td>");
		out.write("				<td valign=\"middle\" align=\"center\" height=\"25\" background=\"images/bg2.gif\" width=\"60%\">");
		out.write("					<font color=\"#ffffff\">");
		out.write("						<b>产品名称</b>");
		out.write("					</font>");
		out.write("				</td>");
		out.write("				<td valign=\"middle\" align=\"center\" height=\"25\" background=\"images/bg2.gif\" width=\"8%\">");
		out.write("					<font color=\"#ffffff\">");
		out.write("						<b>价格</b>");
		out.write("					</font>");
		out.write("				</td>");
		out.write("				<td valign=\"middle\" align=\"center\" height=\"25\" background=\"images/bg2.gif\" width=\"24%\">");
		out.write("					<font color=\"#ffffff\">");
		out.write("						<b>操作</b>");
		out.write("					</font>");
		out.write("				</td>");
		out.write("			</tr>");

		for (Iterator i = productList.iterator(); i.hasNext();) {
			Product product = (Product) i.next();

			out.write("			<tr>");
			out.write("				<td class=tablebody2 valign=\"middle\" align=\"center\" width=\"8%\">");
			out.write("					" + product.getProductid() + "");
			out.write("				</td>");
			out.write("				");
			out.write("    <td class=tablebody1 valign=\"middle\" width=\"60%\"> &nbsp;&nbsp;<a href=\"productDetail?productid="+product.getProductid()+"\">"
					+ product.getName() + "</a> ");
			out.write("    </td>");
			out.write("				<td class=tablebody2 valign=\"middle\" align=\"center\" width=\"8%\">");
			out.write("					" + product.getBasePrice() + "");
			out.write("				</td>");
			out.write("				");
			out.write("    <td class=tablebody1 valign=\"middle\" align=\"center\" width=\"24%\"> <a href=\"shoppingCart\"><img border=\"0\" src=\"images/car_new.gif\" width=\"97\" height=\"18\"></a> ");
			out.write("    </td>");
			out.write("			</tr>   ");

		}

		// out.write("			<tr>");
		// out.write("				<td class=tablebody2 valign=\"middle\" align=\"center\" width=\"8%\">");
		// out.write("					2");
		// out.write("				</td>");
		// out.write("				");
		// out.write("    <td class=tablebody1 valign=\"middle\" width=\"60%\"> &nbsp;&nbsp;<a href=\"productDetail\">Effective ");
		// out.write("      Java中文版</a> </td>");
		// out.write("				<td class=tablebody2 valign=\"middle\" align=\"center\" width=\"8%\">");
		// out.write("					39.0");
		// out.write("				</td>");
		// out.write("				");
		// out.write("    <td class=tablebody1 valign=\"middle\" align=\"center\" width=\"24%\"> <a href=\"../shoppingCart/shoppingCart.html\"><img border=\"0\" src=\"images/car_new.gif\" width=\"97\" height=\"18\"></a> ");
		// out.write("    </td>");
		// out.write("			</tr>");
		//
		//
		//
		// out.write("			<tr>");
		// out.write("				<td class=tablebody2 valign=\"middle\" align=\"center\" width=\"8%\">");
		// out.write("					3");
		// out.write("				</td>");
		// out.write("				");
		// out.write("    <td class=tablebody1 valign=\"middle\" width=\"60%\"> &nbsp;&nbsp;<a href=\"productDetail.html\">精通Spring</a> ");
		// out.write("    </td>");
		// out.write("				<td class=tablebody2 valign=\"middle\" align=\"center\" width=\"8%\">");
		// out.write("					39.0");
		// out.write("				</td>");
		// out.write("				");
		// out.write("    <td class=tablebody1 valign=\"middle\" align=\"center\" width=\"24%\"> <a href=\"../shoppingCart/shoppingCart.html\"><img border=\"0\" src=\"images/car_new.gif\" width=\"97\" height=\"18\"></a> ");
		// out.write("    </td>");
		// out.write("			</tr>");
		// out.write("			<tr>");
		// out.write("				<td class=tablebody2 valign=\"middle\" align=\"center\" width=\"8%\">");
		// out.write("					4");
		// out.write("				</td>");
		// out.write("				");
		// out.write("    <td class=tablebody1 valign=\"middle\" width=\"60%\"> &nbsp;&nbsp;<a href=\"productDetail.html\">深入浅出Hibernate</a> ");
		// out.write("    </td>");
		// out.write("				<td class=tablebody2 valign=\"middle\" align=\"center\" width=\"8%\">");
		// out.write("					59.0");
		// out.write("				</td>");
		// out.write("				");
		// out.write("    <td class=tablebody1 valign=\"middle\" align=\"center\" width=\"24%\"> <a href=\"../shoppingCart/shoppingCart.html\"><img border=\"0\" src=\"images/car_new.gif\" width=\"97\" height=\"18\"></a> ");
		// out.write("    </td>");
		// out.write("			</tr>");
		// out.write("			<tr>");
		// out.write("				<td class=tablebody2 valign=\"middle\" align=\"center\" width=\"8%\">");
		// out.write("					5");
		// out.write("				</td>");
		// out.write("				");
		// out.write("    <td class=tablebody1 valign=\"middle\" width=\"60%\"> &nbsp;&nbsp;<a href=\"productDetail.html\">JAVA编程思想：第3版</a> ");
		// out.write("    </td>");
		// out.write("				<td class=tablebody2 valign=\"middle\" align=\"center\" width=\"8%\">");
		// out.write("					95.0");
		// out.write("				</td>");
		// out.write("				");
		// out.write("    <td class=tablebody1 valign=\"middle\" align=\"center\" width=\"24%\"> <a href=\"../shoppingCart/shoppingCart.html\"><img border=\"0\" src=\"images/car_new.gif\" width=\"97\" height=\"18\"></a> ");
		// out.write("    </td>");
		// out.write("			</tr>");
		// out.write("			<tr>");
		// out.write("				<td class=tablebody2 valign=\"middle\" align=\"center\" width=\"8%\">");
		// out.write("					6");
		// out.write("				</td>");
		// out.write("				");
		// out.write("    <td class=tablebody1 valign=\"middle\" width=\"60%\"> &nbsp;&nbsp;<a href=\"productDetail.html\">Java ");
		// out.write("      2核心技术（第6版） 卷I：基础知识 </a> </td>");
		// out.write("				<td class=tablebody2 valign=\"middle\" align=\"center\" width=\"8%\">");
		// out.write("					75.0");
		// out.write("				</td>");
		// out.write("				");
		// out.write("    <td class=tablebody1 valign=\"middle\" align=\"center\" width=\"24%\"> <a href=\"../shoppingCart/shoppingCart.html\"><img border=\"0\" src=\"images/car_new.gif\" width=\"97\" height=\"18\"></a> ");
		// out.write("    </td>");
		// out.write("			</tr>");
		// out.write("			<tr>");
		// out.write("				<td class=tablebody2 valign=\"middle\" align=\"center\" width=\"8%\">");
		// out.write("					7");
		// out.write("				</td>");
		// out.write("				");
		// out.write("    <td class=tablebody1 valign=\"middle\" width=\"60%\"> &nbsp;&nbsp;<a href=\"productDetail.html\">Tomcat与Java ");
		// out.write("      Web开发技术详解</a> </td>");
		// out.write("				<td class=tablebody2 valign=\"middle\" align=\"center\" width=\"8%\">");
		// out.write("					45.0");
		// out.write("				</td>");
		// out.write("				");
		// out.write("    <td class=tablebody1 valign=\"middle\" align=\"center\" width=\"24%\"> <a href=\"../shoppingCart/shoppingCart.html\"><img border=\"0\" src=\"images/car_new.gif\" width=\"97\" height=\"18\"></a> ");
		// out.write("    </td>");
		// out.write("			</tr> ");
		// out.write("			<tr>");
		// out.write("				<td class=tablebody2 valign=\"middle\" align=\"center\" width=\"8%\">");
		// out.write("					8");
		// out.write("				</td>");
		// out.write("				");
		// out.write("    <td class=tablebody1 valign=\"middle\" width=\"60%\"> &nbsp;&nbsp;<a href=\"productDetail.html\">Java与模式</a> ");
		// out.write("    </td>");
		// out.write("				<td class=tablebody2 valign=\"middle\" align=\"center\" width=\"8%\">");
		// out.write("					88.0");
		// out.write("				</td>");
		// out.write("				");
		// out.write("    <td class=tablebody1 valign=\"middle\" align=\"center\" width=\"24%\"> <a href=\"../shoppingCart/shoppingCart.html\"><img border=\"0\" src=\"images/car_new.gif\" width=\"97\" height=\"18\"></a> ");
		// out.write("    </td>");
		// out.write("			</tr>");

		out.write("		</table>");
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
		out.close();
	}

	@Override
	protected void doPost(HttpServletRequest req, HttpServletResponse resp)
			throws ServletException, IOException {
		// TODO Auto-generated method stub
		// super.doPost(req, resp);
	}

}
