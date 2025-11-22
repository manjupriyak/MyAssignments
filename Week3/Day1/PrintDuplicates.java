package Week3.Day1;

import java.util.Arrays;

public class PrintDuplicates {
	
	public static void FindDups(int[] num) {
	Arrays.sort(num);
		
	for(int i=0;i<num.length-1;i++)
	{
	if(num[i]==num[i+1])
	{
		System.out.println(num[i]);
	}
	
	}
	}

	public static void main(String[] args) {
		int[] Myarray={2, 5, 7, 7, 5, 9, 2, 3};
		  
		FindDups(Myarray);

	}

}
