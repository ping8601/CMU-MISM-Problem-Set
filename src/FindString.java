import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

public class FindString {
	public static void main(String[] args) {
		int count = 0;
		int index = -1;
		String data = "";
		try {
			File input = new File("input.txt");
			Scanner myReader = new Scanner(input);	
			while (myReader.hasNextLine()) {
				data += myReader.nextLine();
			}
			System.out.print("Please enter a string: ");
			Scanner readInput = new Scanner(System.in);
			String str = readInput.nextLine();
			while (data.indexOf(str, index) > 0) {
				count += 1;
				index = data.indexOf(str, index) + 1;
			}
			myReader.close();
			readInput.close();
			System.out.print("There is/are " + count + " \"" + str + "\"" + " in input.txt.");
		} catch(FileNotFoundException e) {
			System.out.print("An error occured.");
		}
		
		
		
	}
}
