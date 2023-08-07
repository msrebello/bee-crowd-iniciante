import java.io.IOException;
import java.util.Locale;
import java.util.Scanner;

public class Uri1021 {

	public static void main(String[] args) throws IOException {

		Locale.setDefault(Locale.US);
		Scanner scan = new Scanner(System.in);

		double value = scan.nextDouble();

		banknotes(value);

		scan.close();
	}

	private static void banknotes(double value) {
		
		int bk100, bk50, bk20, bk10, bk5, bk2;
		double rest = 0;
		
		bk100 = (int) (value / 100);
			rest = value % 100;
		bk50 = (int) (rest / 50);
			rest = rest % 50;
		bk20 = (int) (rest / 20);
			rest = rest % 20;
		bk10 = (int) (rest / 10);
			rest = rest % 10;
		bk5 = (int) (rest / 5);
			rest = rest % 5;
		bk2 = (int) (rest / 2);
			rest = rest % 2;

		System.out.println("NOTAS:");
		System.out.println(bk100 + " nota(s) de R$ 100.00");
		System.out.println(bk50 + " nota(s) de R$ 50.00");
		System.out.println(bk20 + " nota(s) de R$ 20.00");
		System.out.println(bk10 + " nota(s) de R$ 10.00");
		System.out.println(bk5 + " nota(s) de R$ 5.00");
		System.out.println(bk2 + " nota(s) de R$ 2.00");

		coins(rest);
	}

	private static void coins(double rest) {
		
		int c01, c05, c025, c010, c005, c001;

		c01 = (int) (rest / 1);
		c05 = (int) (rest % 1 / 0.5);
		c025 = (int) (rest % 1 % 0.5 / 0.25);
		c010 = (int) (rest % 1 % 0.5 % 0.25 / 0.1);
		c005 = (int) (rest % 1 % 0.5 % 0.25 % 0.1 / 0.05);
		c001 = (int) (rest % 1 % 0.5 % 0.25 % 0.1 % 0.05 / 0.01);

		System.out.println("MOEDAS:");
		System.out.println(c01 + " moeda(s) de R$ 1.00");
		System.out.println(c05 + " moeda(s) de R$ 0.50");
		System.out.println(c025 + " moeda(s) de R$ 0.25");
		System.out.println(c010 + " moeda(s) de R$ 0.10");
		System.out.println(c005 + " moeda(s) de R$ 0.05");
		System.out.println(c001 + " moeda(s) de R$ 0.01");
	}
}
