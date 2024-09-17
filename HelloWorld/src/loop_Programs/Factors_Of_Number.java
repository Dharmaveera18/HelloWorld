package loop_Programs;

import java.util.Scanner;

public class Factors_Of_Number {

	public static void main(String[] args) {


		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the Number to be Checked");
		int num = sc.nextInt();
		
		System.out.println("The Factors of given number are :" + num);
		for(int i = 1; i<=num; i++)
		{
			if(num%i==0)
			{
				System.out.println(i);
			}
		}
		
		
		
		

	}

}
