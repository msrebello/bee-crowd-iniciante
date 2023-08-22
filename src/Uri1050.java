import java.io.IOException;
import java.util.Scanner;

public class Uri1050 {
	public static void main(String[] args) throws IOException {

		Scanner sc = new Scanner(System.in);

		int DDD = sc.nextInt();

		verificacao(DDD);

		sc.close();
	}

	private static void verificacao(int number) {

		final int DDD_BRASILIA = 61;
		final int DDD_SALVADOR = 71;
		final int DDD_SP = 11;
		final int DDD_RJ = 21;
		final int DDD_JUIZFORA = 32;
		final int DDD_CAMPINAS = 19;
		final int DDD_VITORIA = 27;
		final int DDD_BH = 31;

		switch (number) {
		case DDD_BRASILIA:
			System.out.println("Brasilia");
			break;
		case DDD_SALVADOR:
			System.out.println("Salvador");
			break;
		case DDD_SP:
			System.out.println("Sao Paulo");
			break;
		case DDD_RJ:
			System.out.println("Rio de Janeiro");
			break;
		case DDD_JUIZFORA:
			System.out.println("Juiz de Fora");
			break;
		case DDD_CAMPINAS:
			System.out.println("Campinas");
			break;
		case DDD_VITORIA:
			System.out.println("Vitoria");
			break;
		case DDD_BH:
			System.out.println("Belo Horizonte");
			break;
		default:
			System.out.println("DDD nao cadastrado");
			break;
		}
	}

}
