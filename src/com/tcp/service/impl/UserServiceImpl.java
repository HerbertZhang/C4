package com.tcp.service.impl;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.List;

import com.tcp.pojo.User;
import com.tcp.service.UserService;

public class UserServiceImpl implements UserService
{

	@Override
	public List getUserList()
	{
		List userList = new ArrayList();
		Connection conn = null;	
		Statement stmt = null;
		ResultSet rs = null;	
		try {
			Class.forName("com.mysql.jdbc.Driver");
			
			conn = DriverManager.getConnection("jdbc:mysql://localhost:3306/gwap","root","");
			
			stmt = conn.createStatement();
			
			rs = stmt.executeQuery("select users.userid,password,contactid,street1,street2,city,province,country,zip,email,homephone,cellphone,officephone from users,contactinfo where users.userid=contactinfo.userid");
			
			while(rs.next()){
				User user=new User();
				user.setUserid(rs.getString("userid"));
				user.setPassword(rs.getString("password"));
				user.setContactid(Integer.parseInt(rs.getString("contactid")));
				user.setStreet1(rs.getString("street1"));
				user.setStreet2(rs.getString("street2"));
				user.setCity(rs.getString("city"));
				user.setProvince(rs.getString("province"));
				user.setCountry(rs.getString("country"));
				user.setZip(rs.getString("zip"));
				user.setEmail(rs.getString("email"));
				user.setHomephone(rs.getString("homephone"));
				user.setCellphone(rs.getString("cellphone"));
				user.setOfficephone(rs.getString("officephone"));
				userList.add(user);
			}
		} catch (Exception e) {
			e.printStackTrace();
			
			throw new RuntimeException("error when querying users ",e);
		} finally {
			try {
				rs.close();
				stmt.close();
				conn.close();
			} catch (Exception e) {
				e.printStackTrace();
				
				throw new RuntimeException("error when querying users ",e);
			}
		}

		return userList;
	}

	public User getUserById(String userid) {
		Connection conn = null;	
		PreparedStatement  stmt = null;
		ResultSet rs = null;	
		User user=new User();
		try {
			Class.forName("com.mysql.jdbc.Driver");
			
			conn = DriverManager.getConnection("jdbc:mysql://localhost:3306/gwap","root","");
			String sql="select users.userid,password,contactid,street1,street2,city,province,country,zip,email,homephone,cellphone,officephone from users,contactinfo where users.userid=contactinfo.userid and users.userid=? ";
			stmt = conn.prepareStatement(sql,Statement.RETURN_GENERATED_KEYS);
			stmt.setString(1, userid);
			rs = stmt.executeQuery();
			while(rs.next()){
				
				user.setUserid(rs.getString("userid"));
				user.setPassword(rs.getString("password"));
				user.setContactid(Integer.parseInt(rs.getString("contactid")));
				user.setStreet1(rs.getString("street1"));
				user.setStreet2(rs.getString("street2"));
				user.setCity(rs.getString("city"));
				user.setProvince(rs.getString("province"));
				user.setCountry(rs.getString("country"));
				user.setZip(rs.getString("zip"));
				user.setEmail(rs.getString("email"));
				user.setHomephone(rs.getString("homephone"));
				user.setCellphone(rs.getString("cellphone"));
				user.setOfficephone(rs.getString("officephone"));
			}
		} catch (Exception e) {
			e.printStackTrace();
			
			throw new RuntimeException("error when querying user ",e);
		} finally {
			try {
				rs.close();
				stmt.close();
				conn.close();
			} catch (Exception e) {
				e.printStackTrace();
				
				throw new RuntimeException("error when querying user ",e);
			}
		}

		return user;
	}

}
