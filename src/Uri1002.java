import java.io.IOException;
import java.util.Scanner;

public class Uri1002 {

	public static final double PI = 3.14159;

	public static void main(String[] args) throws IOException {

		Scanner scan = new Scanner(System.in);

		double radios = scan.nextDouble();
		double a = area(radios);

		System.out.println("A=" + String.format("%.4f", a));

		scan.close();
	}

	private static double area(double radios) {
		return PI * Math.pow(radios, 2);
	}

}
