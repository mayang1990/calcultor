package calculator;

import java.util.Scanner;

public class calculator1 {

	public static void main(String[] args) {

		Scanner input = new Scanner(System.in);

		System.out.println("Please input the 1st number:");
		float a1 = input.nextFloat();
		System.out.println("Please input the 2st number:");
		float a2 = input.nextFloat();

		float sum = a1 + a2;
		float minus = a1 - a2;
		float multiply = a1 * a2;
		float divide = a1 / a2;
		System.out.println("The sum = " + sum);
		System.out.println("The minus = " + minus);
		System.out.println("The multiply = " + multiply);
		System.out.println("The divide = " + divide);

	}

}