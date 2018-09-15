package login;

public class LoginService {
	public boolean validateUser(String user, String password) {
		return user.equalsIgnoreCase("Anshul") && password.equals("Anand");
	}

}