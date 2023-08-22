import java.io.IOException;
import java.util.Scanner;

public class Uri1070 {
	public static void main(String[] args) throws IOException {

		Scanner sc = new Scanner(System.in);

		int X = sc.nextInt();
		for (int i = 0; i < 6; i++) {
			
			if (X % 2 == 0) {
				X++;
			}
			System.out.println(X);
			X++;
		}

		sc.close();
	}
}