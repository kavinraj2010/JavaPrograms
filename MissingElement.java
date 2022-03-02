package week1.day4;

import java.util.Arrays;

public class MissingElement {

	public static void main(String[] args) {
		
		int[] arr = {1,5,8,2,6,3,4,9,10,7,13,11};
		
		Arrays.sort(arr);
		
		System.out.println(arr.length);
		
		for (int i = 1; i <= arr.length; i++) 
		{
			
			if(arr[i-1]!=i)
			{
				System.out.println("The missing element is:"+i);
				break;
			}
		}
	}
}