package com.tcp.service;

import java.util.List;

import com.tcp.pojo.User;

public interface UserService {
	public List getUserList();
	public User getUserById(String userid);
}
