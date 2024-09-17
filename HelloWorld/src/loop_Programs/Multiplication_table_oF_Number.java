package loop_Programs;

import java.util.Scanner;

public class Multiplication_table_oF_Number {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
        System.out.println("Enter the number :");
        int number = sc.nextInt();
        System.out.println("Enter the range until loop should run");
        int range = sc.nextInt();
        multipliaction_of_number(number, range);
        
	}
	
	
	
	public static void multipliaction_of_number(int number, int range)
	{
		System.out.println("Enter the number :" + number);
		
		for(int i = 1; i<=range; i++)
		{
			System.out.println(number + "x" + i +"="+ (number*i));
		}
		
	}

}
