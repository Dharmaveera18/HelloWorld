package java_Basic_Programs;

import java.util.Scanner;

public class Greatest_Of_2_Numbers {

	public static void main(String[] args) {


		Scanner sc = new Scanner(System.in);
		
		System.out.println("Enter the number 1");
		int num1 = sc.nextInt();
		System.out.println("Enter the number 2");
		int num2 = sc.nextInt();

		if(num1>num2)
		{
			System.out.println("The number1 is greater then the num2 "+ num1);
		}
		else
		{
			System.out.println("The number2 is greater then the num1 "+ num2);
		}
		
	}

}
