package string_Manipulation_Programs;

public class Count_No_Of_Words_In_Sentence {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		String s = "Welcome to Java Program";
		int count = 1;
		
		for(int i = 0; i<s.length(); i++)
		{
			if((s.charAt(i) == ' ') && (s.charAt(i+1) != ' '))
			{
				count++;
			}
		}
		System.out.println("The no of words in a sentence are : " + count);
		
	}

}
