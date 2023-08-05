import java.io.IOException;
import java.util.Locale;
import java.util.Scanner;

public class Uri1019 {

	public static void main(String[] args) throws IOException {

		Locale.setDefault(Locale.US);
		Scanner scan = new Scanner(System.in);

		int duration = scan.nextInt(); // In seconds

		timeFormat(duration);

		scan.close();
	}

	private static void timeFormat(int duration) {
		
		int hours = duration / 3600;
		int minutes = duration % 3600 / 60;
		int seconds = duration % 3600 % 60 / 1;
		
		System.out.println(hours + ":" + minutes + ":" + seconds);
				
	}
}
