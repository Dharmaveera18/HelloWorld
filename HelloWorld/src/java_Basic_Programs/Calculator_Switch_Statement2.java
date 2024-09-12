package java_Basic_Programs;

public class Calculator_Switch_Statement2 {

	public static void main(String[] args) {

		int a =10, b =20;

		char operator = '*';
		
		switch(operator)
		{
		    case '+' : System.out.println("Add of 2 numbers :"+ (a+b));
		    break;
		    case '-' : System.out.println("Sub of 2 numbers :" + (a-b));
            break;
		    case '*' : System.out.println("Mul of 2 numbers :" + (a*b));
            break;
		    case '/' : System.out.println("Divi of 2 numbers :"+ (a/b));
            break;
		    case '%' : System.out.println("Modulus of 2 numbers :" + (a%b));
            break;
		    default : System.out.println("Invalid Operator ...");
		    break;    
		}
		
		
		

	}

}
