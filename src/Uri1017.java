import java.io.IOException;
import java.util.Locale;
import java.util.Scanner;

public class Uri1017 {

	public static void main(String[] args) throws IOException {

		Locale.setDefault(Locale.US);
		Scanner scan = new Scanner(System.in);

		int distance = scan.nextInt();

		timeInMinutes(distance);

		scan.close();
	}

	private static void timeInMinutes(int distance) {

		int minutes = distance * 2;
		System.out.println(minutes + " minutos");
	}
}
