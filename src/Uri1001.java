import java.io.IOException;
import java.util.Scanner;

public class Uri1001 {

	public static void main(String[] args) throws IOException {

		Scanner scan = new Scanner(System.in);

		int A = scan.nextInt();
		int B = scan.nextInt();
		
		int X = A + B;
		
		System.out.println("X = " + X);
		
		scan.close();
	}

}
