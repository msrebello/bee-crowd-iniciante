import java.io.IOException;
import java.util.Locale;
import java.util.Scanner;

public class Uri1060 {
	public static void main(String[] args) throws IOException {

		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		
		int cont = 0;
		
		for (int i = 0; i < 6; i++) {
			double valor = sc.nextDouble();
			
			if (valor > 0) {
				cont++;
			}
		}
		
		System.out.println(cont + " valores positivos");
		
		sc.close();
	}
}
