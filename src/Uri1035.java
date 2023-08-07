import java.io.IOException;
import java.util.Locale;
import java.util.Scanner;

public class Uri1035 {

	public static void main(String[] args) throws IOException {

		Locale.setDefault(Locale.US);
		Scanner scan = new Scanner(System.in);

		int A = scan.nextInt(), B = scan.nextInt(), C = scan.nextInt(), D = scan.nextInt();
		
		output(A, B , C, D);

		scan.close();
	}

	private static void output(double A, double B, double C, double D) {
		if (B > C && D > A && (C + D) > (A + B) && C > 0 && D > 0 && A % 2 == 0) {
			System.out.println("Valores aceitos");
		}
		else {
			System.out.println("Valores nao aceitos");
		}
	}
}
