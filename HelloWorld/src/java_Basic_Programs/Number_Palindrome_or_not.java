package java_Basic_Programs;

public class Number_Palindrome_or_not {

	public static void main(String[] args) {


		int num = 1634;
        int rem =0;
        int sum = 0;
		int temp = num;
        
        
		while(num>0)
		{
			rem = num%10;
			
			sum = sum+(rem*rem*rem*rem);
			
			num = num/10;
		}
		if(temp == sum)
		{
			System.out.println("Its a Amstrong");
		}
		else
		{
			System.out.println("Its not a Amstrong");
		}
		

	}

}
