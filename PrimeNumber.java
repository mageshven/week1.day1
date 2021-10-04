package week1.data1;

public class PrimeNumber {

	public static void main(String[] args) {

		int inputPrime = 13;

		int  n;

		int flag = 0;

		n = inputPrime/2;

		for(int i= 2 ; i <= n ; i++) {

			if(inputPrime%i == 0) {
				flag=1;
				System.out.println(inputPrime+" is not prime number"); 
				break;      
			}
		}
		if(flag == 0) {
			System.out.println(inputPrime+" is prime number");
		}
	}

}
