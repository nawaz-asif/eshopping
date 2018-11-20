package com.teamsankya.eshopping.dao;

import java.util.List;

import com.teamsankya.eshopping.dto.EshoppingBean;

public interface EshoppingDao {
	public List<EshoppingBean> getDataFromDao(String productcategory,int pagefrom,int totalpage);
}
