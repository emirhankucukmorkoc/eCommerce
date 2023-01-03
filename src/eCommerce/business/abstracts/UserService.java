package eCommerce.business.abstracts;

import eCommerce.entities.concretes.User;

public interface UserService {
	void register(User user);
	void login(User user );
	void registerWithGoogle(User user);
}
