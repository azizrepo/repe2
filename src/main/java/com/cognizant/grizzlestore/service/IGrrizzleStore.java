package com.cognizant.grizzlestore.service;

import java.util.List;

import com.cognizant.grizzlestore.model.ProductDetails;
import com.cogznizant.grizzlestore.exception.GrizzleException;

public interface IGrrizzleStore {
	
	public	List<ProductDetails> getProductDetails() throws GrizzleException;
	public	ProductDetails getProductDetails(int productId) throws GrizzleException;
	public	int updateProductDetails(ProductDetails productDetails) throws GrizzleException;

	
	
}
