import java.io.IOException;
import java.util.Scanner;

public class Uri1003 {

	public static void main(String[] args) throws IOException {

		Scanner scan = new Scanner(System.in);

		int A = scan.nextInt(), B = scan.nextInt();

		int SOMA = A + B;

		System.out.println("SOMA = " + SOMA);

		scan.close();
	}

}
