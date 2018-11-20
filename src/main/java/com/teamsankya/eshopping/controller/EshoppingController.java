package com.teamsankya.eshopping.controller;

import java.io.IOException;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.servlet.ModelAndView;

import com.teamsankya.eshopping.dao.EshoppingDaoImpl;
import com.teamsankya.eshopping.dto.EshoppingBean;

@Controller
public class EshoppingController {

	@Autowired
	EshoppingDaoImpl daoImpl;

	@RequestMapping(path = "/shop/{pagefrom}", method = RequestMethod.GET)
	public ModelAndView getProduct(@RequestParam(value = "type", required = false) String productcategory,
			@PathVariable int pagefrom, ModelAndView view) throws IOException {

		int totalpage = 10;

		if (pagefrom == 0) {
			/* pageid=(pageid-1)*total+0; */} else {
			pagefrom = (pagefrom - 1) * totalpage + 1;
		}

		EshoppingBean ebean = new EshoppingBean();
		List<EshoppingBean> plist = daoImpl.getDataFromDao(productcategory, pagefrom, totalpage);

		return new ModelAndView("PenResponse", "productdetail", plist);
	}

}
