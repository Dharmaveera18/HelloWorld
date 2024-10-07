package string_Manipulation_Programs;

public class Count_The_No_Of_Occurence_Of_Characater_In_String {

	public static void main(String[] args) {


		String s = "Dharmaveera H";
		
		char key = 'a';
		int count = 0;
		for(int i = 0; i<s.length(); i++)
		{
			
				if(s.charAt(i) == key)
				{
					count++;
				}
			
		}
		System.out.println("The no of occurence of char is : "+ key + " :" + count);
		
		
		
		
		
		
		
		
		

	}

}
