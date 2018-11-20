package com.teamsankya.eshopping.dto;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name="product")
public class EshoppingBean {

	@Id
	@Column(name="pid")
	private String productid;
	@Column(name="pname")
	private String productname;
	@Column(name="pcompany")
	private String productcompanyname;
	@Column(name="pcategory")
	private String productcategory;
	@Column(name="pprice")
	private int productprice;
	public String getProductid() {
		return productid;
	}
	public void setProductid(String productid) {
		this.productid = productid;
	}
	public String getProductname() {
		return productname;
	}
	public void setProductname(String productname) {
		this.productname = productname;
	}
	public String getProductcompanyname() {
		return productcompanyname;
	}
	public void setProductcompanyname(String productcompanyname) {
		this.productcompanyname = productcompanyname;
	}
	public String getProductcategory() {
		return productcategory;
	}
	public void setProductcategory(String productcategory) {
		this.productcategory = productcategory;
	}
	public int getProductprice() {
		return productprice;
	}
	public void setProductprice(int productprice) {
		this.productprice = productprice;
	}
	@Override
	public String toString() {
		return "EshoppingBean [productid=" + productid + ", productname=" + productname + ", productcompanyname="
				+ productcompanyname + ", productcategory=" + productcategory + ", productprice=" + productprice + "]";
	}
	
}
