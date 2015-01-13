package com.tcp.pojo;
public class Orders {
	
	private String ordername;
	
	private float cost;
	
	private String userid;
	
	private int orderid;//和orderline连接
	
	private int statusid;//和orderstatus连接

	private int paywayid;//和payway连接
	
	//orderline
	private int lineid;
	
	private int productid;
	
	private float amount;
	
	//orderstatus
    private String statusname;
	
	private String description;
	//payway
	private String paystyle;
	public String getOrdername() {
		return ordername;
	}
	public void setOrdername(String ordername) {
		this.ordername = ordername;
	}
	public float getCost() {
		return cost;
	}
	public void setCost(float cost) {
		this.cost = cost;
	}
	public String getUserid() {
		return userid;
	}
	public void setUserid(String userid) {
		this.userid = userid;
	}
	public int getOrderid() {
		return orderid;
	}
	public void setOrderid(int orderid) {
		this.orderid = orderid;
	}
	public int getStatusid() {
		return statusid;
	}
	public void setStatusid(int statusid) {
		this.statusid = statusid;
	}
	public int getPaywayid() {
		return paywayid;
	}
	public void setPaywayid(int paywayid) {
		this.paywayid = paywayid;
	}
	public int getLineid() {
		return lineid;
	}
	public void setLineid(int lineid) {
		this.lineid = lineid;
	}
	public int getProductid() {
		return productid;
	}
	public void setProductid(int productid) {
		this.productid = productid;
	}
	public float getAmount() {
		return amount;
	}
	public void setAmount(float amount) {
		this.amount = amount;
	}
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
	public String getPaystyle() {
		return paystyle;
	}
	public void setPaystyle(String paystyle) {
		this.paystyle = paystyle;
	}
	
	
	
}
