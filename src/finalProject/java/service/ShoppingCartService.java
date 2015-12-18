package service;

import model.ShoppingCart;

public interface ShoppingCartService {
	
	public boolean addShoppingCart(ShoppingCart cart);
	public boolean getShoppingCart(ShoppingCart cart);
	public boolean updateShoppingCart(ShoppingCart cart);

}
