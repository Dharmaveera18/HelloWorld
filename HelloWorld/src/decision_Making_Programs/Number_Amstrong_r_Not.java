package decision_Making_Programs;

import java.util.Scanner;

public class Number_Amstrong_r_Not {

	public static void main(String[] args) {


		System.out.println("Enter the 3 digit number :");
		Scanner sc  = new Scanner(System.in);
		int num = sc.nextInt();  //Ex : 153
		int temp = num;
        int rem = 0;
        int sum = 0;
		 while(num>0) 
		 {
			 rem = num%10;
			 sum = sum +(rem*rem*rem);
			 num = num/10;
		 }
		 
		 if(sum == temp)
		 {
			 System.out.println("Its a Armstrong number");
		 }
		 else 
		 {
			 System.out.println("Its a Not Armstrong number");
		 }

	}

}
