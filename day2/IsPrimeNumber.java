package week1.day2;

public class IsPrimeNumber {
	public static void main(String[] args) {
		int n = 100;
		boolean isPrime = n > 1;
		for (int i = 2; i < n - 1; i++) {
			if (n % i == 0) {
				isPrime = false;
				break;
			}
		}
		System.out.println(n + (isPrime ? " is Prime" : " is not Prime"));
	}
}
