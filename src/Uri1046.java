import java.io.IOException;
import java.util.Locale;
import java.util.Scanner;

public class Uri1046 {

	public static void main(String[] args) throws IOException {

		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);

		// Entrada de dados
		int inicio = sc.nextInt(), fim = sc.nextInt();

		// Calcula a duracao do jogo
		duration(inicio, fim);
		
		sc.close();
	}

	private static void duration(int inicio, int fim) {

		int d = 0;
		if (inicio >= fim) {
			d = 24 - (inicio - fim);
		} else {
			d = fim - inicio;

		}

		// Mostra a duracao
		System.out.println("O JOGO DUROU " + d + " HORA(S)");
	}

}
