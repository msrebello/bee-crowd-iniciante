import java.io.IOException;
import java.time.Duration;
import java.time.LocalDateTime;
import java.time.LocalTime;
import java.time.Month;
import java.time.format.DateTimeFormatter;
import java.util.InputMismatchException;
import java.util.Locale;
import java.util.Scanner;

public class Uri1067 {
	public static void main(String[] args) throws IOException {

		Scanner sc = new Scanner(System.in);

		int X = sc.nextInt();
		for (int i = 1; i <= X; i++) {

			if (i % 2 != 0) {
				System.out.println(i);
			}
		}
		
		sc.close();
	}
}
