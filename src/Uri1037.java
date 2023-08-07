import java.io.IOException;
import java.util.Locale;
import java.util.Scanner;

public class Uri1037 {

	public static void main(String[] args) throws IOException {

		Locale.setDefault(Locale.US);
		Scanner scan = new Scanner(System.in);

		double X = scan.nextDouble();

		if (X < 0 || X > 100) {
			System.out.println("Fora de intervalo");
		}
		
		else if (X <= 25) {
			System.out.println("Intervalo [0,25]");
		}
		
		else if (X <= 50) {
			System.out.println("Intervalo (25,50]");
		}
		
		else if (X <= 75) {
			System.out.println("Intervalo (50,75]");
		}
		else {
			System.out.println("Intervalo (75,100]");
		}
		

		scan.close();
	}

}
