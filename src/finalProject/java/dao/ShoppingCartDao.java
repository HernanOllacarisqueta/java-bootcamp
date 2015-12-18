package dao;

import model.ShoppingCart;

public interface ShoppingCartDao {

	public boolean addShoppingCart(ShoppingCart cart);
	public boolean updateShoppingCart(ShoppingCart cart);
	
}
