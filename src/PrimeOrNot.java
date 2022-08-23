import java.util.Scanner;

public class PrimeOrNot {
	public static void main(String[] args) {
		Scanner readInput = new Scanner(System.in);
		System.out.print("Please enter an integer: ");
		int num = readInput.nextInt();
		
		String prime = " is a prime.";
		
		for(int i = 2; i < num; i++) {
			if (num % i == 0) {
				prime = " is not a prime.";
			}
		}
		
		if (num == 1) {
			prime = " is not a prime.";
		}

		
		System.out.print(num + prime);
		
		
		readInput.close();
	}
}
