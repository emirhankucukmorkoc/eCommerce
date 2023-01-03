package eCommerce;

import eCommerce.business.concretes.UserManager;
import eCommerce.core.GoogleAuthManagerAdapter;
import eCommerce.dataAccess.concretes.HibernateUserDao;
import eCommerce.entities.concretes.User;

public class Main {

	public static void main(String[] args) {
		UserManager userManager = new UserManager(new HibernateUserDao(), new GoogleAuthManagerAdapter());
		User user = new User(1, "Emirhan", "Küçükmorkoç", "emirhanmorkoc@gmail.com", "288557");
		userManager.register(user);
		
		userManager.login(user);

	}

}
