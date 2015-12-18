package model;

import java.math.BigDecimal;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table (name = "product")

public class Product {
	
	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	@Column(name = "productid")
	private int productid;

	@Column(name = "productname")
	private String productname;

	@Column(name = "price")
	private BigDecimal price;
	
	@Column(name = "categoryid")
	private int categoryid;	

	
	
	protected Product() {};
	
	public Product(String productname, BigDecimal price, int categoryid) {
		super();
		this.productname = productname;
		this.categoryid = categoryid;
		this.price = price;
		
	}

	public int getProductid() {
		return productid;
	}

	public void setProductid(int productid) {
		this.productid = productid;
	}

	public String getProductname() {
		return productname;
	}

	public void setProductname(String productname) {
		this.productname = productname;
	}

	public int getCategoryid() {
		return categoryid;
	}

	public void setCategoryid(int categoryid) {
		this.categoryid = categoryid;
	}
	
	public BigDecimal getPrice() {
		return price;
	}

	public void setPrice(BigDecimal price) {
		this.price = price;
	}

	@Override
	public String toString() {
		return String.format("Product[productid=%d, productname='%s', price='%s']", productid, productname, price);
		//return "Product [productid=" + productid + ", productname=" + productname + ", price=" + price + ", categoryid="+ categoryid + "]";
	}

	
	
	
	

}