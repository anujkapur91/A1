package Utility;

import java.util.Random;

public class GeneralFns {
	
	public static String randomString(int a)
	{
		
		String charString = "ABCDEFGHIJKLMNOPQRSTUVWXYZ";
		String randomString="";
		int length = a;
		int i;
		
		Random rand = new Random();
		
		for (i=0;i<length;i++)
		{
			randomString= randomString + charString.charAt(rand.nextInt(charString.length()));
			
			
		}
		
		return randomString;
		
		
		
				
	}
	
	public static String randomNumber(int a)
	{
		
		String charString = "1234567890";
		String randomNumber="";
		int length = a;
		int i;
		
		Random rand = new Random();
		
		for (i=0;i<length;i++)
		{
			randomNumber= randomNumber + charString.charAt(rand.nextInt(charString.length()));
			
			
		}
		return randomNumber;
		
		
		
				
	}

}
