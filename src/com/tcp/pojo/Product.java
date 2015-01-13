package com.tcp.pojo;

public class Product {

	private int productid;// 商品id
	private String name;// 商品名称
	private String description;// 商品描述
	private float basePrice; // 价格
	private String publish;// 出版社
	private String author;// 作者
	private String images;// 配图
	private int categoryid; // 书目类别
	private int pages;// 书目页码

	public int getProductid() {
		return productid;
	}

	public String getName() {
		return name;
	}

	public String getDescription() {
		return description;
	}

	public float getBasePrice() {
		return basePrice;
	}

	public String getPublish() {
		return publish;
	}

	public String getAuthor() {
		return author;
	}

	public String getImages() {
		return images;
	}

	public int getCategoryid() {
		return categoryid;
	}

	public int getPages() {
		return pages;
	}

	public void setProductid(int productid) {
		this.productid = productid;
	}

	public void setName(String name) {
		this.name = name;
	}

	public void setDescription(String description) {
		this.description = description;
	}

	public void setBasePrice(float basePrice) {
		this.basePrice = basePrice;
	}

	public void setPublish(String publish) {
		this.publish = publish;
	}

	public void setAuthor(String author) {
		this.author = author;
	}

	public void setImages(String images) {
		this.images = images;
	}

	public void setCategoryid(int categoryid) {
		this.categoryid = categoryid;
	}

	public void setPages(int pages) {
		this.pages = pages;
	}

}
