package loop_Programs;

import java.util.Scanner;

public class Sum_Of_The_Digits {

	public static void main(String[] args) {
		// 

		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the number to be checked : ");
		int num = sc.nextInt();
		int rem = 0;
		int sum = 0 ; 
		while(num>0)
		{
			rem = num%10;
			sum = sum + rem;
			num = num/10;
		}
		System.out.println(sum);

	}

}
