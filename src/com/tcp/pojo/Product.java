package com.tcp.pojo;

public class Product {

	private int productid;// ��Ʒid
	private String name;// ��Ʒ����
	private String description;// ��Ʒ����
	private float basePrice; // �۸�
	private String publish;// ������
	private String author;// ����
	private String images;// ��ͼ
	private int categoryid; // ��Ŀ���
	private int pages;// ��Ŀҳ��

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
