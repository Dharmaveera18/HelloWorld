package java_Basic_Programs;

public class Factors_Of_Given_Number {

	public static void main(String[] args) {
		
		
		//i.e num%i == 0 ==>factor
		
		int num = 15;
		
		for(int i = 1; i<=num; i++)
		{
			if(num%i == 0) 
			{
				System.out.println(i);
			}
		}

	}

}
