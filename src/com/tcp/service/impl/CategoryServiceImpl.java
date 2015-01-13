package com.tcp.service.impl;


import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.List;

import com.tcp.pojo.Category;
import com.tcp.service.CategoryService;




public class CategoryServiceImpl implements CategoryService {

	@Override
	public List getCategoryList() {
		List categoryList = new ArrayList();
		
		Connection conn = null;
		
		Statement stmt = null;
		
		ResultSet rs = null;
		
		try {
			Class.forName("com.mysql.jdbc.Driver");
			
			conn = DriverManager.getConnection("jdbc:mysql://localhost:3306/gwap","root","");
			
			stmt = conn.createStatement();
			
		rs = stmt.executeQuery("select * from category");
	
			
			while(rs.next()){
				Category category = new Category();
				
				category.setCategoryid(rs.getString("categoryid").toString());
				category.setName(rs.getString("name").toString());
				category.setDescription(rs.getString("description").toString());
				
				categoryList.add(category);
			}
		} catch (Exception e) {
			e.printStackTrace();
			
			throw new RuntimeException("error when querying category ",e);
		} finally {
			try {
				rs.close();
				stmt.close();
				conn.close();
			} catch (Exception e) {
				e.printStackTrace();
				
				throw new RuntimeException("error when querying category ",e);
			}
		}

		return categoryList;
	}

}
