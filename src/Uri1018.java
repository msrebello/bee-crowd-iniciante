import java.io.IOException;
import java.util.Locale;
import java.util.Scanner;

public class Uri1018 {

	public static void main(String[] args) throws IOException {

		Locale.setDefault(Locale.US);
		Scanner scan = new Scanner(System.in);

		int value = scan.nextInt();

		banknotes(value);

		scan.close();
	}

	private static void banknotes(int value) {
		
		int bk100 = value / 100;
		int bk50 =  value % 100 / 50;
		int bk20 =  value % 100 % 50 / 20;
		int bk10 =  value % 100 % 50 % 20 / 10;
		int bk05 =  value % 100 % 50 % 20 % 10 / 5;
		int bk02 =  value % 100 % 50 % 20 % 10 % 5 / 2;
		int bk01 =  value % 100 % 50 % 20 % 10 % 5 % 2 /1;
		
		System.out.println(value);
		System.out.println(bk100 +" nota(s) de R$ 100,00");
		System.out.println(bk50 +" nota(s) de R$ 50,00");
		System.out.println(bk20 +" nota(s) de R$ 20,00");
		System.out.println(bk10 +" nota(s) de R$ 10,00");
		System.out.println(bk05 +" nota(s) de R$ 5,00");
		System.out.println(bk02 +" nota(s) de R$ 2,00");
		System.out.println(bk01 +" nota(s) de R$ 1,00");
		
	}
}
