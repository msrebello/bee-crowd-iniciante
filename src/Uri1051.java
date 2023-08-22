import java.io.IOException;
import java.util.Locale;
import java.util.Scanner;

public class Uri1051 {
	public static void main(String[] args) throws IOException {

		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);

		double salario = sc.nextDouble();

		calculoIR(salario);

		sc.close();
	}

	private static void calculoIR(double valor) {
		double imposto = 0.0;

		if (valor <= 2000.00)
			System.out.println("Isento");

		else {
			if (valor <= 3000.00)
				imposto = (valor - 2000.0) * 0.08;
			
			else if (valor <= 4500.00)
				imposto = (valor - 3000.0) * 0.18 + (valor + 1000.0 - valor) * 0.08;
			
			else
				imposto = (valor - 4500.0) * 0.28 + (valor + 1500.0 - valor) * 0.18 + (valor + 1000.0 - valor) * 0.08;

			System.out.println("R$ " + String.format("%.2f", imposto));
		}
	}
}
