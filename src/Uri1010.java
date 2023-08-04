import java.io.IOException;
import java.util.Locale;
import java.util.Scanner;

public class Uri1010 {

	public static void main(String[] args) throws IOException {

		Locale.setDefault(Locale.US);
		Scanner scan = new Scanner(System.in);

		// Piece 1
		int cod1 = scan.nextInt();
		int number1 = scan.nextInt();
		double unitaryValue1 = scan.nextDouble();

		// Piece 2
		int cod2 = scan.nextInt();
		int number2 = scan.nextInt();
		double unitaryValue2 = scan.nextDouble();

		double tp = totalPrice(number1, unitaryValue1, number2, unitaryValue2);
		System.out.println("VALOR A PAGAR: R$ " + String.format("%.2f", tp));

		scan.close();
	}

	private static double totalPrice(int n1, double uv1, int n2, double uv2) {
		return n1 * uv1 + n2 * uv2;

	}

}
