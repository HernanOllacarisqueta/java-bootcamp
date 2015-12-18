package service;

import org.springframework.beans.factory.annotation.Autowired;

import dao.ShoppingCartDao;
import model.ShoppingCart;

public class ShoppingCartServiceImpl implements ShoppingCartService {

	@Autowired
	private ShoppingCartDao shoppingCartDao;
	
	public boolean addShoppingCart(ShoppingCart cart) {
		shoppingCartDao.addShoppingCart(cart);
		return true;
	}

	public boolean getShoppingCart(ShoppingCart cart) {
		// TODO Auto-generated method stub
		return false;
	}

	public boolean updateShoppingCart(ShoppingCart cart) {		
		shoppingCartDao.updateShoppingCart(cart);
		return true;
	}

}
