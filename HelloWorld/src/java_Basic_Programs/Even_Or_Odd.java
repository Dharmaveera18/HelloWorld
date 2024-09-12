package java_Basic_Programs;

import java.util.Scanner;

public class Even_Or_Odd {

	public static void main(String[] args) {
		//int num = 87;
		
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the number");
		int num = sc.nextInt();
		
		if(num%2==0)
		{
			System.out.println("The number is Even :" + num);
		}
		else
		{
			System.out.println("The number is Odd :" + num);
		}

	}

}
