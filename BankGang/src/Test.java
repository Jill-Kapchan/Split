
public class Test {

	public static void main(String[] args) {
		for (int i = 0; i < 10000; i++) {
			int cvv = (int) (Math.random() * 1000.0) + 100;
			if (cvv > 999) cvv = cvv - 100;
			System.out.println(cvv);
		}
	}
	
}
