package com.tcp.service.impl;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.List;

import com.tcp.pojo.Product;
import com.tcp.service.ProductService;

public class ProductServiceImpl implements ProductService {

	@Override
	public List getProductList() {

		List productList = new ArrayList();
		Connection conn = null;
		Statement stmt = null;
		ResultSet rs = null;
		try {
			Class.forName("com.mysql.jdbc.Driver");
			conn = DriverManager.getConnection(
					"jdbc:mysql://localhost:3306/gwap", "root", "");
			stmt = conn.createStatement();
			rs = stmt.executeQuery("select * from product");

			while (rs.next()) {
				Product product = new Product();

				product.setProductid(Integer.parseInt(rs.getString("productid")));
				product.setName(rs.getString("name"));
				product.setDescription(rs.getString("description"));
				product.setBasePrice(Float.parseFloat(rs.getString("basePrice")));
				product.setCategoryid(Integer.parseInt(rs
						.getString("categoryid")));
				product.setAuthor(rs.getString("author"));
				product.setPublish(rs.getString("publish"));
				product.setPages(Integer.parseInt(rs.getString("pages")));
				product.setImages(rs.getString("images"));
				productList.add(product);
			}

		} catch (Exception e) {
			e.printStackTrace();
			throw new RuntimeException("error when query product", e);
		} finally {
			try {
				rs.close();
				stmt.close();
				conn.close();
			} catch (Exception e) {
				e.printStackTrace();
				throw new RuntimeException("error when query product", e);
			}
		}
		return productList;
	}

	@Override
	public Product getProductById(int productid) {
		Connection conn = null;
		PreparedStatement stmt = null;
		ResultSet rs = null;
		Product product = new Product();
		try {
			Class.forName("com.mysql.jdbc.Driver");

			conn = DriverManager.getConnection(
					"jdbc:mysql://localhost:3306/gwap", "root", "");
			String sql = "select * from product where productid =?";
			stmt = conn.prepareStatement(sql, Statement.RETURN_GENERATED_KEYS);
			stmt.setInt(1, productid);
			rs = stmt.executeQuery();
			while (rs.next()) {
				product.setProductid(Integer.parseInt(rs.getString("productid")));
				product.setName(rs.getString("name"));
				product.setDescription(rs.getString("description"));
				product.setBasePrice(Float.parseFloat(rs.getString("basePrice")));
				product.setCategoryid(Integer.parseInt(rs
						.getString("categoryid")));
				product.setAuthor(rs.getString("author"));
				product.setPublish(rs.getString("publish"));
				product.setPages(Integer.parseInt(rs.getString("pages")));
				product.setImages(rs.getString("images"));
			}
		} catch (Exception e) {
			e.printStackTrace();

			throw new RuntimeException("error when querying products ", e);
		} finally {
			try {
				rs.close();
				stmt.close();
				conn.close();
			} catch (Exception e) {
				e.printStackTrace();

				throw new RuntimeException("error when querying products ", e);
			}
		}

		return product;
	}

}
