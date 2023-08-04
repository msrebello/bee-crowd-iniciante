import java.io.IOException;
import java.util.Locale;
import java.util.Scanner;

public class Uri1012 {

	public static void main(String[] args) throws IOException {

		Locale.setDefault(Locale.US);
		Scanner scan = new Scanner(System.in);

		double A = scan.nextDouble(), B = scan.nextDouble(), C = scan.nextDouble();

		// Areas
		double triangle = triangleArea(A, C);
		double circle = circleArea(C);
		double trapeze = trapezeArea(A, B, C);
		double square = squareArea(B);
		double retangle = retangleArea(A, B);

		System.out.println("TRIANGULO: " + String.format("%.3f", triangle));
		System.out.println("CIRCULO: " + String.format("%.3f", circle));
		System.out.println("TRAPEZIO: " + String.format("%.3f", trapeze));
		System.out.println("QUADRADO: " + String.format("%.3f", square));
		System.out.println("RETANGULO: " + String.format("%.3f", retangle));

		scan.close();
	}

	private static double retangleArea(double a, double b) {
		return a * b;
	}

	private static double squareArea(double b) {
		return Math.pow(b, 2);
	}

	private static double trapezeArea(double a, double b, double c) {
		return (a + b) * c / 2;
	}

	private static double circleArea(double c) {
		double pi = 3.14159;
		return pi * Math.pow(c, 2);
	}

	private static double triangleArea(double a, double c) {
		return a * c / 2;
	}

}
