package java_Basic_Programs;

public class Print_Odd_No_Range_of1_to_10 {

	public static void main(String[] args) {


		System.out.println("The ODD nos from the range of 1 to 10 are :");
		
		for(int i=1; i<=10; i++)
		{
			if(i%2 == 1)  //if(i%2!=0)
			{
				System.out.println(i);
			}
		}
		
		

	}

}
