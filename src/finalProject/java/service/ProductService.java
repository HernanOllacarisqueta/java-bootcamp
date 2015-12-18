package service;

import model.Product;
import model.ShoppingCart;

public interface ProductService {

	public boolean addProduct(ShoppingCart product);
	public boolean getProduct(Product product);
	public boolean updateProduct(Product product);

	
}
