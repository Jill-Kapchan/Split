import java.util.ArrayList;

public class BankUtils {
	
	
	// method name may change
	public static SharedUser findUser(Card card, UserAccount user) {
		
		ArrayList<SharedUser> sharedUsers = card.getSharedUsers();
		
		for (SharedUser check : sharedUsers) {
			if (check.getUserAccount().equals(user)) return check;
		}
		
		return null;
	}
	
}