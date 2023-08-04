import java.io.IOException;
import java.util.Locale;
import java.util.Scanner;

public class Uri1009 {

	public static void main(String[] args) throws IOException {

		Locale.setDefault(Locale.US);
		Scanner scan = new Scanner(System.in);

		// Seller
		String name = scan.nextLine();
		double fixedSalary = scan.nextDouble();
		double salesAmount = scan.nextDouble();

		double ts = totalSalary(fixedSalary, salesAmount);
		System.out.println("TOTAL = R$ " + String.format("%.2f", ts)); 

		scan.close();
	}

	private static double totalSalary(double fs, double sa) {
		double commission = 0.15;
		return sa * commission + fs ;

	}

}
