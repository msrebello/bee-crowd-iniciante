import java.io.IOException;
import java.util.Locale;
import java.util.Scanner;

public class Uri1013 {

	public static void main(String[] args) throws IOException {

		Locale.setDefault(Locale.US);
		Scanner scan = new Scanner(System.in);

		int A = scan.nextInt(), B = scan.nextInt(), C = scan.nextInt();

		max(A, B, C);

		scan.close();
	}

	private static void max(int A, int B, int C) {
		// TODO Auto-generated method stub
		int maxAB = (A + B + Math.abs(A - B)) / 2;
			maxAB = (maxAB + C + Math.abs(maxAB - C)) / 2;
			
			System.out.println(maxAB + " eh o maior");

	}

}
