package functions_programs;

public class Number_Is_Perfect_Or_Not {

	public static void main(String[] args) {

		 //	perfect no or not 6 = num%i (i.e 123456) ===> + of divisible nos expect its own number is called perfect number.
		
			int num = 6;
			
			number_Is_perfect_Or_Not(num);
		}

		public static void number_Is_perfect_Or_Not(int num) {
			int sum = 0;
			
				for(int i = 1; i<num; i++)
				{
					if(num%i == 0)
					{
						sum = sum + i;
					}
				}
				
			if(sum == num)
			{
				System.out.println("The number is Perfect no : ");
			}
			else
			{
				System.out.println("Not a Perfect number");
			}
			
		}

	
	
	
}
