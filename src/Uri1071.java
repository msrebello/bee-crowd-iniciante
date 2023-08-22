import java.io.IOException;
import java.time.Duration;
import java.time.LocalDateTime;
import java.time.LocalTime;
import java.time.Month;
import java.time.format.DateTimeFormatter;
import java.util.InputMismatchException;
import java.util.Locale;
import java.util.Scanner;

public class Uri1071 {
	public static void main(String[] args) throws IOException {

		Scanner sc = new Scanner(System.in);

		int N = sc.nextInt();
		int out = 0;
		int in = 0;
		for (int i = 0; i < N; i++) {
			int X = sc.nextInt();
			
			if (X < 10 || X > 20)
				out++;
			else 
				in++;		
		}
		
		System.out.println(in + " in");
		System.out.println(out + " out");
		sc.close();
	}
}
