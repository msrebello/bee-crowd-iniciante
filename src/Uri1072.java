import java.io.IOException;
import java.time.Duration;
import java.time.LocalDateTime;
import java.time.LocalTime;
import java.time.Month;
import java.time.format.DateTimeFormatter;
import java.util.InputMismatchException;
import java.util.Locale;
import java.util.Scanner;

public class Uri1072 {
	public static void main(String[] args) throws IOException {

		Scanner sc = new Scanner(System.in);

		int X = sc.nextInt(), Y = sc.nextInt();
		int soma = 0;
		for (int i = Y + 1; i < X; i++) {
			
			if (i % 2 != 0) {
				soma += i;
			}		
		}
		
		System.out.println(soma);
		sc.close();
	}
}
