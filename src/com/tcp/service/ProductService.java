package com.tcp.service;

import java.util.List;

import com.tcp.pojo.Product;

public interface ProductService {
	public List getProductList();
	public Product getProductById(int productid);
}
