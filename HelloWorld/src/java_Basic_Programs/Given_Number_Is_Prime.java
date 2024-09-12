package java_Basic_Programs;

import java.util.Scanner;

public class Given_Number_Is_Prime {

	public static void main(String[] args) {
		
		
		//i.e num%i == 0 ==>factor
		
		
		
		
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the Number");
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
			System.out.println("Its a Prime Number");
		}
		else
		{
			System.out.println("Not a Prime number");
		}
		

	}

}
