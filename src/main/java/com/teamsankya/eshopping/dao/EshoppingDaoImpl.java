package com.teamsankya.eshopping.dao;

import java.util.List;

import org.hibernate.SessionFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import com.teamsankya.eshopping.dto.EshoppingBean;

@Repository
public class EshoppingDaoImpl implements EshoppingDao{
	
	public EshoppingDaoImpl() {}
	
	@Autowired
	private SessionFactory sessionFactory;
	
	@Override
	public List<EshoppingBean> getDataFromDao(String productcategory, int pagefrom, int totalpage) {
		
		int pageStartsFrom = pagefrom;
		String hql = "from EshoppingBean E where E.productcategory='" + productcategory + "'";
		@SuppressWarnings("unchecked")
		org.hibernate.query.Query<EshoppingBean> q = sessionFactory.openSession().createQuery(hql).setFirstResult(pageStartsFrom)
				.setMaxResults(totalpage);
		List<EshoppingBean> res = q.list();

		return res;
		
	}

}
