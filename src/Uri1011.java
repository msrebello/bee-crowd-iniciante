import java.io.IOException;
import java.util.Locale;
import java.util.Scanner;

public class Uri1011 {

	private static final double PI = 3.14159;
	public static void main(String[] args) throws IOException {

		Locale.setDefault(Locale.US);
		Scanner scan = new Scanner(System.in);

		double radios = scan.nextDouble();

		double vol = volume(radios);
		System.out.println("VOLUME = " + String.format("%.3f", vol));

		scan.close();
	}

	private static double volume(double rad) {	
		return (4.0 / 3) * PI * Math.pow(rad, 3);

	}

}
