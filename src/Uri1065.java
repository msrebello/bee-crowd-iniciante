import java.io.IOException;
import java.time.Duration;
import java.time.LocalDateTime;
import java.time.LocalTime;
import java.time.Month;
import java.time.format.DateTimeFormatter;
import java.util.InputMismatchException;
import java.util.Locale;
import java.util.Scanner;

public class Uri1065 {
	public static void main(String[] args) throws IOException {

		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);

		int cont = 0;
		for (int i = 0; i < 5; i++) {
			int valor = sc.nextInt();

			if (valor % 2 == 0) {
				cont++;
			}
		}
		System.out.println(cont + " valores pares");

		sc.close();
	}
}
