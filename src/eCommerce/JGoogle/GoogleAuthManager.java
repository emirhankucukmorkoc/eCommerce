package eCommerce.JGoogle;

import eCommerce.entities.concretes.User;

public class GoogleAuthManager {
	
	public void register(User user) {
		System.out.println("Sayin " +user.getFirstName()+ " " + user.getLastName()+ " Registered with Google account");
	}
	
}
