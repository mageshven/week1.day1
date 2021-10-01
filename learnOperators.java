package week1.data2;

public class learnOperators {

public static void main(String[] args) {
	
	int a = 5;
	System.out.println(a++);
	System.out.println(a);
	System.out.println(++a);
	System.out.println(a);
	
	int b = 6;
    System.out.println(b--);
	System.out.println(b);
	System.out.println(--b);
	System.out.println(b);
	
	// The answer is 
		// 5
		// 6
		// 7
		// 7
	
	System.out.println(a+=5);
	System.out.println(a-= 5);
	System.out.println(a*= 5);
	System.out.println(a/= 5);

 }
}
