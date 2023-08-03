import java.io.IOException;
import java.util.Scanner;

public class Uri1004 {

	public static void main(String[] args) throws IOException {

		Scanner scan = new Scanner(System.in);

		int X = scan.nextInt(), Y = scan.nextInt();

		int PROD = X * Y;

		System.out.println("PROD = " + PROD);

		scan.close();
	}

}
