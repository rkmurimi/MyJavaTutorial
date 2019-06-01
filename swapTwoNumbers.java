import java.util.Scanner;

public class swapTwoNumbers{

    public static void main(String[] args){
    
	//Program to swap two numbers using a third variable
	
	// Declare the variable
	int x, y, temp;
		
	System.out.print("Please enter the value of x: ");
	
	//use scanner class to declare an object
	Scanner in = new Scanner(System.in);
	x = in.nextInt();
	
	System.out.println();
	System.out.print("Please enter the value of y: ");
	y = in.nextInt();
	
	System.out.println();
	System.out.println("******* Before Swap *******");
	System.out.print("The value of x is : ");
	System.out.print(x);
	System.out.println();
	System.out.print("The value of y is : ");
	System.out.print(y);
	System.out.println();
	temp = x;
	x = y;
	y = temp;
	
	System.out.println("******* After Swap *******");
	System.out.print("The value of x is : ");
	System.out.print(x);
	System.out.println();
	System.out.print("The value of y is : ");
	System.out.print(y);
	System.out.println();
    
    }


}