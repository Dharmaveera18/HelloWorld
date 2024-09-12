package java_Basic_Programs;

import java.util.Scanner;

public class Facorial_Of_Number {

	public static void main(String[] args) {


		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the Number");
		int num = sc.nextInt();
		//int num = 5, 
		int fact = 1;
		
		for(int i=1; i<=num; i++)
		{
			fact = fact*i;
		}
		
		System.out.println(fact);

	}

}
