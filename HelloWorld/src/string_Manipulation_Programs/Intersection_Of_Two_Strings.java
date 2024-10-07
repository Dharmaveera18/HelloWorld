package string_Manipulation_Programs;

public class Intersection_Of_Two_Strings {

	public static void main(String[] args) {


		String s1 = "Abheri";
		
		String s2 = "Abhogi";
		
		for(int i = 0; i<s1.length(); i++)
		{
			for(int j=0; j<s2.length(); j++)
			{
				if(s1.charAt(i) == s2.charAt(j))
				{
					System.out.print(s1.charAt(i));
				}
			}
		}
		
		
		
		

	}

}
