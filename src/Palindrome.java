import java.util.Scanner;

public class Palindrome {
	
	public static void main(String[] args) {
		String isPal = " is a palindrom.";
		Scanner readInput = new Scanner(System.in);
		System.out.print("Please enter a string: ");
		String str = readInput.nextLine();
		for(int i = 0; i < str.length(); i++) {
			if (str.charAt(i) != str.charAt(str.length()-i-1)) {
				isPal = " is not a palindrom.";
			}
		}
		System.out.print("The string \"" + str + "\"" + isPal);
		readInput.close();
	}

}
