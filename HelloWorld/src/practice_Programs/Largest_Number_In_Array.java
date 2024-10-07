package practice_Programs;



public class Largest_Number_In_Array {

	public static void main(String[] args) {

	 //	perfect no or not 6 = num%i (i.e 123456) ===> + of divisible nos expect its own number is called perfect number.
	
		int num = 1221;
		
		number_Is_palindrome_Or_Not(num);
	}

	public static void number_Is_palindrome_Or_Not(int num) {
		int sum = 0, rem = 0;
		int temp = num;
			while(num > 0)
			{
				rem = num%10;
				sum = (sum*10)+rem;
				num = num/10;
			}
			
		if(sum == temp)
		{
			System.out.println("The number is Palindrome : "+sum );
		}
		else
		{
			System.out.println("Not a Palindrome number : "+ sum);
		}
		
	}

	

	
	

}
