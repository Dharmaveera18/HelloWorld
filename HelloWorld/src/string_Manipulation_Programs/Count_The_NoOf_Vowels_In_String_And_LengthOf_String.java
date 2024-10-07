package string_Manipulation_Programs;

public class Count_The_NoOf_Vowels_In_String_And_LengthOf_String {

	public static void main(String[] args) {


		String s = "Hello World! JAVA";
		int count = 0;
		
		int len = s.length();
		System.out.println("The length of string  : " +len);
		
		for(int i = 0; i<len; i++)
		{
			if(s.charAt(i) == 'A' || s.charAt(i) == 'E' || s.charAt(i) == 'I' || s.charAt(i) == 'O' || s.charAt(i) == 'U')
			{
				count++;
			}
			
			if(s.charAt(i) == 'a' || s.charAt(i) == 'e' || s.charAt(i) == 'i' || s.charAt(i) == 'o' || s.charAt(i) == 'u')
			{
				count++;
			}
		}
		
		System.out.println("The no of Vowels ARe : " + count);

	}

}
