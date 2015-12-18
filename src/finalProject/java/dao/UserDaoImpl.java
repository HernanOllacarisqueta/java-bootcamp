package dao;

import model.User;

//import org.hibernate.Session;
//import org.hibernate.Session.SessionFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.orm.hibernate3.SessionFactoryUtils;
import org.springframework.stereotype.Repository;
import org.springframework.transaction.annotation.Transactional;


@Repository
public class UserDaoImpl implements UserDao {
	
	@Autowired
	private SessionFactoryUtils sessionFactory;
	
	@Transactional
	public boolean addUser(User user) {
		this.sessionFactory.getCurrentSession().save(user);
		return true;
	}	
	
	
	@Transactional
	public boolean updateUser(User user) {
		Session session = this.sessionFactory.getCurrentSession();
		session.update(user);
		return true;
	}

}