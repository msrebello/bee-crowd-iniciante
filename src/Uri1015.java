import java.io.IOException;
import java.util.Locale;
import java.util.Scanner;

public class Uri1015 {

	public static void main(String[] args) throws IOException {

		Locale.setDefault(Locale.US);
		Scanner scan = new Scanner(System.in);
		
		// Coordinates
		double x1 = scan.nextDouble();
		double y1 = scan.nextDouble();
		double x2 = scan.nextDouble();
		double y2 = scan.nextDouble();

		distance(x1, y1, x2, y2);

		scan.close();
	}

	private static void distance(double x1, double y1, double x2, double y2) {
		// Distance between two points
		double dis = Math.sqrt(Math.pow((x2 - x1), 2) + Math.pow((y2 - y1), 2));
		System.out.println(String.format("%.4f", dis));
	}

}
