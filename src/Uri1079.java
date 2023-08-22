import java.io.IOException;
import java.util.Locale;
import java.util.Scanner;

public class Uri1079 {
	public static void main(String[] args) throws IOException {

		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);

		int N = sc.nextInt();
		for (int i = 0; i < N; i++) {

			double a = sc.nextDouble();
			double b = sc.nextDouble();
			double c = sc.nextDouble();
			double media = (2 * a + 3 * b + 5 * c) / 10.0;
			System.out.println(String.format("%.1f", media));
		}

		sc.close();
	}
}
