package java_Basic_Programs;

public class First_10_fibonaci_series {

	public static void main(String[] args) {


		int n1 =0, n2 =1, sum =0;
		
		System.out.println("The fibonaci series are :");

		System.out.println(n1);
		System.out.println(n2);
		
		for(int i =1; i<=10; i++)
		{
			sum = n1+n2;
			n1 = n2;
			n2 = sum; 
			System.out.println(sum);
			
		}
		
	}

}
