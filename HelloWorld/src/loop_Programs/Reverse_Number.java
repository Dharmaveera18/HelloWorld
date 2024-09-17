package loop_Programs;

import java.util.Scanner;

public class Reverse_Number {

	public static void main(String[] args) {


		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the number to be checked : ");
		int num = sc.nextInt();
		int rem = 0;
		int sum = 0;
		while(num>0)
		{
			rem = num%10;
			//System.out.print(rem);
			sum = (sum*10)+rem;
			num = num/10;
		}
		System.out.println(sum);
		
		
		
		
		

	}

}
