package functions_programs;

public class Fibonacci_Series {

	
	public static void main(String[] args) {

		int n1 = 0;
		int n2 = 1;
		
		IsPrime(n1,n2);
  }

	public static void IsPrime(int n1, int n2) 
	{
		int sum = 0;
		int n = 10;
		for(int i = 1; i<=n; i++)
		{
			sum = n1+n2;
			System.out.println(n1+ " + " +n2+" = "+sum);
			n1 = n2;
			n2 = sum;
			
		}
	}
	
	
}
