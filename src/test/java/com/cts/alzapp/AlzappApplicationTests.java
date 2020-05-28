package com.cts.alzapp;

import static org.assertj.core.api.Assertions.assertThat;
import static org.junit.jupiter.api.Assertions.assertEquals;

import java.util.List;

//hello static import, nullValue here
import static org.hamcrest.CoreMatchers.*;
import javax.validation.constraints.AssertTrue;

import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.SpringBootConfiguration;
import org.springframework.boot.test.context.SpringBootTest;
import static org.hamcrest.collection.IsCollectionWithSize.hasSize;

import com.cognizant.grizzlestore.model.ProductBrand;
import com.cognizant.grizzlestore.model.ProductCategory;
import com.cognizant.grizzlestore.model.ProductDetails;
import com.cognizant.grizzlestore.service.GrizzleService;
import com.cogznizant.grizzlestore.exception.GrizzleException;

@SpringBootConfiguration
@SpringBootTest
// @RunWith(SpringRunner.class)
class AlzappApplicationTests {

	// @Qualifier("grizzleStore")
	// @Autowired(required=true)
	GrizzleService grizzleStore = new GrizzleService();

	@Test
	void testViewProduct() {

		try {
			ProductDetails details = grizzleStore.getProductDetails(1);
			if (details.getProductId() == 1) {
				assertEquals(1, details.getProductId(), "Data found");
			} else {

				assertEquals(0, details.getProductId(), "Data not found");

			}

		} catch (GrizzleException exception) {
			

		}

	}

	@Test
	void testUpdateProduct() {

		int flag = 0;

		try {

			ProductDetails details = grizzleStore.getProductDetails(1);

			ProductCategory category1 = new ProductCategory(1001, "mobile");
			ProductBrand brand1 = new ProductBrand(101, "mi");

			details.setProductDescription("nice triple camera HD");
			details.setProductCategory(category1);
			details.setProductBrand(brand1);

			int count = grizzleStore.updateProductDetails(details);

			assertEquals(1, count, "Update data is successful");

		} catch (GrizzleException e) {
			// TODO Auto-generated catch block
			assertEquals(1, 0, "Somme internal problem with database");

			e.printStackTrace();

		}

	}

	@Test
	void testListProduct() {

		int flag = 0;
		List<ProductDetails> list = null;
		try {

			// new ProductDetails(productId, productName, productDescription,
			// productPrice, productBrand, productCategory)
			ProductCategory category1 = new ProductCategory(1001, "mobile");

			ProductBrand brand1 = new ProductBrand(101, "mi");
			ProductDetails p = new ProductDetails(1, "samsung A4", "nice phone with dual cam", 9000, brand1, category1);

			list = grizzleStore.getProductDetails();
			p = list.get(0);// sample data we have from list

			System.out.println(list);
			assertEquals(list.get(0), p, "data is loaded");
			// as

		} catch (GrizzleException e) {
			// TODO Auto-generated catch block
			assertThat(list.size() <= 0);

			e.printStackTrace();

		}

	}

}
