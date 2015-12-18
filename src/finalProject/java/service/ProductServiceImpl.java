package service;

import model.Product;
import model.ShoppingCart;
import dao.ProductDao;

import org.springframework.beans.factory.annotation.Autowired;

public class ProductServiceImpl implements ProductService {

	@Autowired
	private ProductDao productDao;
	
	public boolean addProduct(ShoppingCart product) {
		productDao.addProduct(product);
		return true;
	}

	public boolean getProduct(Product product) {
		// TODO Auto-generated method stub
		return false;
	}

	public boolean updateProduct(Product product) {
		productDao.updateProduct(product);
		return true;
	}

}
