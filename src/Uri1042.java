import java.io.IOException;
import java.util.Locale;
import java.util.Scanner;

public class Uri1042 {

	public static void main(String[] args) throws IOException {

		Locale.setDefault(Locale.US);
		Scanner scan = new Scanner(System.in);

		int a = scan.nextInt(), b = scan.nextInt(), c = scan.nextInt();
		
		crescente(a, b, c); // Mostra os valores em ordem crescente
		
		// Mostra os valores como foram lidos
		System.out.println(a);
		System.out.println(b);
		System.out.println(c);
		
		
		scan.close();
	}

	private static void crescente(int a, int b, int c) {
		
		int max, med, min;
		
		if (a > b && b > c) {
			max = a;
			med = b;
			min = c;
		}
		
		else if (a > c && c > b) {
			max = a;
			med = c;
			min = b;
		}
		
		else if (b > a && a > c) {
			max = b;
			med = a;
			min = c;
		}
		
		else if (b > c && c > a) {
			max = b;
			med = c;
			min = a;
		}
		
		else if (c > a && a > b) {
			max = c;
			med = a;
			min = b;
		}
		
		else {
			max = c;
			med = b;
			min = a;
		}
		
		System.out.println(min);
		System.out.println(med);
		System.out.println(max);
		System.out.println();
	}

}
