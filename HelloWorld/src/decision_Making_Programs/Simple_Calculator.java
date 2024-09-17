package decision_Making_Programs;

import java.util.Scanner;

public class Simple_Calculator {

	public static void main(String[] args) {


		int a = 10, b = 20;
		
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the operator");
		char operator = sc.next().charAt(0);
		//char operator = '*';
		
		switch(operator)
		{
		case '+' : System.out.println("Addition of 2 numbers :"+ (a+b));
		break;
		case '-' : System.out.println("Substraction of 2 numbers :"+ (a-b));
		break;
		case '*' : System.out.println("Multiplication of 2 numbers :"+ (a*b));
		break;
		case '/' : System.out.println("Division of 2 numbers :"+ (a/b));
		break;
		case '%' : System.out.println("Modulus of 2 numbers :"+ (a%b));
		break;
		default : System.out.println("Invalid Operator");
		break;
		}
		
		

	}

}
