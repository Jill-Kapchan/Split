import java.util.HashMap;
import java.util.Scanner;

public class Test {
	
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		
		HashMap<String, UserAccount> accounts = new HashMap<>();
		UserAccount currentUser = null, check = null;
		String username = null, password = null;
		
		char input = ' ';
		
		do {
			System.out.println("Welcome to Text-Based Bank. How can we help you?");
			System.out.println("C - create an account with us");
			System.out.println("D - delete an account :c");
			System.out.println("L - login to an existing account");
			System.out.println("P - print all existing user accounts");
			System.out.println("Q - leave the bank");
			
			input = scanner.nextLine().charAt(0);
			
			switch (input) {
			case 'C':
				UserAccount user = new UserAccount();
				
				System.out.println("First Name:");
				user.setfName(scanner.nextLine().strip());
				
				System.out.println("Middle Name:");
				user.setmName(scanner.nextLine().strip());
				
				System.out.println("Last Name:");
				user.setlName(scanner.nextLine().strip());
				
				System.out.println("Location:");
				user.setLocation(scanner.nextLine().strip());
				
				System.out.println("Username:");
				username = scanner.nextLine().strip().toLowerCase();
				
				check = accounts.get(username);
				
				while (check != null) {
					System.out.println("Username taken. Please enter a new one:");
					username = scanner.nextLine().strip().toLowerCase();
					check = accounts.get(username);
				}
				
				// usernames are lower-case
				user.setUsername(username);
				
				System.out.println("Password:");
				user.setPassword(scanner.nextLine().strip());
				accounts.putIfAbsent(username, user);
				System.out.println("Account created. Thank you " + user.getfName() + "!");
				break;
			case 'D':
				System.out.println("Please enter the username of account to delete:");
				username = scanner.nextLine().strip().toLowerCase();
				
				check = accounts.get(username);
				
				if (check != null) {
					accounts.remove(username);
					System.out.println("Account deleted.");
				}
				else {
					System.out.println("Account does not exist.");
				}
				break;
			case 'L':
				System.out.println("Please login.");
				boolean login = false;
				
				while (!login) {
					System.out.println("Username: ");
					username = scanner.nextLine().strip().toLowerCase();
					
					check = accounts.get(username);
					
					if (check != null) {
						password = accounts.get(username).getPassword();
					}
					else password = " ";
					
					System.out.println("Password: ");
				}
				
				
			}
			
		}
		while (input != 'Q');
		
		scanner.close();
	}
	
}
