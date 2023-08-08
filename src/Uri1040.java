import java.io.IOException;
import java.util.Locale;
import java.util.Scanner;

public class Uri1040 {

	public static void main(String[] args) throws IOException {

		Locale.setDefault(Locale.US);
		Scanner scan = new Scanner(System.in);

		// Item
		float N1 = scan.nextFloat(), N2 = scan.nextFloat(), N3 = scan.nextFloat(), N4 = scan.nextFloat();

		float med = media(N1, N2, N3, N4);

		System.out.println("Media: " + String.format("%.1f", med));

		if (med < 5) {
			System.out.println("Aluno reprovado.");
		}

		else if (med <= 6.9) {
			System.out.println("Aluno em exame.");
			float notaExame = scan.nextFloat();
			System.out.println("Nota do exame: " + notaExame);
			float mediaFinal = (notaExame + med) / 2;
			
			if (mediaFinal <= 4.9) {
				System.out.println("Aluno reprovado.");
			}
			else {
				System.out.println("Aluno aprovado.");
			}
			
			System.out.println("Media final: " + String.format("%.1f", mediaFinal));
		}

		else {
			System.out.println("Aluno aprovado.");
		}
		
		scan.close();
	}

	private static float media(float n1, float n2, float n3, float n4) {

		return (2 * n1 + 3 * n2 + 4 * n3 + 1 * n4) / 10;
	}

}
