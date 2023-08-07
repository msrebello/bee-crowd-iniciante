import java.io.IOException;
import java.util.Locale;
import java.util.Scanner;

public class Uri1020 {

	public static void main(String[] args) throws IOException {

		Locale.setDefault(Locale.US);
		Scanner scan = new Scanner(System.in);

		int age = scan.nextInt(); // Days

		conversion(age);

		scan.close();
	}

	private static void conversion(int age) {
		
		int years = age / 365;
		int months = age % 365 / 30;
		int days = age % 365 % 30 / 1;
		
		System.out.println(years + " ano(s)");
		System.out.println(months + " mes(es)");
		System.out.println(days + " dia(s)");
	}
}
