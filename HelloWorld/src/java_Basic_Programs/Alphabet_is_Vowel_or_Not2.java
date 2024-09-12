package java_Basic_Programs;

import java.util.Scanner;

public class Alphabet_is_Vowel_or_Not2 {

	public static void main(String[] args) {


		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the Character");
		char ch = sc.next().charAt(0);
	
		if(ch >= 'a' && ch <= 'z')
		{
			if(ch == 'a' || ch=='e' || ch == 'i' || ch=='o' || ch =='u')
			{
				System.out.println("The character is Vowel " + ch);
			}
			else
			{
				System.out.println("The character is not a Vowel " + ch);
			}
		}
		else
		{
			System.out.println("Not a Alphabest");
		}
		
		

	}

}
