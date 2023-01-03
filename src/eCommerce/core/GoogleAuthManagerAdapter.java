package eCommerce.core;

import eCommerce.JGoogle.GoogleAuthManager;
import eCommerce.entities.concretes.User;

public class GoogleAuthManagerAdapter implements AuthService {
	private GoogleAuthManager googleAuthManager;
	
	
	@Override
	public void register(User user) {
		googleAuthManager.register(user);
	}

	

}
