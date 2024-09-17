package decision_Making_Programs;

import java.util.Scanner;

public class Number_Prime_r_Not {

	public static void main(String[] args) {


		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the Number to be checked :");
		int num = sc.nextInt();
		int count = 0;
		for(int i = 1; i<=num; i++)
		{
			if(num%i == 0)
			{
				count++;
			}
		}
		if(count == 2)
		{
			System.out.println("Its a Prime number :");
		}
		else
		{
			System.out.println("Its Not a Prime number :");
		}

	}

}
