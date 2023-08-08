import java.io.IOException;
import java.util.Locale;
import java.util.Scanner;

public class Uri1043 {

	public static void main(String[] args) throws IOException {

		Locale.setDefault(Locale.US);
		Scanner scan = new Scanner(System.in);

		float A = scan.nextFloat(), B = scan.nextFloat(), C = scan.nextFloat();

		if (A < B + C && B < A + C && C < A + B) {
			triangulo(A, B, C);
		} else {
			trapezio(A, B, C);

		}

		scan.close();
	}

	private static void trapezio(float a, float b, float c) {

		float area = (a + b) * c / 2;
		System.out.println("Area = " + String.format("%.1f", area));
	}

	private static void triangulo(float a, float b, float c) {

		float perimetro = a + b + c;
		System.out.println("Perimetro = " + String.format("%.1f", perimetro));

	}

}
