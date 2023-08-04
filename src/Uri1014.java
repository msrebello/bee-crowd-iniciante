import java.io.IOException;
import java.util.Locale;
import java.util.Scanner;

public class Uri1014 {

	public static void main(String[] args) throws IOException {

		Locale.setDefault(Locale.US);
		Scanner scan = new Scanner(System.in);

		int X = scan.nextInt(); // distance (km)
		double Y = scan.nextDouble(); // total fuel (liters)

		consumptionCalculate(X, Y);

		scan.close();
	}

	private static void consumptionCalculate(int x, double y) {
		double consumption = x / y;
		System.out.println(String.format("%.3f", consumption) + " km/l");

	}

}
