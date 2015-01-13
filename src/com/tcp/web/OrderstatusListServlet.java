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
import com.tcp.service.OrdersService;
import com.tcp.service.impl.OrderServiceImpl;

public class OrderstatusListServlet extends HttpServlet{

	@Override
	public void doGet(HttpServletRequest req, HttpServletResponse resp)
			throws ServletException, IOException {
		try{
			OrdersService ordersService = new OrderServiceImpl();
			
//			StudentService studentService = ServiceFactory.getStudentService();
			
			List ordersList = ordersService.getOrdersList();

			toOrdersList(resp, ordersList);
		} catch (Exception e){
			toError(resp,e.getMessage());
		}
		
	}

	private void toError(HttpServletResponse resp, String message) throws IOException {
		resp.setCharacterEncoding("UTF-8");
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

	private void toOrdersList(HttpServletResponse resp, List ordersList)
			throws IOException {
		resp.setCharacterEncoding("UTF-8");
		PrintWriter out = resp.getWriter();
		out.println("<html>");
		out.println("<head>");
		out.println("	<title>Orders List</title>");
		out.println("</head>");
		out.println("<body>");
		out.println("	<h2 align=\"center\">Orders List</h2>");
		out.println("	<hr>");
		out.println("	<center>");
		out.println("		<table border=\"1\">");
		out.println("			<tr>");
		out.println("				<th>1</th>");
		out.println("				<th>2</th>");
		out.println("				<th>3</th>");
		out.println("				<th>4</th>");
		out.println("				<th>5</th>");
		out.println("				<th>6</th>");
		out.println("				<th>7</th>");
		out.println("				<th>8</th>");
		out.println("				<th>9</th>");
		out.println("				<th>10</th>");
		out.println("				<th>11</th>");
		out.println("				<th>12</th>");		
		out.println("			</tr>");

		for(Iterator<Orders> it = ordersList.iterator();it.hasNext();){
			Orders orders = it.next();
			
			out.println("			<tr>");
			
			out.println("				<td>" + orders.getOrderid() + "</td>");
			
			out.println("				<td>" + orders.getOrdername() + "</td>");
			
			out.println("				<td>" + orders.getCost() + "</td>");
			
			out.println("				<td>" + orders.getUserid() + "</td>");
			
			out.println("				<td>" + orders.getStatusid()+ "</td>");
			
			out.println("				<td>" + orders.getPaywayid() + "</td>");
			
			out.println("				<td>" + orders.getLineid() + "</td>");
			
			out.println("				<td>" + orders.getProductid() + "</td>");
			
			out.println("				<td>" + orders.getAmount() + "</td>");
			
			out.println("				<td>" + orders.getStatusname() + "</td>");
			
			out.println("				<td>" + orders.getDescription() + "</td>");
			
			out.println("				<td>" + orders.getPaystyle() + "</td>");
			
			
			
			System.out.println(orders.getPaystyle());
			
			System.out.println(orders.getPaywayid());
			
			System.out.println(orders.getPaystyle());
			out.println("			</tr>");
		}
		
		out.println("		</table>");
		out.println("	</center>");
		out.println("</body>");
		out.println("</html>");
		
		out.close();
	}

	@Override
	public void doPost(HttpServletRequest req, HttpServletResponse resp)
			throws ServletException, IOException {
		
	}
	

}
