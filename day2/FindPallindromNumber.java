package week1.day2;

public class FindPallindromNumber {
	public static void main(String[] args) {
		int input = 121;
		int inputNum = input;
		int remainderNum;
		int output = 0;
		while (input >= 1) {
			remainderNum = input % 10;
			// System.out.println(remainderNum);
			output = output * 10 + remainderNum;
			// System.out.println(reverseNum);
			input = input / 10;

		}
		// System.out.println(input);
		if (inputNum == output) {
			System.out.println("Given Number is Pallindrome");

		}
		else 
		{
			System.out.println("Given Number is not Pallindrome");
		}

	}

}
