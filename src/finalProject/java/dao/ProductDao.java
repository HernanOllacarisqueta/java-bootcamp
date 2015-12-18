package dao;

import model.Product;
import model.ShoppingCart;

public interface ProductDao {

	public boolean addProduct(ShoppingCart product);
	public boolean updateProduct(Product product);
	
}
