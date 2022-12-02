import java.util.Scanner; 
public class Main_class {

	public static void main(String[] args) {
    int x,y,z;
	Scanner input = new Scanner(System.in); 
	System.out.println("Please enter first number:");
	x = input.nextInt() ;
	System.out.println("Please enter second number:");
	y = input.nextInt() ;
	System.out.println("Please enter third number:");
	z = input.nextInt() ;
	if (x>y)
	 System.out.println("first number is bigger");
	else 
	{
		if(y>z)
			System.out.println("Second number is bigger");
		else
		    System.out.println("third number is bigger");
	}
	}	
}


