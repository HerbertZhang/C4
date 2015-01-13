package com.tcp.pojo;
public class Orders {
	
	private String ordername;
	
	private String cost;
	
	private String userid;
	
	private String orderid;//和orderline连接
	
	private String statusid;//和orderstatus连接

	private String paywayid;//和payway连接
	
	public String getOrdername() {
		return ordername;
	}
	public void setOrdername(String ordername) {
		this.ordername = ordername;
	}
	
	public String getCost() {
		return cost;
	}
	public void setCost(String cost) {
		this.cost = cost;
	}
	
	public String getUserid() {
		return userid;
	}
	public void setUserid(String userid) {
		this.userid = userid;
	}
	
	public String getOrderid() {
		return orderid;
	}
	public void setOrderid(String orderid) {
		this.orderid = orderid;
	}
	
	public String getStatusid() {
		return statusid;
	}
	public void setStatusid(String statusid) {
		this.statusid = statusid;
	}
	
	public String getPaywayid() {
		return paywayid;
	}
	public void setPaywayid(String paywayid) {
		this.paywayid = paywayid;
	}
	
	
	
	
	
	//orderline
	private String lineid;
	
	private String productid;
	
	private String amount;
	
	public String getLineid() {
		return lineid;
	}
	public void setLineid(String lineid) {
		this.lineid = lineid;
	}
	
	public String getProductid() {
		return productid;
	}
	public void setProductid(String productid) {
		this.productid = productid;
	}
	public String getAmount() {
		return amount;
	}
	public void setAmount(String amount) {
		this.amount = amount;
	}
	
	
	//orderstatus
    private String statusname;
	
	private String description;
	
	

	public String getStatusname() {
		return statusname;
	}

	public void setStatusname(String statusname) {
		this.statusname = statusname;
	}

	public String getDescription() {
		return description;
	}

	public void setDescription(String description) {
		this.description = description;
	}

	
	
	//payway
	private String paystyle;
	
	public String getPaystyle() {
		return paystyle;
	}

	public void setPaystyle(String paystyle) {
		this.paystyle= paystyle;
	}
	
}
