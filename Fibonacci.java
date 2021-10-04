package week1.data1;

public class Fibonacci {

	public static void main(String[] args) {
		
		int firstName = 0;
		int secNum = 1;
		int sum;
		System.out.println(firstName);
		
		for (int i = 1; i < 8; i++) {
			sum = firstName + secNum;
			firstName =  secNum;
			secNum = sum;
			System.out.println(firstName);
		}
	}
}
