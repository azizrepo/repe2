package com.cognizant.grizzlestore.dao;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

import com.cognizant.grizzlestore.model.ProductBrand;
import com.cognizant.grizzlestore.model.ProductCategory;
import com.cognizant.grizzlestore.model.ProductDetails;
import com.cogznizant.grizzlestore.exception.GrizzleException;

public class ProductDao {

	private static ProductDao productDao;

	List<ProductDetails> list = new ArrayList<>();

	private ProductDao() {
		// TODO Auto-generated constructor stub
		// List<ProductDetails> list = new ArrayList<ProductDetails>();
		ProductCategory category1 = new ProductCategory(1001, "mobile");
		ProductCategory category2 = new ProductCategory(1002, "laptop");
		ProductCategory category3 = new ProductCategory(1003, "charger");
		ProductCategory category4 = new ProductCategory(1004, "battery");

		ProductBrand brand1 = new ProductBrand(101, "mi");
		ProductBrand brand2 = new ProductBrand(102, "lenovo");
		ProductBrand brand3 = new ProductBrand(103, "samsung");
		ProductBrand brand4 = new ProductBrand(104, "lithuim");

		ProductDetails details1 = new ProductDetails(1, "samsung A4", "nice phone with dual cam", 9000, brand1,
				category1);

		ProductDetails details2 = new ProductDetails(2, "note 4 tab ", "china samsung high performance", 19000, brand2,
				category2);

		ProductDetails details3 = new ProductDetails(3, "samsung A4 charger", "high speed charger", 9000, brand3,
				category3);

		ProductDetails details4 = new ProductDetails(4, "samsung A4 battery", "1 day backup", 900, brand4, category4);

		list.add(details1);
		list.add(details2);
		list.add(details3);
		list.add(details4);
// how
	}

	public static ProductDao getProductDao() {

		if (productDao == null) {

			productDao = new ProductDao();
		}

		return productDao;

	}

	public int updateProduct(ProductDetails gotDetails) throws GrizzleException {

		int count = 1;
		ProductDetails detail = new ProductDetails();
		// List<ProductDetails> details= this.getProductDetails();
		for (Iterator iterator = list.iterator(); iterator.hasNext();) {
			ProductDetails productDetails = (ProductDetails) iterator.next();

			if (productDetails.getProductId() == gotDetails.getProductId()) {
				iterator.remove();
				break;

			}
		}

		ProductCategory category1 = new ProductCategory(1001, "mobile");
		ProductCategory category2 = new ProductCategory(1002, "laptop");
		ProductCategory category3 = new ProductCategory(1003, "charger");
		ProductCategory category4 = new ProductCategory(1004, "battery");

		ProductBrand brand1 = new ProductBrand(101, "mi");
		ProductBrand brand2 = new ProductBrand(102, "lenovo");
		ProductBrand brand3 = new ProductBrand(103, "samsung");
		ProductBrand brand4 = new ProductBrand(104, "lithuim");

		if (gotDetails.getProductBrand().getBrandId() == 101) {
			gotDetails.setProductBrand(brand1);
		}
		if (gotDetails.getProductCategory().getCategoryId() == 1001) {
			gotDetails.setProductCategory(category1);
		}

		if (gotDetails.getProductBrand().getBrandId() == 102) {
			gotDetails.setProductBrand(brand2);

		}
		if (gotDetails.getProductCategory().getCategoryId() == 1002) {
			gotDetails.setProductCategory(category2);

		}

		if (gotDetails.getProductBrand().getBrandId() == 103) {
			gotDetails.setProductBrand(brand3);

		}
		if (gotDetails.getProductCategory().getCategoryId() == 1003) {
			gotDetails.setProductCategory(category3);

		}

		if (gotDetails.getProductBrand().getBrandId() == 104) {
			gotDetails.setProductBrand(brand4);

		}
		if (gotDetails.getProductCategory().getCategoryId() == 1004) {
			gotDetails.setProductCategory(category4);

		}

		list.add(gotDetails);

		return count;
	}

	public void setProductDetails(List<ProductDetails> list) throws GrizzleException {
		this.list = list;
	}

	public List<ProductDetails> getProductDetails() throws GrizzleException {

		return list;

	}

	public ProductDetails getProductDetails(int productId1) throws GrizzleException {

		ProductDetails detail = new ProductDetails();
		List<ProductDetails> details = this.getProductDetails();
		for (Iterator iterator = details.iterator(); iterator.hasNext();) {
			ProductDetails productDetails = (ProductDetails) iterator.next();

			if (productDetails.getProductId() == productId1) {
				detail = productDetails;
				break;
			}
		}
		return detail;

	}

}
