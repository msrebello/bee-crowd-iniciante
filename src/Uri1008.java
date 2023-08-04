import java.io.IOException;
import java.util.Locale;
import java.util.Scanner;

public class Uri1008 {

	public static void main(String[] args) throws IOException {

		Locale.setDefault(Locale.US);
		Scanner scan = new Scanner(System.in);

		// Employee
		int cod = scan.nextInt();
		int hoursWorked = scan.nextInt();
		double valuePerHour = scan.nextDouble();

		double sal = salary(hoursWorked, valuePerHour);

		System.out.println("NUMBER = " + cod);
		System.out.println("SALARY = U$ " + String.format("%.2f", sal));

		scan.close();
	}

	private static double salary(double h, double v) {
		return h * v;

	}

}
