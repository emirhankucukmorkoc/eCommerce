package eCommerce.dataAccess.concretes;

import java.util.ArrayList;
import java.util.List;

import eCommerce.dataAccess.abstracts.UserDao;
import eCommerce.entities.concretes.User;

public class HibernateUserDao implements UserDao{
	List<User> users = new ArrayList<>();

	@Override
	public void register(User user) {
		System.out.println("Registered with Hibernate");
	}

	@Override
	public void login(String email, String password) {
		System.out.println("Successfully logged in");
	}

	@Override
	public List<User> getAll() {
		return users;
	}

	

	
	

}
