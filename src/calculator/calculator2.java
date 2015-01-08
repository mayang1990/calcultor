package calculator;

import java.util.Scanner;

class calculator {
	
	float a,b;
	
	public float add(){
		return a+b;	
	}
	
	public float minus(){
		return a-b;
	}
	
	public float multiply(){
		return a*b;
	}
	
	public float divide(){
		return a/b;
	}


}

public class calculator2{
	public static void main(String[] args){
		Scanner input = new Scanner(System.in);
		calculator cal = new calculator();
		
		System.out.println("Please input the 1st number:");
		cal.a= input.nextFloat();
		System.out.println("Please input the 2st number:");
		cal.b = input.nextFloat();
		
		
		System.out.println("The sum = " + cal.add());
		System.out.println("The minus = " + cal.minus());
		System.out.println("The multiply = " + cal.multiply());
		System.out.println("The divide = " + cal.divide());

		
	}
}