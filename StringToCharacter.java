package week1.day4;

public class StringToCharacter {
public static void main(String[] args) {
	
	String text="kavinraj S";
	
	char[] array=text.toCharArray();
	
	for(int i=0;i<text.length();i++)
	{
		System.out.println(array[i]);
	}
}
}
