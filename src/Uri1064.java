import java.io.IOException;
import java.time.Duration;
import java.time.LocalDateTime;
import java.time.LocalTime;
import java.time.Month;
import java.time.format.DateTimeFormatter;
import java.util.InputMismatchException;
import java.util.Locale;
import java.util.Scanner;

public class Uri1064 {
	public static void main(String[] args) throws IOException, InputMismatchException {

		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);

		int cont = 0;
		double soma = 0;
		for (int i = 0; i < 6; i++) {
			double valor = sc.nextDouble();
			
			if (valor > 0) {
				cont++;
				soma+= valor;
			}
		}
		double media = soma / cont;
		System.out.println(cont + " valores positivos");
		System.out.println(String.format("%.1f", media));
		sc.close();
	}
}
