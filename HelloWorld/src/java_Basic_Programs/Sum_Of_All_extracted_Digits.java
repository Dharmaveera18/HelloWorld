package java_Basic_Programs;

public class Sum_Of_All_extracted_Digits {

	public static void main(String[] args) {
		
		
		int num = 152, rem = 0, sum=0;
		
		while(num>0)
		{
			rem = num%10;
			
			sum = sum + rem;
			
			num = num/10;
		}
		
		System.out.println(sum);
	}

}
