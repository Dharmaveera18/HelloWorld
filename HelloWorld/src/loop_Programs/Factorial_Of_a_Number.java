package loop_Programs;

import java.util.Scanner;

public class Factorial_Of_a_Number {

	public static void main(String[] args) {


		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the Number to be Checked :");
		int num = sc.nextInt();
		int rem = 0;
		
		while(num>0)
		{
			int fact = 1;
			rem = num%10;
			num= num/10;
			for(int i=1; i<=rem; i++)
			{
				fact = fact*i;
			}
			System.out.println("The factorial of given number is  :" +fact);
		}
		
		
		

	}

}
