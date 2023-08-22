import java.io.IOException;
import java.time.Duration;
import java.time.LocalDateTime;
import java.time.LocalTime;
import java.time.Month;
import java.time.format.DateTimeFormatter;
import java.util.InputMismatchException;
import java.util.Scanner;

public class Uri1061 {
	public static void main(String[] args) throws IOException, InputMismatchException {

		
		Scanner sc = new Scanner(System.in);
		DateTimeFormatter formatter = DateTimeFormatter.ofPattern("HH : mm : ss");

		int diaInicio = Integer.parseInt(sc.nextLine().split(" ")[1]);

		LocalTime começo = LocalTime.parse(sc.nextLine(), formatter);
		LocalDateTime inicio = LocalDateTime.of(2023, Month.APRIL, diaInicio, começo.getHour(), começo.getMinute(), começo.getSecond());
		
		int diaFim = Integer.parseInt(sc.nextLine().split(" ")[1]);

		LocalTime termino = LocalTime.parse(sc.nextLine(), formatter);
		LocalDateTime fim = LocalDateTime.of(2023, Month.APRIL, diaFim, termino.getHour(), termino.getMinute(), termino.getSecond());
			
		int duracao = (int) Duration.between(inicio, fim).getSeconds();

		int dias = duracao / 86400;
		int horas = duracao % 86400 / 3600;
		int minutos = duracao % 86400 % 3600 / 60;
		int segundos = duracao % 86400 % 3600 % 60 / 1;

		System.out.println(dias + " dia(s)");
		System.out.println(horas + " hora(s)");
		System.out.println(minutos + " minuto(s)");
		System.out.println(segundos + " segundo(s)");

		sc.close();
	}
}
