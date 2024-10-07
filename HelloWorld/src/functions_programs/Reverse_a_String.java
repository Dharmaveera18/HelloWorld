package functions_programs;

public class Reverse_a_String {

	public static void main(String[] args) {

		String s = "DHARMAVEERA";
		string_Reverse(s);
		

	}

	public static void string_Reverse(String s) {
		
        String rev = "";
		
		for(int i = s.length()-1; i>=0; i--)
		{
			rev = rev + s.charAt(i);
		}
		
		System.out.println(rev);
	}

}
