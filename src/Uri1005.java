import java.io.IOException;
import java.util.Locale;
import java.util.Scanner;

public class Uri1005 {

	public static void main(String[] args) throws IOException {

		Locale.setDefault(Locale.US);
		Scanner scan = new Scanner(System.in);

		double A = scan.nextDouble(), B = scan.nextDouble();
		double m = media(A, B);

		System.out.println("MEDIA = " + String.format("%.5f", m));

		scan.close();
	}

	private static double media(double a, double b) {
		return (3.5 * a + 7.5 * b) / 11;

	}

}
