
public class Card {
	
	private String fName;
	private String mName;
	private String lName;
	
	private int cardNumber;
	private int expDate;
	private int cvvNumber;
	private boolean bankType;

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