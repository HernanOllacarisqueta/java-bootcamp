package model;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;
import javax.persistence.Column;

@Entity
@Table(name = "cart")

public class ShoppingCart {
	
	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	@Column(name = "id")
	private int id;
	
	@Column(name = "productid")
	private int productid;
	
	@Column(name = "total")
	private int total;
	
	@Column(name = "cartid")
	private int cartid;
	
	
	
	protected ShoppingCart() {};
	
	public ShoppingCart(int productid, int total, int cartid) {
		super();
		this.productid = productid;
		this.total = total;
		this.cartid = cartid;
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public int getProductid() {
		return productid;
	}

	public void setProductid(int productid) {
		this.productid = productid;
	}

	public int getTotal() {
		return total;
	}

	public void setTotal(int total) {
		this.total = total;
	}

	public int getCartid() {
		return cartid;
	}

	public void setCartid(int cartid) {
		this.cartid = cartid;
	}

	@Override
	public String toString() {
		return String.format("Cart[id=%d, productid='%s', total='%s', cartid='%s']", id, productid, total, cartid);
		//return "Cart [id=" + id + ", productid=" + productid + ", total=" + total + ", cartid=" + cartid + "]";
    }
		
}

