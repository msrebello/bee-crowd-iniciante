import java.io.IOException;
import java.util.Locale;
import java.util.Scanner;

public class Uri1016 {

	public static void main(String[] args) throws IOException {

		Locale.setDefault(Locale.US);
		Scanner scan = new Scanner(System.in);

		int time = scan.nextInt();
		int averageSpeed = scan.nextInt();
		int ds = distance(time, averageSpeed);
		calculateLiters(ds);

		scan.close();
	}

	private static void calculateLiters(int ds) {
		double liters = ds / 12.0;
		System.out.println(String.format("%.3f", liters));
	}

	private static int distance(int time, int avs) {
		return avs * time;
	}

}
