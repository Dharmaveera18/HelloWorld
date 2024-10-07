package functions_programs;

public class Factorial_Of_Number {

	public static void main(String[] args) {

		int num = 4;
		
		Factorial_Of_Number1(num);
  }

	public static void Factorial_Of_Number1(int num) 
	{
		int fact = 1;
		for(int i=1; i<=num; i++)
		{
			fact = fact*i;
		}
		
		System.out.println(fact);
		
	}

}
