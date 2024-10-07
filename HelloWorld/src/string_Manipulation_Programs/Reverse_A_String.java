package string_Manipulation_Programs;

public class Reverse_A_String {

	public static void main(String[] args) {


		String s = "Java Programming";
		
		String rev = "";
		
		for(int i = s.length()-1; i>=0; i--)
		{
			rev = rev + s.charAt(i);
		}

		
		System.out.println(rev);
	}

}
