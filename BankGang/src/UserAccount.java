import java.util.ArrayList;

public class UserAccount {
	
	
	public String fName;
	public String mName;
	public String lName;
	public String location;
	
	public String username;
	public String password;
	
	public int routingId;
	public double accountBalance;
	
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
	
	//function generates a card and returns generated card
	void generate() {
	//

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
