package loop_Programs;

import java.util.Scanner;

public class Fibonacci_Series {

	public static void main(String[] args) {
		// 

		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the range of number");
		int num = sc.nextInt();
		
		
		int n1 = 0;
		int n2 = 1;
		int sum =0;
		for(int i = 1; i<=num; i++)
		{
			sum = n1+n2;
			System.out.println(n1 + "+" + n2 + "=" +sum);
			n1 = n2;
			n2 = sum;
			
			
			
		}
		//System.out.println(sum);

	}

}
