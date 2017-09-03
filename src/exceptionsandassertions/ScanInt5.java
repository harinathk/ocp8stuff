package exceptionsandassertions;

import java.util.InputMismatchException;
import java.util.NoSuchElementException;
import java.util.Scanner;

public class ScanInt5 {

	public static void main(String[] args) {
		String integerStr = "ten";
		System.out.println("The string to scan integer from it is: " + integerStr);
		Scanner consoleScanner = new Scanner(integerStr);

		try {
			System.out.println("The integer value scanned from string is: " + consoleScanner.nextInt());
		} catch (InputMismatchException | IllegalStateException ime) {
			System.out.println("Multi cache ");
		} catch (NoSuchElementException nsee) {
			System.out.println("Error: Cannot scan an integer from the given string");
		} 
	}
}