package com.cognizant.grizzlestore.controller;

import java.util.List;

import javax.annotation.Resource;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpSession;
import javax.validation.Valid;

import org.apache.log4j.Logger;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpRequest;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.servlet.ModelAndView;

import com.cognizant.grizzlestore.model.ProductDetails;
import com.cognizant.grizzlestore.service.GrizzleService;
import com.cognizant.grizzlestore.service.IGrrizzleStore;
import com.cogznizant.grizzlestore.exception.GrizzleException;


@Controller
public class ViewUpdateController {

	public ViewUpdateController() {
		// TODO Auto-generated constructor stub
	}

	static Logger logger = Logger.getLogger(ViewUpdateController.class);

	@Resource(name = "grizzleHbService")
	IGrrizzleStore grizzleJpaService;

	// @Resource(name="grizzleJpaService")
	// IGrrizzleStore grizzleJpaService;

	// GrizzleJpaService grizzleHbService=new GrizzleJpaService();

	@RequestMapping(value = "/home", method = RequestMethod.GET)
	public ModelAndView homePage(ModelAndView modelAndView) {

		modelAndView.setViewName("home");
		List<ProductDetails> list;
		try {
			list = grizzleJpaService.getProductDetails();
			modelAndView.addObject("productList", list);

		} catch (GrizzleException e) {
			// TODO Auto-generat

			modelAndView.setViewName("success");
			modelAndView.addObject("message", e.getMessage());

		}

		return modelAndView;
	}

	@RequestMapping(value = "/view", method = RequestMethod.POST)
	public ModelAndView viewProduct(int productId, String action, ModelAndView modelAndView) {
		// GrizzleService grizzleService=new GrizzleService();
		if (action.equals("Update")) {

			System.out.println("Show product");
			try {
				ProductDetails details = grizzleJpaService.getProductDetails(productId);
				if (details != null) {

					modelAndView.setViewName("viewproduct");
					modelAndView.addObject("product", details);

				} else {

					modelAndView.setViewName("success");
					modelAndView.addObject("error", "data is not available for view ");
				}
			} catch (GrizzleException e) {
				// TODO Auto-generated catch block

				modelAndView.setViewName("success");
				modelAndView.addObject("error", e.getMessage());

			}

		} else {
			// delete
		}

		return modelAndView;

	}

	@RequestMapping(value = "/update", method = RequestMethod.POST)
	public ModelAndView updateProduct(ModelAndView modelAndView,ProductDetails productDetails){
		int count;
		
		try {
			
			

			count = grizzleJpaService.updateProductDetails(productDetails);

			if (count > 0) {
				
				// System.out.println("update");
				modelAndView.setViewName("success");
				modelAndView.addObject("message", "data is updated");

			} else {

				modelAndView.setViewName("success");
				modelAndView.addObject("message", "data is not updated");

				// System.out.println("not update");
			}
		} catch (GrizzleException e) {
			modelAndView.setViewName("success");
			modelAndView.addObject("error", e.getMessage());
			// TODO Auto-generated catch block
		}

		return modelAndView;
	}

}
