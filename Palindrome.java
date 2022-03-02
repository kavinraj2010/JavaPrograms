package week1.day5;
import java.util.Scanner;

public class Palindrome {

	public static void main(String[] args) {
		String value="Malayalam";
		
		String rev="";
		
		for(int i=value.length()-1;i>=0;i--)
		{
			rev=rev+value.charAt(i);
		}
		if(value.equalsIgnoreCase(rev))
		{
			System.out.println("The given string : "+value+" is Palindrome ");
		}
		else
		{
			System.out.println("The given string is not a Palindrome");
		}
	}
}
