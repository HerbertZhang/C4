package com.tcp.web.controller;

import java.io.IOException;
import java.util.List;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.omg.CORBA.INTERNAL;

import com.tcp.pojo.Product;
import com.tcp.service.ProductService;
import com.tcp.service.UserService;
import com.tcp.service.impl.ProductServiceImpl;
import com.tcp.service.impl.UserServiceImpl;

public class ControllerServlet extends HttpServlet {

	@Override
	public void doGet(HttpServletRequest req, HttpServletResponse resp)
			throws ServletException, IOException {

		String path = req.getServletPath();

		path = path.substring(0, path.indexOf("."));

		if ("/toProductList".equals(path)) {
			try {
				ProductService productService = new ProductServiceImpl();

				List productList = productService.getProductList();

				req.setAttribute("productList", productList);

				getServletContext().getRequestDispatcher("/productList")
						.forward(req, resp);

			} catch (Exception e) {
				req.setAttribute("message", e.getMessage());

				getServletContext().getRequestDispatcher("/error").forward(req,
						resp);
			}
		} else if ("/toLogin".equals(path)) {
			getServletContext().getRequestDispatcher("/login").forward(req,
					resp);

		} else if ("/toProductDetail".equals(path)) {
			int productid = Integer.parseInt(req.getParameter("productid"));

			ProductService productService = new ProductServiceImpl();

			Product product = productService.getProductById(productid);

			if (product != null) {
				req.setAttribute("product", product);

				getServletContext().getRequestDispatcher("/productDetail")
						.forward(req, resp);
			} else {
				req.setAttribute("message", "The user was not found");

				getServletContext().getRequestDispatcher("/error").forward(req,
						resp);
			}
		}else if("/toOrderConfirm".equals(path)){
			
			getServletContext().getRequestDispatcher("/orderConfirm").forward(req,
					resp);
			
		}else if("/toOrderDetail".equals(path)){
			
			getServletContext().getRequestDispatcher("/orderDetail").forward(req,
					resp);
			
		} else if("/toOrderList".equals(path)){
			
			getServletContext().getRequestDispatcher("/orderList").forward(req,
					resp);
			
		} else if("/toUserManager".equals(path)){
			try {
				UserService userService = new UserServiceImpl();

				List userList = userService.getUserList();

				req.setAttribute("userList", userList);

				getServletContext().getRequestDispatcher("/userManager")
						.forward(req, resp);

			} catch (Exception e) {
				req.setAttribute("message", e.getMessage());

				getServletContext().getRequestDispatcher("/error").forward(req,
						resp);
			}
			
		} else if("/toUserModify".equals(path)){
			getServletContext().getRequestDispatcher("/userModify").forward(req,
					resp);
		} else if("/toUserRegister".equals(path)){
			getServletContext().getRequestDispatcher("/userRegister").forward(req,
					resp);
		} else if("/toShoppingCart".equals(path)){
			getServletContext().getRequestDispatcher("/shoppingCart").forward(req,
					resp);
		} else {
			resp.sendError(resp.SC_NOT_FOUND);
		}

	}

	@Override
	public void doPost(HttpServletRequest req, HttpServletResponse resp)
			throws ServletException, IOException {
		doGet(req, resp);
	}

}
