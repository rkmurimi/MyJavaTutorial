// Reverse String
// R.K.M -- May, 30, 2019
// reverseString.java
// ***************
// Reversse String without using string inbuild function reverse()

public class reverseString2 {

  public static void main(String[] args){

    // Generate method stub
    // Initialize string variable
    String str = "Excellence requires eternal scrutiny";
    
    //Convert string into character array
    char chars[] = str.toCharArray();
    
    //Display original string
    System.out.println("*** Original String");
    System.out.println(str);
    System.out.println("");
    System.out.println("********************************");
    System.out.println("");
    System.out.println("*** Reversed String");
    System.out.println("********************************");
    //Use loop to iterate each character
    for(int i = chars.length - 1; i >= 0; i--){
    
	//Display characters of string in reverse
	System.out.print(chars[i]);
    }
    
    System.out.println("");
    
  }



}