package loop_Programs;

import java.util.Scanner;

public class Sum_Of_Natural_numbers {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the range of number");
		int num = sc.nextInt();
		
		int sum = 0;
		for(int i = 1; i<=num; i++)
		{
			sum = sum +i;
			System.out.println(sum + "+" + i + " = " +sum);
		}
		System.out.println("Sum of Natural numbers "+sum);
	}

}
