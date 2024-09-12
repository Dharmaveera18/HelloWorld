package java_Basic_Programs;

public class Switch_Statement {

	public static void main(String[] args) {


		char grade = 'd';
		
		switch(grade)
		{
		    case 'a' : System.out.println("First Class with Destination");
		    break;
		    case 'b' : System.out.println("First Class");
            break;
		    case 'c' : System.out.println("Second Class");
            break;
		    case 'd' : System.out.println("Pass");
            break;
		    case 'e' : System.out.println("Fail");
            break;
		    default : System.out.println("Invalid Operator");
		    break;    
		}
		
		
		

	}

}
