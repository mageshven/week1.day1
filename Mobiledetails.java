package week1.data1;

public class Mobiledetails {

	private String mobileBrand = "Apple";
	public Long imei = 2345353453453352353L; // long digit number allowed only 19 digits
	boolean isCharged = true;
	int model = 8;
	public static void main(String[] args) {
		
		Mobiledetails obj = new Mobiledetails();
		System.out.println("welcome"+obj.mobileBrand);
		
	
	}
	
}
