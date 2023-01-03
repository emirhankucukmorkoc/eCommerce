package eCommerce.dataAccess.abstracts;

import java.util.List;

import eCommerce.entities.concretes.User;

public interface UserDao {
	void register(User user);
	void login(String email, String password);
	List<User> getAll();
}
