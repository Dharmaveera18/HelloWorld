package java_Basic_Programs;

public class Print_No_div_by_7 {

	public static void main(String[] args) {


		System.out.println("The nos divisible by 7 in the range of 1 to 200 are : :");
		
		for(int i=1; i<=200; i++)
		{
			if(i%7 == 0)
			{
				System.out.println(i);
			}
		}
		
		

	}

}
