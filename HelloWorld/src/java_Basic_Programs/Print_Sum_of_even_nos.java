package java_Basic_Programs;

public class Print_Sum_of_even_nos {

	public static void main(String[] args) {


		System.out.println("The sum of even nos are : ");
		
		int sum= 0;
		for(int i=1; i<=10; i++)
		{
			if(i%2 == 0)
			{
				sum = sum+i;
			}
		}
		System.out.println(sum);
		

	}

}
