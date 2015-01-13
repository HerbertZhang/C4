package com.tcp.service.impl;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.List;

import com.tcp.pojo.Orders;
import com.tcp.service.OrdersService;


public class OrderServiceImpl implements OrdersService {

	@Override
	public List getOrdersList() {
		List<Orders> ordersList = new ArrayList<Orders>();
		
		Connection conn = null;
		
		Statement stmt = null;
		
		ResultSet rs = null;
		
		ResultSet rs1 = null;
		
		
		try {
			Class.forName("com.mysql.jdbc.Driver");
			
			conn = DriverManager.getConnection("jdbc:mysql://localhost:3306/gwap","root","");
			
			stmt = conn.createStatement();
			
			rs = stmt.executeQuery("select * from orders,orderstatus,payway,orderline where orders.orderid=orderline.orderid and orders.paywayid=payway.paywayid and orders.statusid=orderstatus.statusid");
			
			while(rs.next()){
				Orders orders = new Orders();
				
				orders.setOrderid(rs.getInt("orderid"));
				orders.setOrdername(rs.getString("name"));
				orders.setCost(Float.parseFloat(rs.getString("cost")));
				orders.setUserid(rs.getString("userid"));
				orders.setStatusid(rs.getInt("statusid"));
				orders.setPaywayid(rs.getInt("paywayid"));
				////////////////////////orderline
				orders.setLineid(rs.getInt("lineid"));
				orders.setProductid(rs.getInt("productid"));
				orders.setAmount(rs.getInt("amount"));
					
					
				
                orders.setStatusname(rs.getString("orderstatus.name"));
				orders.setDescription(rs.getString("orderstatus.description"));
				
					
				
				orders.setPaystyle(rs.getString("paystyle").toString());
				ordersList.add(orders);
				
			}
			
		} catch (Exception e) {
			e.printStackTrace();
			
			throw new RuntimeException("error when querying orderstatus ",e);
		} finally {
			try {
				rs.close();
				stmt.close();
				conn.close();
			} catch (Exception e) {
				e.printStackTrace();
				
				throw new RuntimeException("error when querying orderstatus ",e);
			}
		}

		return ordersList;
	}

}
