import java.util.ArrayList;
import java.util.HashMap;
import java.util.Scanner;

public class BankUtils {
	
	public static final int ROUTING_NUMBER = 1212806749;
	
	// method name may change
	public static SharedUser findSharedUser(Card card, UserAccount user) {
		
		ArrayList<SharedUser> sharedUsers = card.getSharedUsers();
		
		for (SharedUser check : sharedUsers) {
			if (check.getUserAccount().equals(user)) return check;
		}
		
		return null;
	}
	
	public static UserAccount createUserAccount(Scanner s) {
		UserAccount user = new UserAccount();
		
		System.out.println("First Name:");
		user.setfName(s.nextLine().strip());
		
		System.out.println("Middle Name:");
		user.setmName(s.nextLine().strip());
		
		System.out.println("Last Name:");
		user.setlName(s.nextLine().strip());
		
		System.out.println("Location:");
		user.setLocation(s.nextLine().strip());
		
		System.out.println("Username:");
		user.setUsername(s.nextLine().strip());
		
		System.out.println("Password:");
		user.setPassword(s.nextLine().strip());
		
		return user;
	}
	
}