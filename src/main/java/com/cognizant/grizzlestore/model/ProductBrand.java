package com.cognizant.grizzlestore.model;

import org.hibernate.validator.constraints.NotEmpty;

public class ProductBrand {
	
	
	private int brandId;
	private String brandName;
	
	
	@Override
	public String toString() {
		return "ProductBrand [brandId=" + brandId + ", brandName=" + brandName + "]";
	}
	public int getBrandId() {
		return brandId;
	}
	public void setBrandId(int brandId) {
		this.brandId = brandId;
	}
	public String getBrandName() {
		return brandName;
	}
	public void setBrandName(String brandName) {
		this.brandName = brandName;
	}
	public ProductBrand() {
		super();
		// TODO Auto-generated constructor stub
	}
	public ProductBrand(int brandId, String brandName) {
		super();
		this.brandId = brandId;
		this.brandName = brandName;
	}
	

}
