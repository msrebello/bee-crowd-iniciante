import java.io.IOException;
import java.util.Locale;
import java.util.Scanner;

public class Uri1006 {

	public static void main(String[] args) throws IOException {

		Locale.setDefault(Locale.US);
		Scanner scan = new Scanner(System.in);

		double A = scan.nextDouble(), B = scan.nextDouble(), C = scan.nextDouble();
		double m = media(A, B, C);

		System.out.println("MEDIA = " + String.format("%.1f", m));

		scan.close();
	}

	private static double media(double a, double b, double c) {
		return (2 * a + 3 * b + 5 * c) / 10;

	}

}
