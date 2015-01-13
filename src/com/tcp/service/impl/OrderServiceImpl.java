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
		List ordersList = new ArrayList();
		
		Connection conn = null;
		
		Statement stmt = null;
		
		ResultSet rs = null;
		
		ResultSet rs1 = null;
		
		
		try {
			Class.forName("com.mysql.jdbc.Driver");
			
			conn = DriverManager.getConnection("jdbc:mysql://localhost:3306/gwap","root","");
			
			stmt = conn.createStatement();
			
			rs = stmt.executeQuery("select * from orders");
			
			while(rs.next()){
				Orders orders = new Orders();
				
				orders.setOrderid(rs.getString("orderid").toString());
				orders.setOrdername(rs.getString("name").toString());
				orders.setCost(rs.getString("cost").toString());
				orders.setUserid(rs.getString("userid").toString());
				orders.setStatusid(rs.getString("statusid").toString());
				orders.setPaywayid(rs.getString("paywayid").toString());
				ordersList.add(orders);
				
				rs1 = stmt.executeQuery("select * from orderline where orderid='"+orders.getOrderid()+"'");
				orders.setLineid(rs1.getString("lineid").toString());
				orders.setProductid(rs1.getString("productid").toString());
				orders.setAmount(rs1.getString("amount").toString());
					
					
				
				rs1 = stmt.executeQuery("select * from orderline where statusid='"+orders.getStatusid()+"'");
                orders.setStatusname(rs1.getString("name").toString());
				orders.setDescription(rs1.getString("description").toString());
				
					
				
				rs1 = stmt.executeQuery("select * from orderline where paywayid='"+orders.getPaywayid()+"'");
				orders.setPaystyle(rs1.getString("paystyle").toString());
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
