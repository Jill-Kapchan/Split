import java.util.ArrayList;

public class UserAccount {
	
	
	private String fName;
	private String mName;
	private  String lName;
	private String location;
	
	private String username;
	private String password;
	
	private int routingId;
	private double accountBalance;
	
	public ArrayList<String> friendsList;
	public ArrayList<Card> cardList;
	
	public UserAccount() {
		fName = "?";
		mName = "?";
		lName = "?";
		location = "?";
		username = "?";
		password = "?";
		routingId = 0;
		accountBalance = 0.0;
		friendsList = null;
		cardList = null;
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
	
	public String getUsername() {
		return username;
	}
	
	public String getPassword() {
		return password;
	}

	public int getRoutingId() {
		return routingId;
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

	public void setUsername(String username) {
		this.username = username;
	}
	
	public void setPassword(String password) {
		this.password = password;
	}

	public void setRoutingId(int routingId) {
		this.routingId = routingId;
	}

	public void setAccountBalance(double accountBalance) {
		this.accountBalance = accountBalance;
	}
	
	//----------------------------
	//Functions
	//----------------------------
	
	//function generates a card and returns generated card
	void generate() {
	

	}
	
	//encrypts the card info
	void encryption(Card tokenCard) {
		
	}
	
	//decrypts card info
	void decryption(Card tokenCard) {
		
	}
	
	//deposits money from a card to the account
	void withdraw(double amtWithdraw) {
		
	}
	
	//withdraws money from a card to the account
	void deposit(double amtDeposit) {
		
	}
	
	//transfers an amount from the current user 
	//to another user
	void transfer(String userToTransfer, double amountTransfer) {
		
	}
	
	//adds a friend using their username
	void addFriend(String userFriend) {
		
	}
	
	//removes a friend using their username
	void removeFriend(String userEnemy) {
		
	}
	
}
