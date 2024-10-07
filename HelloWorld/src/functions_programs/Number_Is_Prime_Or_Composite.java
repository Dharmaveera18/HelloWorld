package functions_programs;

public class Number_Is_Prime_Or_Composite {

	public static void main(String[] args) {

		int num = 15;
		
		IsPrime(num);
  }

	public static void IsPrime(int num) 
	{
		int count = 0;
		for(int i =1; i<=num; i++)
		{
			if(num%i == 0)
			{
				count++;
			}
		}
		
		if(count == 2)
		{
			System.out.println("Its a Prime Number : ");
		}
		else
		{
			System.out.println("Its not a Prime number / its a Composite Number");
		}
	}
}
