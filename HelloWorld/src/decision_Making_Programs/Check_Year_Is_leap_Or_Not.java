package decision_Making_Programs;

import java.util.Scanner;

public class Check_Year_Is_leap_Or_Not {

	public static void main(String[] args) {
		/* 1.Year is the leap year if it divisible by 4 i.e year %4 ==0
		 *2.Except for century years (ending with 00)
		 *3.The century years are leap year if and only if they are divisible 400 
		 *
		 */
		
		int year;
		boolean leap = false;
		
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the year to be Checked :");
        year = sc.nextInt();
		
		if(year%4 == 0)
		{
			if(year%100 == 0)  //if true = >It is a century year
			{
				if(year%400 == 0)
				{
					leap = true;
				}
			}
			leap = true;
		}

		System.out.println(year + "is a leap year :?" + leap);
	}

}
