package java_Basic_Programs;

import java.util.Scanner;

public class Character_is_Alphabet_or_Not {

	public static void main(String[] args) {


		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the Character");
		char ch = sc.next().charAt(0);
		
		if(ch >= 'a' && ch <='z' || ch >= 'A' && ch <='Z' )
		{
			System.out.println("The character is Alphabet " + ch);
		}
		else
		{
			System.out.println("The character is not a Alphabet " + ch);
		}
		

	}

}
