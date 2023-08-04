import java.io.IOException;
import java.util.Scanner;

public class Uri1007 {

	public static void main(String[] args) throws IOException {

		Scanner scan = new Scanner(System.in);

		int A = scan.nextInt();
		int B = scan.nextInt();
		int C = scan.nextInt();
		int D = scan.nextInt();

		int d = dif(A, B, C, D);

		System.out.println("DIFERENCA = " + d);

		scan.close();
	}

	private static int dif(int a, int b, int c, int d) {
		return a * b - c * d;

	}

}
