import java.io.IOException;
import java.util.Locale;
import java.util.Scanner;

public class Uri1044 {

	public static void main(String[] args) throws IOException {

		Locale.setDefault(Locale.US);
		Scanner scan = new Scanner(System.in);

		int A = scan.nextInt(), B = scan.nextInt();

		if (A % B == 0 || B % A == 0) {
			System.out.println("Sao Multiplos");
		} else {
			System.out.println("Nao sao Multiplos");

		}

		scan.close();
	}

}