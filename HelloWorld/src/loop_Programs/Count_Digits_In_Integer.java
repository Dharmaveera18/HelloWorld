package loop_Programs;

import java.util.Scanner;

public class Count_Digits_In_Integer {

	public static void main(String[] args) {
		// 

		Scanner sc =  new Scanner(System.in);
		System.out.println("Enter the Interger number :");
		int num = sc.nextInt();
		int rem = 0;
		int count = 0;
		while(num>0)
		{
			rem = num%10;
			count++;
			num = num/10;
		}
		System.out.println("The no of digits in given integer are :"+ count);
		
		

	}

}
