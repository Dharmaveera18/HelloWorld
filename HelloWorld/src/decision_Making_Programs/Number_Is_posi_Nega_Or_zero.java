package decision_Making_Programs;

import java.util.Scanner;

public class Number_Is_posi_Nega_Or_zero {

	public static void main(String[] args) {


		Scanner sc = new Scanner(System.in);
		
		System.out.println("Enter the number");
		int num = sc.nextInt();
		
		if(num>0)
		{
			System.out.println("Its a Positive number");
		}
		else if(num<0)
		{
			System.out.println("Its a negative number");
		}
		else
		{
			System.out.println("Its a zero");
		}

	}

}
