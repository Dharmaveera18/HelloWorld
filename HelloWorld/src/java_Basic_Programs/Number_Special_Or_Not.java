package java_Basic_Programs;

public class Number_Special_Or_Not {

	public static void main(String[] args) {


		int num = 145;
		int rem = 0;
		int sum = 0;
		int temp = num;
		
		while(num>0)
		{
			int fact = 1;
			rem = num%10;
			
			num = num/10;
			
			for(int i=1; i<=rem; i++)
			{
				fact = fact*i;
			}
			
			sum = sum+fact;
			
		}
		if(temp == sum)
		{
			System.out.println("Its a Special number");
		}
		else
		{
			System.out.println("Its not a special number");
		}
		
		

	}

}
