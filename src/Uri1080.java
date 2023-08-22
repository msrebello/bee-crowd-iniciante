import java.io.IOException;
import java.util.Scanner;

public class Uri1080 {
	public static void main(String[] args) throws IOException {

		Scanner sc = new Scanner(System.in);
		int maior = 0;	
		int posicaomaior = 0;
		for (int i = 1; i <= 100; i++) {
			
			int a = sc.nextInt();
			if (a > maior) {
				maior = a;
				posicaomaior = i;
			}
		}

		System.out.println(maior);
		System.out.println(posicaomaior);
		sc.close();
	}
}
