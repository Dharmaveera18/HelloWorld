package string_Manipulation_Programs;

public class Concat_Two_Strings {

	public static void main(String[] args) {
		// Approach 1 using + operator

		
		String str1 = "Hello, ";
		
		String str2 = "World!";
		
		String result;
		/*
		
		result = str1+str2;
		
		System.out.println(result);
		
		*/
		result = str1.concat(str2);
		
		System.out.println(result);
		
		
	}

}
