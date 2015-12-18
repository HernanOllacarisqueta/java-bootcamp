package dao;

//import org.hibernate.Session;
//import org.hibernate.Session.SessionFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.orm.hibernate3.SessionFactoryUtils;
import org.springframework.stereotype.Repository;
import org.springframework.transaction.annotation.Transactional;

import model.ShoppingCart;

@Repository
public class ShoppingCartDaoImpl implements ShoppingCartDao{

	@Autowired
	private SessionFactoryUtils sessionFactory;
	
	@Transactional
	public boolean addShoppingCart(ShoppingCart cart) {
		this.sessionFactory.getCurrentSession().save(cart);
		return true;
	}
	
	@Transactional
	public boolean updateUser(ShoppingCart cart) {
		Session session = this.sessionFactory.getCurrentSession();
		session.update(cart);
		return true;
	}
	
}
