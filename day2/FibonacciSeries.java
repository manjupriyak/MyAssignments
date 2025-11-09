package week1.day2;

public class FibonacciSeries {
	public static void main(String[] args) {
		int n=8;
		int previousValue=0;
		int currentValue=1;
		int newValue;
		for(int i=0;i<n;i++)
		{
			System.out.println(previousValue);
			newValue=previousValue+currentValue;
			previousValue=currentValue;
			currentValue=newValue;
		}
		
		
	}

}
