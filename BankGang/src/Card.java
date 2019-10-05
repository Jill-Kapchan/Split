import java.util.ArrayList;

public class Card {
	
	private String fName;
	private String mName;
	private String lName;
	private String cardName;
	
	private boolean oneUse;
	private boolean isShared;
	private long cardNumber;
	private int expDate;
	private int cvvNumber;
	private double limit;
	
	private String token;
	
	private ArrayList<SharedUser> sharedUsers;

	public Card(UserAccount user, String cardName, double limit, boolean oneUse, boolean isShared) {
		this.fName = user.getfName();
		this.mName = user.getmName();
		this.lName = user.getlName();
		this.cardName = cardName;
		cardNumber = 0;
		expDate = 1022;
		cvvNumber = 0;
		token = "";
		this.limit = limit;
		this.oneUse = oneUse;
		this.isShared = isShared;
		
		sharedUsers = new ArrayList<SharedUser>();
		this.sharedUsers.add(new SharedUser(user, 1)); // by default host pays 100% of charges
		this.setToken();
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
	
	public boolean isOneUse() {
		return oneUse;
	}
	
	public boolean isShared() {
		return isShared;
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
	
	public double getLimit() {
		return limit;
	}
	
	public String getToken() {
		return token;
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
	
	public void setToken() {
		this.token  = Long.toString(this.getCardNum()) + "/" +
				  	  Integer.toString(this.getExpDate()) + "/" +
				  	  Integer.toString(this.getCvvNum());
	}
	
	public void setToken(String token) {
		this.token  = token;
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
		if (!isShared) return;
		SharedUser shared = new SharedUser(user, payPercent);
		
		this.sharedUsers.add(shared);
	}
	
	void removeSharedUser(UserAccount user) {
		SharedUser shared = BankUtils.findSharedUser(this, user);
		
		this.sharedUsers.remove(shared);
	}
	
	@Override
	public String toString() {
		String cardName = "Card Name: " + this.cardName + "\n";
		String owner = "Owner: " + this.fName + " " + this.mName + " " + this.lName + "\n";
		String cardnum = "Card Number: " + this.cardNumber + "\n";
		String expdate = "Expiration Date: " + this.expDate + "\n";
		String cvvnumber = "CVV: " + this.cvvNumber + "\n";
		String limit = "Limit: " + (this.limit == -1 ? "Unlimited" : this.limit + "") + "\n";
		String singleuse = "Single Use: " + this.oneUse + "\n";
		String shared = "Shard Users: " + this.sharedUsers.toString() + "\n";
		
		return cardName + owner + cardnum + expdate + cvvnumber + limit + singleuse + shared;
	}
	
}