import java.util.ArrayList;

public class Card {
	
	private String fName;
	private String mName;
	private String lName;
	private String cardName;
	
	private long cardNumber;
	private int expDate;
	private int cvvNumber;
	
	private ArrayList<SharedUser> sharedUsers;

	public Card(UserAccount user, String cardName) {
		this.fName = user.getfName();
		this.mName = user.getmName();
		this.lName = user.getlName();
		this.cardName = cardName;
		cardNumber = 0;
		expDate = 1022;
		cvvNumber = 0;
		
		sharedUsers = new ArrayList<SharedUser>();
		this.sharedUsers.add(new SharedUser(user, 1)); // by default host pays 100% of charges
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
	
	public String getCardName() {
		return this.cardName;
	}
	
	public long getCardNum() {
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
	
	public void setCardName(String cardName) {
		this.cardName = cardName;
	}
	
	public void setCardNum(long cardNumber) {
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
	void charge(double amt) {
		// round down on uneven charges, host will pay the rest
	}
	
	// TODO: later
	void changeSplit(UserAccount user, double percent) {
		SharedUser shared = BankUtils.findSharedUser(this, user);
		
		shared.setPayPercent(percent);
	}
	
	void addSharedUser(UserAccount user, double payPercent) {
		SharedUser shared = new SharedUser(user, payPercent);
		
		this.sharedUsers.add(shared);
	}
	
	void removeSharedUser(UserAccount user) {
		SharedUser shared = BankUtils.findSharedUser(this, user);
		
		this.sharedUsers.remove(shared);
	}
	
}