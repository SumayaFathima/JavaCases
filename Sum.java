/* Write a java code to find the sum of the given numbers
   Input : "asdf1qwer9as8d7"
   Output: 1+9+8+7 = 25 */

package java2;

public class Sum {

	public static void main(String[] args) {
		
		//Method 1 - using regular expression
		
		       String str = "asdf1qwer9as8d7";
		       String rep = str.replaceAll("\\D", "");
		       int n = Integer.parseInt(rep);
		
		       int sum =0;
		       while (n != 0) 
	          { 
	           sum = sum + n % 10; 
	           n = n/10; 
	           } 
		      System.out.println("***Method 1***");
		      System.out.println("Extracted numbers from the given string:"+ rep);
		      System.out.println("Sum of the given digits:" +sum);
		
		//Method 2 - using Character class & getNumericvalue() method
		      
				String str2 = "asdf1qwer9as8d7";
				int sum1 = 0;
				
				for (int i = 0; i < str2.length(); i++) {
					if(Character.isDigit(str2.charAt(i))) {
						sum1 = sum1 + Character.getNumericValue(str2.charAt(i));
					}
				}
				System.out.println("***Method 2***");
				System.out.println("Sum of the given digits:"+sum1); 
				
		//Method 3 using Character class
				String txt = "asdf1qwer9as8d7";
				int sum2 = 0;
				
				for (int i = 0; i < txt.length(); i++) {
					if(Character.isDigit(txt.charAt(i))) {
						sum2 += txt.charAt(i) - '0';
					}
				}
				System.out.println("***Method 3***");
				System.out.println("Sum of the given digits:"+sum2);
				
		//Method 4 using Character class
				String text = "asdf1qwer9as8d7";
				int sum3 = 0;
				
				for (int i = 0; i < text.length(); i++) {
					if(Character.isDigit(text.charAt(i))) {
						sum3 += Integer.parseInt(String.valueOf(text.charAt(i))); //converts char to String and then from String to Integer because Sum is integer
					}
				}
				System.out.println("***Method 4***");
				System.out.println("Sum of the given digits:"+sum3);
	}
	
	
}
