package java_Basic_Programs;

import java.util.Scanner;

public class Count_Factors_Of_Given_Number {

	public static void main(String[] args) {
		
		
        int num = 15, count = 0;
		
		for(int i = 1; i<=num; i++)
		{
			if(num%i == 0) 
			{
				count++;
			}
		}
		System.out.println(count);
		

	}

}
