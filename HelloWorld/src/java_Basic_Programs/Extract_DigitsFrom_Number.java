package java_Basic_Programs;

public class Extract_DigitsFrom_Number {

	public static void main(String[] args) {
		
		
		
		int num = 123;
		int rem = 0;
		
		while(num>0)
		{
			rem = num%10;
			System.out.println(rem);
			System.out.println(" ");
			num = num/10;
		}
		
		
		
		
		
	}

}
