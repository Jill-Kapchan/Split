
public class Card {
	
	public String fName;
	public String mName;
	public String lName;
	
	public int cardNumber;
	public int expDate;
	public int cvvNumber;
	public boolean bankType;

	public Card() {
		fName = "?";
		mName = "?";
		lName = "?";
		cardNumber = 0;
		expDate = 0;
		cvvNumber = 0;
		bankType = false;
	}
	
	public String getFName() {
		return fName;
	}
	
	public String getMName() {
		return mName;
	}
	
	public String getlName() {
		return lName;
	}
	
	
}