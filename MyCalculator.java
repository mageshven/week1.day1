package week1.date2;

import week1.date2.Calculator;

public class MyCalculator {

	public static void main(String[] args) {
		
		Calculator objrt = new Calculator();
		

		int num1,num2 = 0;
		num1 = 50;
		num2 = 20;
		
		
		int sum = objrt.addition(num1, num2);
	    System.out.println();
	    System.out.println("Sum: "+sum);//Print the sum of two numbers
	    
	    int sub = objrt.subraction(num1, num2);
	    System.out.println("Subtract of two numbers: "+sub);
	    
	   
	    int num3 = 5;
	    int num4 = 6;
	    int prdt = objrt.product(num3, num4);
	    System.out.println(prdt);
	    
	    int a = 4;
	    int b = 2;
	    int div = objrt. division(a,b);
	    System.out.println(div);
	    
	    
	}

}
