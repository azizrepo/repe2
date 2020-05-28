package com.cognizant.grizzlestore.service;

import java.util.List;

import org.springframework.stereotype.Service;

import com.cognizant.grizzlestore.dao.ProductDao;
import com.cognizant.grizzlestore.model.ProductDetails;
import com.cogznizant.grizzlestore.exception.GrizzleException;

@Service("grizzleHbService")
public class GrizzleService implements IGrrizzleStore {

	public GrizzleService() {
		// TODO Auto-generated constructor stub
	}
	
	

	ProductDao productDao=ProductDao.getProductDao();
	

	@Override
	public List<ProductDetails> getProductDetails() throws GrizzleException {
		// TODO Auto-generated method stub
		return productDao.getProductDetails();
	}

	@Override
	public ProductDetails getProductDetails(int productId) throws GrizzleException {
		// TODO Auto-generated method stub
		return productDao.getProductDetails(productId);
	}


	@Override
	public int updateProductDetails(ProductDetails productDetails) throws GrizzleException {
		// TODO Auto-generated method stub
		return productDao.updateProduct(productDetails);
	}

}
