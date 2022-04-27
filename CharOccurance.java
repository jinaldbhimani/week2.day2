package week2.day1;

public class CharOccurance {

	public static void main(String[] args) {
		String str = "welcome to chennai";
		int i=0;
		int count =0;
		
		char[] charArray = str.toCharArray();
		for(i=0;i<charArray.length;i++)
		{
		if(charArray[i]== 'e')
		{
			count =count +1;
		
		}
		
		}
		System.out.println(count);
			
	}
}
