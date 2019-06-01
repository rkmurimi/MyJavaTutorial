// Reverse String
// R.K.M -- May, 30, 2019
// reverseString.java
// ***************
// Reversse String without using string inbuild function

public class reverseString {

  public static void main(String[] args){

    // Generate method stub
    // Initialize string variable
    String str = "Excellence";
    
    //Making use of string builder class
    StringBuilder str2 = new StringBuilder();
    
    //Use the obj str2 of the class StringBuilder to append value stored in str variable
    str2.append(str);
    
    // Use the reverse function of string builder to reverse word
    str2 = str2.reverse();
    
    //Display original word
    System.out.println("Original Word");
    System.out.println(str);
    
    //Display reversed word
    System.out.println("Reversed Word");  
    System.out.println(str2);
  }



}