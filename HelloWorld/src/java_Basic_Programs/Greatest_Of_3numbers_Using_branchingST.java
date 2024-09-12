package java_Basic_Programs;

public class Greatest_Of_3numbers_Using_branchingST {

	public static void main(String[] args) {


		int a =800;
		int b= 20;
		int c = 100;
		
		if(a>b)
		{
			if(a>c)
			{
				System.out.println("a is greatest number " + a);
			}
			else
			{
				System.out.println("c is greatest number " + c);
			}
		}
		else if(b>c)
		{
			System.out.println("b is greatest number " + b);
		}
		

	}

}
