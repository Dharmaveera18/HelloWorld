package decision_Making_Programs;

public class String_Is_Palindrome_Or_Not {

	public static void main(String[] args) {
		// 

		
		String s = "katak";
		
		String rev = "";
        int len = s.length();
		for(int i = len-1; i>=0; i--)
		{
			rev = rev + s.charAt(i);
			//System.out.println(s.charAt(i));
		}
		System.out.println(rev);
		if(s.equals(rev))
		{
			System.out.println("String is a Palindrome");
		}
		else
		{
			System.out.println("String is not a Palindrome");
		}
		
	}

}
