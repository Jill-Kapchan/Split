import java.util.ArrayList;

public class UserAccount {
	
	
	private String fName;
	private String mName;
	private String lName;
	private String location;
	
	private String email;
	private String username;
	private String password;
	
	private int accountNumber;
	private double accountBalance;
	
	public ArrayList<UserAccount> friendsList;
	public ArrayList<Card> cardList;
	
	private static int ENCRYPTION_NUMBER = 17;
	
	public UserAccount() {
		fName = "?";
		mName = "?";
		lName = "?";
		location = "?";
		email = "?";
		username = "?";
		password = "?";
		accountNumber = 0;
		accountBalance = 0.0;
		friendsList = new ArrayList<UserAccount>();
		cardList = new ArrayList<Card>();
	}
	
	//----------------------------
	//Accessor methods
	//----------------------------
	public String getfName() {
		return fName;
	}

	public String getmName() {
		return mName;
	}

	public String getlName() {
		return lName;
	}
	
	public String getLocation() {
		return location;
	}
	
	public String getEmail() {
		return email;
	}
	
	public String getUsername() {
		return username;
	}
	
	public String getPassword() {
		return password;
	}

	public int getRoutingId() {
		return accountNumber;
	}

	public double getAccountBalance() {
		return accountBalance;
	}
	
	//----------------------------
	//Mutator methods
	//----------------------------
	
	public void setfName(String fName) {
		this.fName = fName;
	}
	
	public void setmName(String mName) {
		this.mName = mName;
	}

	public void setlName(String lName) {
		this.lName = lName;
	}

	public void setLocation(String location) {
		this.location = location;
	}
	
	public void setEmail(String email) {
		this.email = email;
	}

	public void setUsername(String username) {
		this.username = username;
	}
	
	public void setPassword(String password) {
		this.password = password;
	}

	public void setRoutingId(int routingId) {
		this.accountNumber = routingId;
	}

	public void setAccountBalance(double accountBalance) {
		this.accountBalance = accountBalance;
	}
	
	//----------------------------
	//Functions
	//----------------------------
	
	//function generates a card and returns generated card
	public Card generate(String cardName) {
		long start = 4000000000000000L;
		long add = (long) (Math.random() * 1000000000000000.0);
		long cardNumber = start + add;
		
		int cvv = (int) (Math.random() * 1000.0) + 100;
		if (cvv > 999) cvv = cvv - 100;
		
		Card card = new Card(this, cardName);
		card.setCardNum(cardNumber);
		card.setCvvNum(cvv);
		
		this.cardList.add(card);
		return card;
	}
	
	//encrypts the card info
	void encryption(Card tokenCard) {
		String newData = "";
	
        for (int i = 0; i < tokenCard.getToken().length(); ++i) { 
            // ASCII value  
            int val = tokenCard.getToken().charAt(i);      
            newData += (char)(val + ENCRYPTION_NUMBER); 
		}
        tokenCard.setToken(newData);
	}
	
	//decrypts card info
	void decryption(Card tokenCard) {
		String newData = "";
        for (int i = 0; i < tokenCard.getToken().length(); ++i) { 
            // ASCII value  
            int val = tokenCard.getToken().charAt(i);        
            newData += (char)(val - ENCRYPTION_NUMBER); 
		}
        tokenCard.setToken(newData);
	}
	
	//deposits money from a card to the account
	void withdraw(double amtWithdraw) {
		this.accountBalance += amtWithdraw;
		
	}
	
	//withdraws money from a card to the account
	void deposit(double amtDeposit) {
		this.accountBalance -= amtDeposit;
	}
	
	//transfers an amount from the current user 
	//to another user
	void transfer(UserAccount user, double amountTransfer) {
		user.deposit(amountTransfer);
		this.withdraw(amountTransfer);
	}
	
	//adds a friend using their username
	void addFriend(UserAccount userFriend) {
		if (this.friendsList.indexOf(userFriend) == -1)
			this.friendsList.add(userFriend);
	}
	
	//removes a friend using their username
	void removeFriend(UserAccount userEnemy) {
		this.friendsList.remove(userEnemy);
	}
	
}
