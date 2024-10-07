package functions_programs;

public class Number_Is_Amstrong_Or_Not {

	
	public static void main(String[] args) {

		 //	Amstrong no or not 153 = no of digits = 3 ===> 1^3 + 5^3 + 3^3 ===>153
		
			int num = 153;
			
			number_Is_Amstrong_Or_Not(num);
		}

		public static void number_Is_Amstrong_Or_Not(int num) {
			int sum = 0, rem = 0;
			int temp = num;
			while(num>0)
			{
				rem = num%10;
				sum = sum + (rem*rem*rem);
				num = num/10;
			}
			
			if(sum == temp)
			{
				System.out.println("The number is Amstrong");
			}
			else
			{
				System.out.println("Not a Amstrong number");
			}
			
		}

}
