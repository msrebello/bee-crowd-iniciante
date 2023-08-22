import java.io.IOException;
import java.util.Scanner;

public class Uri1074 {
	public static void main(String[] args) throws IOException {

		Scanner sc = new Scanner(System.in);

		int N = sc.nextInt();
		int[] valor = new int[N];
		for (int i = 0; i < valor.length; i++) {
			
			valor[i] = sc.nextInt();		
		}
		
		for (int i = 0; i < valor.length; i++) {
			if (valor[i] == 0)
				System.out.println("NULL");
			
			else if (valor[i] % 2 == 0) {
				if (valor[i] > 0)
					System.out.println("EVEN POSITIVE");
				else
					System.out.println("EVEN NEGATIVE");
			}
			else {
				if (valor[i] > 0)
					System.out.println("ODD POSITIVE");
				else
					System.out.println("ODD NEGATIVE");
			}
		}

		sc.close();
	}
}