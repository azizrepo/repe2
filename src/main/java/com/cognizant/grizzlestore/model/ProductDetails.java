package com.cognizant.grizzlestore.model;

import org.hibernate.validator.constraints.NotEmpty;

public class ProductDetails {


	// normal column
	
	private int productId;
	
private String productName;
	
	private String productDescription;
	
	private float productPrice;
	
	
	// fks
	ProductBrand productBrand;

	ProductCategory productCategory;
	
	public ProductDetails(int productId, String productName, String productDescription, float productPrice,
			ProductBrand productBrand, ProductCategory productCategory) {
		super();
		this.productId = productId;
		this.productName = productName;
		this.productDescription = productDescription;
		this.productPrice = productPrice;
		this.productBrand = productBrand;
		this.productCategory = productCategory;
	}
	public ProductDetails() {
		super();
		// TODO Auto-generated constructor stub
	}
	public int getProductId() {
		return productId;
	}
	public void setProductId(int productId) {
		this.productId = productId;
	}
	public String getProductName() {
		return productName;
	}
	public void setProductName(String productName) {
		this.productName = productName;
	}
	public String getProductDescription() {
		return productDescription;
	}
	public void setProductDescription(String productDescription) {
		this.productDescription = productDescription;
	}
	public float getProductPrice() {
		return productPrice;
	}
	public void setProductPrice(float productPrice) {
		this.productPrice = productPrice;
	}
	public ProductBrand getProductBrand() {
		return productBrand;
	}
	public void setProductBrand(ProductBrand productBrand) {
		this.productBrand = productBrand;
	}
	public ProductCategory getProductCategory() {
		return productCategory;
	}
	public void setProductCategory(ProductCategory productCategory) {
		this.productCategory = productCategory;
	}
	@Override
	public String toString() {
		return "ProductDetails [productId=" + productId + ", productName=" + productName + ", productDescription="
				+ productDescription + ", productPrice=" + productPrice + ", productBrand=" + productBrand
				+ ", productCategory=" + productCategory + "]";
	}
	
	
	
	
	
	
}
