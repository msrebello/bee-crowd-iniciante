import java.io.IOException;
import java.util.Locale;
import java.util.Scanner;

public class Uri1036 {

	public static void main(String[] args) throws IOException {

		Locale.setDefault(Locale.US);
		Scanner scan = new Scanner(System.in);

		double A = scan.nextDouble(), B = scan.nextDouble(), C = scan.nextDouble();

		bhaskara(delta(A, B, C), A, B, C);

		scan.close();
	}
	
	private static double delta(double a, double b, double c) {
		return Math.pow(b, 2) - (4 * a * c);
	}

	private static void bhaskara(double delta, double a, double b, double c) {

		if (delta < 0 || a == 0) {
			System.out.println("Impossivel calcular");
		} 
		else {
			double x1 = (-b + Math.sqrt(delta)) / (2 * a);
			double x2 = (-b - Math.sqrt(delta)) / (2 * a);

			System.out.println("R1 = " + String.format("%.5f", x1));
			System.out.println("R2 = " + String.format("%.5f", x2));

		}

	}
}
