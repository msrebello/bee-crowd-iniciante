import java.io.IOException;
import java.util.Scanner;

public class Uri1049 {
	public static void main(String[] args) throws IOException {

		Scanner sc = new Scanner(System.in);

		String grupo = sc.nextLine(), classe = sc.nextLine(), tipoAlimentacao = sc.nextLine();

		if (grupo.equals("vertebrado")) {
			if (classe.equals("ave")) {
				if (tipoAlimentacao.equals("carnivoro"))
					System.out.println("aguia");

				else if (tipoAlimentacao.equals("onivoro"))
					System.out.println("pomba");
			} 
			else if (classe.equals("mamifero")) {
				if (tipoAlimentacao.equals("onivoro"))
					System.out.println("homem");

				else if (tipoAlimentacao.equals("herbivoro"))
					System.out.println("vaca");
			}
		} 
		else if (grupo.equals("invertebrado")) {
			if (classe.equals("inseto")) {
				if (tipoAlimentacao.equals("hematofago"))
					System.out.println("pulga");

				else if (tipoAlimentacao.equals("herbivoro"))
					System.out.println("lagarta");
			} 
			else if (classe.equals("anelideo")) {
				if (tipoAlimentacao.equals("hematofago"))
					System.out.println("sanguessuga");

				else if (tipoAlimentacao.equals("onivoro"))
					System.out.println("minhoca");
			}
		}

		sc.close();
	}

}
