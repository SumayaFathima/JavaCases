/*Write a java program to find the occurance of the character 'o' in the following String.
  Input : "You have no choice other than following me"
  Output : Ocuurance of o: 6*/


package java1;

class occurance {  

	public static void main(String[] args) {
		String str = "You have no choice other than following me!";
		int count = 0;
		char[] ch = str.toCharArray();
		for (int i =0; i < ch.length-1; i++)
		{
			if(ch[i]=='o')
				count++;
		}
		System.out.println(count);
		
    	        }
	}
	   
