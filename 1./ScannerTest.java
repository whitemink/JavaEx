import java.util.Scanner;

public class ScannerTest {

	public static void main(String[] args) {

		Scanner scan = new Scanner(System.in);

		System.out.println("Hej, Vad heter du?");
		String name = scan.nextLine();


		System.out.println("Hejsan " + name);

	}

}