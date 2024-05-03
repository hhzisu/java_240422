package practice03;

import java.util.Scanner;

public class BreakExample {
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		System.out.println("exit를 입력하면 종료합니다.");

//		무한반복 : 반복횟수는 알 수 없음(exit가 나오면 break)
		while (true) {
			System.out.print(">>");
			String text = scanner.next();
//		입력받은 문자열이 exit면 빠져나옴
			if (text.equals("exit")) {
				break;
			}
		}
		System.out.println("종료합니다...");
		scanner.close();
	}
}
