import java.io.IOException;
import java.util.Locale;
import java.util.Scanner;

public class Uri1048 {

	public static void main(String[] args) throws IOException {

		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);

		double salarioAtual = sc.nextDouble();
		double reajuste = 0.0;

		if (salarioAtual <= 400.00) {
			reajuste = 0.15;
		}

		else if (salarioAtual <= 800.00) {
			reajuste = 0.12;
		}

		else if (salarioAtual <= 1200.00) {
			reajuste = 0.10;
		}

		else if (salarioAtual <= 2000.00) {
			reajuste = 0.07;
		}

		else {
			reajuste = 0.04;
		}

		double novoSalario = salarioAtual + salarioAtual * reajuste;
		double ganho = novoSalario - salarioAtual;
		int percentualReajuste = (int) (reajuste * 100);

		System.out.println("Novo salario: " + String.format("%.2f", novoSalario));
		System.out.println("Reajuste ganho: " + String.format("%.2f", ganho));
		System.out.println("Em percentual: " + percentualReajuste + " %");

		sc.close();
	}

}
