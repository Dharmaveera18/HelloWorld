package loop_Programs;

import java.util.Scanner;

public class Number_Is_Palindrome_or_Not {

	public static void main(String[] args) {
		// 

		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the number to be Checked :");
		int num = sc.nextInt();
		int temp = num;
		int rem= 0;
		int sum = 0;
		
		while(num>0)
		{
			rem = num%10;
			sum = (sum*10)+rem;
			num = num/10;
		}
		if(sum == temp)
		{
			System.out.println("Its a Palindrome");
		}
		else
		{
			System.out.println("Its not a Palindrome");
		}
		
		

	}

}
