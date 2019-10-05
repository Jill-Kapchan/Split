public class Test {
	
	public static void main(String[] args) {
		
		UserAccount test = new UserAccount();
		test.setfName("Samson");
		test.setlName("Phan");
		test.setmName("Hoang");
		test.setUsername("skillsam");
		test.setPassword("skillsam");
		test.setEmail("sphan6@asu.edu");
		test.setLocation("123");
		
		UserAccount test2 = new UserAccount();
		test2.setfName("yo");
		test2.setlName("s");
		test2.setmName("a");
		test2.setUsername("b");
		test2.setPassword("c");
		test2.setEmail("sdf@asu.edu");
		test2.setLocation("423");
		
		Card card = test.generate("Test", 1000, true, true);
		card.addSharedUser(test2, .50);
		
		Card card2 = test.generate("Test2", -1, false, false);
		
		System.out.println(test.getCardList().toString());
		
		card.removeSharedUser(test2);
		
		System.out.println(test.getCardList().toString());
		
		
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
