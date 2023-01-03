package eCommerce.business.concretes;

import java.util.List;

import eCommerce.business.abstracts.UserService;
import eCommerce.core.AuthService;
import eCommerce.dataAccess.abstracts.UserDao;
import eCommerce.entities.concretes.User;

public class UserManager implements UserService {
	private UserDao userDao;
	private EmailValidator emailValidator = new EmailValidator();
	private AuthService authService;

	

	public UserManager(UserDao userDao, AuthService authService) {
		this.userDao = userDao;
		this.authService = authService;
	}

	@Override
	public void register(User user) {
		for(User users:userDao.getAll()) {
			if (users.geteMail().equals(user.geteMail())) {
						System.out.println(user.geteMail()+ " bu e-mail adresi sistemde mevcuttur. ");
				}
					}
				
		if (user.getFirstName().length() < 2 || user.getLastName().length() < 2) {
			System.out.println("Name and Surname must be at least 2 characters, register failed.");
			return;
		} else if (user.getPassword().length() < 6) {
			System.out.println("Password must be at least 6 characters, register failed.");
			return;
		} else if (!emailValidator.ptr.matcher(user.geteMail()).matches()) {
			System.out.println("The email you entered is invalid, register failed.");
			return;
				
		}else {
			this.userDao.register(user);
			System.out.println("Dear " + user.getFirstName() +" "+ user.getLastName()
			+ " You have successfully registered. "
			+ "Please click on the link in the e-mail we sent to " + user.geteMail()
			+ " to confirm the e-mail address. ");
		}
			
	}
		


	@Override
	public void login(User user) {
		 List<User> newUserList = userDao.getAll();
	        boolean situation = true;
	        for (User user2 : newUserList) {

	            if (user2.geteMail() == user.geteMail() & user2.getPassword() == user.getPassword()) {
	                System.out.println("Logged in: " + user2.getFirstName() + " " + user2.getLastName());
	            } else if (user.geteMail() == null && user.getPassword() == null) {
	                situation = false;
	                System.out.println("Fill in all the information!");
	            }
	        }
	        if(!situation){
	            System.out.println("Your e-mail or password is wrong!");
	        }
	        System.out.println("\nDear " + user.getFirstName() + " logged successfully");
		}

	@Override
	public void registerWithGoogle(User user) {
		this.authService.register(user);
	}

	
	}

	

