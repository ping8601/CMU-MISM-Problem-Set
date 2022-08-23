import java.util.Scanner;
import java.util.Arrays;

public class SortNum {
	public static void main(String[] args){
		Scanner readInput = new Scanner(System.in);
		System.out.print("Please enter numbers separate with space: ");
		String input = readInput.nextLine();
		String[] strArr = input.split(" ");
		int n = strArr.length;
		int[] numArr = new int[n];
		for(int i = 0; i < n; i++) {
			numArr[i] = Integer.valueOf(strArr[i]);
		}
		Arrays.sort(numArr);
		for(int j = 0; j < numArr.length; j++) {
			System.out.print(numArr[j] + " ");
		}
		readInput.close();
	}
}
