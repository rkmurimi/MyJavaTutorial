import java.util.Scanner;

public class reverseString3{

    public static void main(String[] args){
    
	//Program to display entered string in reverseString
	
	// Declare the variable
	String str;
	
	//use scanner class to declare an object
	Scanner in = new Scanner(System.in);
	
	
	System.out.println("Please enter the string you want to reverse: ");
	
	//use nextLine function to read the input with spaces between the words
	str = in.nextLine();
	
	// use split function to to split the string into substring(no spaces)
	String[] token = str.split(""); // split() used to print in reverse
	
	for(int i = token.length - 1; i >=0; i--){
	  System.out.print(token[i] + "");
	
	}
	
	
    
    }







}