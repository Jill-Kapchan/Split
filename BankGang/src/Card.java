import java.util.ArrayList;

public class Card {
	
	private String fName;
	private String mName;
	private String lName;
	
	private int cardNumber;
	private int expDate;
	private int cvvNumber;
	
	private ArrayList<SharedUser> sharedUsers;

	public Card(String fName, String mName, String lName) {
		this.fName = fName;
		this.mName = mName;
		this.lName = lName;
		cardNumber = 0;
		expDate = 0;
		cvvNumber = 0;
		
		sharedUsers = new ArrayList<SharedUser>();
	}
	
	//----------------------------
	//Accessor methods
	//----------------------------
	public String getFName() {
		return fName;
	}
	
	public String getMName() {
		return mName;
	}
	
	public String getlName() {
		return lName;
	}
	
	public int getCardNum() {
		return cardNumber;
	}
	
	public int getExpDate() {
		return expDate;
	}
	
	public int getCvvNum() {
		return cvvNumber;
	}
	
	public ArrayList<SharedUser> getSharedUsers() {
		return this.sharedUsers;
	}
	
	//----------------------------
	//Mutator methods
	//----------------------------
	public void setFName(String fName) {
		this.fName = fName;
	}
	
	public void setMName(String mName) {
		this.mName = mName;
	}
	
	public void setlName(String lName) {
		this.lName = lName;
	}
	
	public void setCardNum(int cardNumber) {
		this.cardNumber = cardNumber;
	}
	
	public void setExpDate(int expDate) {
		this.expDate = expDate;
	}
	
	public void setCvvNum(int cvvNumber) {
		this.cvvNumber = cvvNumber;
	}
	
	//---------------------
	// sharing functions
	//---------------------	
	void charge(ArrayList<SharedUser> shareList) {
		
	}
	
	// TODO: later
	void changeSplit(UserAccount user, double percent) {
		SharedUser shared = BankUtils.findUser(this, user);
		
		shared.setPayPercent(percent);
	}
	
	void addSharedUser(UserAccount user, double payPercent) {
		SharedUser shared = new SharedUser(user, payPercent);
		
		this.sharedUsers.add(shared);
	}
	
	void removeSharedUser(UserAccount user) {
		SharedUser shared = BankUtils.findUser(this, user);
		
		this.sharedUsers.remove(shared);
	}
	
}