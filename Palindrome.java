/* Check for the palindrome of the given string:
   Input : "malayalam"
   Output: Yes,Palindrome*/


package java1;

class Palindrome{

public static void main(String args[])
   {
    String str = "malayalam";
    //creating an empty string to store the revered value
    String rev = "";
    
    //iterate over the original string
    for(int i=str.length()-1; i >=0; i--)
    {
    	 rev = rev + str.charAt(i);
    	//rev += str.charAt(i);	
    }
    
    boolean bol = str.equalsIgnoreCase(rev);
    if(bol==true)
    {
    	System.out.println("It is a panlindrome");
    }
        	else 
    		System.out.println("It is not a palindrome");
    
    
      //System.out.println(str.equals(rev)? "Yes, Palindrome" : "Not a Palindrome");
    
    }
   
}