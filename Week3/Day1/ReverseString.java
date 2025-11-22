package Week3.Day1;

public class ReverseString {

	public static void reverseString(String str) {

		char[] charArray = str.toCharArray();
		/*
		 * for(int j=0;j<charArray.length;j++) {
		 * System.out.println("Converting string to charecter Array " + charArray[j]); }
		 */
		for (int i = charArray.length - 1; i >= 0; i--) {

			System.out.println("Revered String " + charArray[i]);
		}

	}

	public static void main(String[] args) {

		String str = "Manjupriya kannan";
		System.out.println("String Name " + str);
		// str.toCharArray();
		reverseString(str);

	}

}
