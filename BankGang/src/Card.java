import java.util.ArrayList;

public class Card {
	
	private String fName;
	private String mName;
	private String lName;
	
	private int cardNumber;
	private int expDate;
	private int cvvNumber;
	private boolean bankType;
	
	private ArrayList<SharedUser> sharingStatus;

	public Card(String fName, String mName, String lName) {
		this.fName = fName;
		this.mName = mName;
		this.lName = lName;
		cardNumber = 0;
		expDate = 0;
		cvvNumber = 0;
		bankType = false;
		
		sharingStatus = new ArrayList<SharedUser>();
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
	
	public boolean getBank() {
		return bankType;
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
	
	public void setBank(boolean bankType) {
		this.bankType = bankType;
	}
	
	// sharing functions
	
	void charge(ArrayList<SharedUser> shareList) {
		
	}
	
	void changeSplit(ArrayList<SharedUser> shareList) {
		
	}
	
	void addSharedUser(ArrayList<SharedUser> shareList, String userAdd) {
		
	}
	
	void removeSharedUser(ArrayList<SharedUser> shareList, String userRemove) {
		
	}
	
}