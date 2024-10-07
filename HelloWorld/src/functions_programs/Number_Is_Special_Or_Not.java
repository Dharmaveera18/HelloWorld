package functions_programs;

public class Number_Is_Special_Or_Not {

	public static void main(String[] args) {

		 //	Special no or not 145 = no of digits = 3 ===> 1! + 4! + 5!===>145
		
			int num = 145;
			
			number_Is_Special_Or_Not(num);
		}

		public static void number_Is_Special_Or_Not(int num) {
			int sum = 0, rem = 0;
			int temp = num;
			while(num>0)
			{
				rem = num%10;
				num = num/10;
				int fact = 1;
				for(int i = 1; i<=rem; i++)
				{
					fact = fact*i;
				}
				
				sum = sum + fact;
			}
			
			if(sum == temp)
			{
				System.out.println("The number is Special no : ");
			}
			else
			{
				System.out.println("Not a Special number");
			}
			
		}

	
	
	
	
}
