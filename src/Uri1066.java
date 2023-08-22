import java.io.IOException;
import java.time.Duration;
import java.time.LocalDateTime;
import java.time.LocalTime;
import java.time.Month;
import java.time.format.DateTimeFormatter;
import java.util.InputMismatchException;
import java.util.Locale;
import java.util.Scanner;

public class Uri1066 {
	public static void main(String[] args) throws IOException {

		Scanner sc = new Scanner(System.in);

		int contpar = 0;
		int contimpar = 0;
		int positivo = 0;
		int negativo = 0;
		for (int i = 0; i < 5; i++) {
			int valor = sc.nextInt();

			if (valor % 2 == 0) {
				contpar++;
			}

			if (valor % 2 != 0) {
				contimpar++;
			}
			
			if (valor > 0) {
				positivo++;
			}
			
			if (valor < 0) {
				negativo++;
			}
		}
		
		System.out.println(contpar + " valor(es) par(es)");
		System.out.println(contimpar + " valor(es) impar(es)");
		System.out.println(positivo + " valor(es) positivo(s)");
		System.out.println(negativo + " valor(es) negativo(s)");

		sc.close();
	}
}
