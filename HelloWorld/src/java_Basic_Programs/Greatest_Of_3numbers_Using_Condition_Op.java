package java_Basic_Programs;

public class Greatest_Of_3numbers_Using_Condition_Op {

	public static void main(String[] args) {


		int a =800;
		int b= 20;
		int c = 100;
		
		
		int d = a>b && a>c ? a: b>a && b>c ? b : c;
		
		System.out.println("The Greatest number is : "+ d);

	}

}
