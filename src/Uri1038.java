import java.io.IOException;
import java.util.Locale;
import java.util.Scanner;

public class Uri1038 {

	public static void main(String[] args) throws IOException {

		Locale.setDefault(Locale.US);
		Scanner scan = new Scanner(System.in);

		// Item
		int cod = scan.nextInt(), quantity = scan.nextInt();

		total(cod, quantity);
		scan.close();
	}

	private static void total(int cod, int quantity) {
		double price = 0.0;
		switch (cod) {
		case 1:
			price = quantity * 4.00;
			break;
		case 2:
			price = quantity * 4.50;
			break;

		case 3:
			price = quantity * 5.00;
			break;

		case 4:
			price = quantity * 2.00;
			break;

		case 5:
			price = quantity * 1.50;
			break;
		}
		
		System.out.println("Total: R$ " + String.format("%.2f", price));

	}

}
