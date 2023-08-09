import java.io.IOException;
import java.util.Locale;
import java.util.Scanner;

public class Uri1045 {

	public static void main(String[] args) throws IOException {

		Locale.setDefault(Locale.US);
		Scanner scan = new Scanner(System.in);

		// Entrada de dados
		float A = scan.nextFloat(), B = scan.nextFloat(), C = scan.nextFloat();

		// Verifica se A eh maior
		float aux;

		if (B > A) {
			aux = A;
			A = B;
			B = aux;
		}
		if (C > A) {
			aux = A;
			A = C;
			C = aux;
		}
		
		// Classifica os triangulos
		triangulo(A, B, C);

		scan.close();
	}

	private static void triangulo(float a, float b, float c) {

		if (a >= b + c) {
			System.out.println("NAO FORMA TRIANGULO");
		}

		else {
			if (Math.pow(a, 2) == Math.pow(b, 2) + Math.pow(c, 2)) {
				System.out.println("TRIANGULO RETANGULO");
			}

			if (Math.pow(a, 2) > Math.pow(b, 2) + Math.pow(c, 2)) {
				System.out.println("TRIANGULO OBTUSANGULO");
			}

			if (Math.pow(a, 2) < Math.pow(b, 2) + Math.pow(c, 2)) {
				System.out.println("TRIANGULO ACUTANGULO");
			}

			if (a == b && b == c) {
				System.out.println("TRIANGULO EQUILATERO");
			}

			if ((a == b && a != c) || (a == c && a != b) || (b == c && b != a)) {
				System.out.println("TRIANGULO ISOSCELES");
			}
		}

	}

}
