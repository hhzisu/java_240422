package practice06;

import java.util.Random;
import java.util.Scanner;

public class GuessNumber {
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		int guess=0, numberToGuess;
		Random random = new Random();
		numberToGuess = random.nextInt(10)+1;
		while (numberToGuess!=guess) {
			System.out.print("추측한 숫자를 입력하세요: ");
			guess = scanner.nextInt();
			if (numberToGuess>guess) {
			System.out.println("추측한 숫자가 틀렸습니다.");
			System.out.println("추측한 숫자가 너무 작습니다.");
			}
			if (numberToGuess<guess) {
			System.out.println("추측한 숫자가 틀렸습니다.");
			System.out.println("추측한 숫자가 너무 큽니다.");
			}
		}
			System.out.println("맞추셨습니다.");
			scanner.close();
	}
}	
