package java_Basic_Programs;

public class Given_Number_Is_Perfect {

	public static void main(String[] args) {
		
		
		//i.e num%i == 0 ==>factor
		
		int num = 6, sum = 0;
		
		for(int i = 1; i<num; i++)
		{
			if(num%i == 0) 
			{
				sum = sum + i;
			}
		}
		if(sum == num)
		{
			System.out.println("Its a Perfect Number");
		}
		else
		{
			System.out.println("Not a Perfect Number");
		}

	}

}
