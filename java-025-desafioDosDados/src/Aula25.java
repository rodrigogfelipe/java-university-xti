import java.util.Random;
import java.util.Scanner;

public class Aula25 {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		System.out.println("===========DESAFIO=============================");
		System.out.println("Qual é o palpite ?");
		int palpite = sc.nextInt();

		Random random = new Random();
		int dado = random.nextInt(6);

		if (palpite > 6) {
			System.out.println("Palpite invalido...0 ate 5");

		} else if (palpite == dado) {
			System.out.println("Palpite=" + palpite + " Dado= " + dado + " Acertou");

		} else {
			System.out.println("Palpite=" + palpite + " Dado= " + dado + " Errou");
		}

		sc.close();

	}

}
