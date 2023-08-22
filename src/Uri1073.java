import java.io.IOException;
import java.time.Duration;
import java.time.LocalDateTime;
import java.time.LocalTime;
import java.time.Month;
import java.time.format.DateTimeFormatter;
import java.util.InputMismatchException;
import java.util.Locale;
import java.util.Scanner;

public class Uri1073 {
	public static void main(String[] args) throws IOException {

		Scanner sc = new Scanner(System.in);

		int N = sc.nextInt();

		for (int i = 0 + 1; i <= N; i++) {
			
			if (i % 2 == 0)
				System.out.println(i + "^2 = " + (int) Math.pow(i, 2));	
		}

		sc.close();
	}
}
