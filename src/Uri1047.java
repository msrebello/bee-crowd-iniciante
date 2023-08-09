import java.io.IOException;
import java.util.Locale;
import java.util.Scanner;

public class Uri1047 {

	public static void main(String[] args) throws IOException {

		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);

		int horaInicial = sc.nextInt(), minutoInicial = sc.nextInt();
		int horaFinal = sc.nextInt(), minutoFinal = sc.nextInt();

		// Calcula a duracao do jogo
		duration(horaInicial, minutoInicial, horaFinal, minutoFinal);

		sc.close();
	}

	private static void duration(int HI, int MI, int HF, int MF) {

		int dHoras = 0;
		int dMinutos = 0;

		if (HI == HF && MI == MF) {
			dHoras = 24 - (HI - HF);
			dMinutos = MF - MI;
		}

		else if (MF >= MI) {

			if (HF == HI) {
				dHoras = HI - HF;
				dMinutos = MF - MI;
			}

			else if (HF > HI) {
				dHoras = HF - HI;
				dMinutos = MF - MI;
			}

			else {
				dHoras = 24 - (HI - HF);
				dMinutos = MF - MI;
			}
		}

		else {

			if (HF > HI) {
				dHoras = HF - (HI + 1);
				dMinutos = 60 - (MI - MF);
			}

			else if (HI >= HF) {
				dHoras = 24 - (HI - HF + 1);
				dMinutos = 60 - (MI - MF);
			}
		}

		System.out.println("O JOGO DUROU " + dHoras + " HORA(S) E " + dMinutos + " MINUTO(S)");
	}

}
