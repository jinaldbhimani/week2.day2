package week2.day1;



public class Palindrome {

	public static void main(String[] args) {
		
		String input="madam";
		String rev="";
		int i;
		
		char[] text = input.toCharArray();
		
		for ( i=text.length-1; i>=0; i--)
		{
			
			rev=rev+input.charAt(i);
			
		}
		if (input.equals(rev))
		{
			System.out.println(input+" is palindrome");
		}
			else
			{
				System.out.println(input+" is not palindrome");
			}
		
				
				

	}

}
