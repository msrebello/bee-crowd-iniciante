import java.io.IOException;
import java.util.Locale;
import java.util.Scanner;

public class Uri1041 {

	public static void main(String[] args) throws IOException {

		Locale.setDefault(Locale.US);
		Scanner scan = new Scanner(System.in);

		// Coordenadas
		float X = scan.nextFloat(), Y = scan.nextFloat();
		
		planoCartesiano(X, Y);
		
		scan.close();
	}

	private static void planoCartesiano(float x, float y) {
		
		if (x == 0 && y == 0) {
			System.out.println("Origem");
		} 
		
		else if (x == 0) {
			System.out.println("Eixo Y");
		}
		
		else if (y == 0) {
			System.out.println("Eixo X");
		}
		
		else if (x > 0 && y > 0) {
			System.out.println("Q1");
		}
		
		else if (x < 0 && y > 0) {
			System.out.println("Q2");
		}
		
		else if (x < 0 && y < 0) {
			System.out.println("Q3");
		}
		
		else {
			System.out.println("Q4");
		}
		
	}

}
