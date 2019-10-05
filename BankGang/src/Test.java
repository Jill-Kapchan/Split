import java.util.HashMap;
import java.util.Scanner;

public class Test {
	
	public static void main(String[] args) {
		/* Scanner scanner = new Scanner(System.in);
		
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
				user.setfName(scanner.nextLine().trim());
				
				System.out.println("Middle Name:");
				user.setmName(scanner.nextLine().trim());
				
				System.out.println("Last Name:");
				user.setlName(scanner.nextLine().trim());
				
				System.out.println("Location:");
				user.setLocation(scanner.nextLine().trim());
				
				System.out.println("Username:");
				username = scanner.nextLine().trim().toLowerCase();
				
				check = accounts.get(username);
				
				while (check != null) {
					System.out.println("Username taken. Please enter a new one:");
					username = scanner.nextLine().trim().toLowerCase();
					check = accounts.get(username);
				}
				
				// usernames are lower-case
				user.setUsername(username);
				
				System.out.println("Password:");
				user.setPassword(scanner.nextLine().trim());
				accounts.putIfAbsent(username, user);
				System.out.println("Account created. Thank you " + user.getfName() + "!");
				break;
			case 'D':
				System.out.println("Please enter the username of account to delete:");
				username = scanner.nextLine().trim().toLowerCase();
				
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
					username = scanner.nextLine().trim().toLowerCase();
					
					check = accounts.get(username);
					
					String passwordCheck = null;
					
					if (check != null) {
						passwordCheck = accounts.get(username).getPassword();
					}
					
					System.out.println("Password: ");
					password = scanner.nextLine();
					
					if (passwordCheck == null || passwordCheck != password) {
						System.out.println("Invalid username or password, please try again.");
					}
					else {
						login = true;
					}
				}
				
				currentUser = check;
				break;
				
				
			}
			
		}
		while (input != 'Q');
		
		scanner.close(); */
	}
	
}
