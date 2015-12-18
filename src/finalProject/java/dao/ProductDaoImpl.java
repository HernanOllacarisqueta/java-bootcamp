package dao;

import model.Product;
import model.ShoppingCart;

//import org.hibernate.Session;
//import org.hibernate.Session.SessionFactory;
import org.springframework.orm.hibernate3.SessionFactoryUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;
import org.springframework.transaction.annotation.Transactional;

@Repository
public class ProductDaoImpl implements ProductDao{

	@Autowired
	private SessionFactoryUtils sessionFactory;
	
	@Transactional
	public boolean addProduct(ShoppingCart product) {
		this.sessionFactory.getCurrentSession().save(product);
		return true;
	}

	@Transactional
	public boolean updateProduct(Product product) {
		Session session = this.sessionFactory.getCurrentSession();
		session.update(product);
		return true;
	}

}
