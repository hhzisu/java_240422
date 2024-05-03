package practice02;

import java.util.Scanner;

public class SeasonExSwitch {
	public static void main(String[] args) {
		System.out.print("달을 입력하세요(1~12)>>");
		Scanner scanner = new Scanner(System.in);
		int month = scanner.nextInt();
		String season = "";
		
		switch (month) {
		case 3: case 4: case 5:
			season = "봄";
			break;
		case 6, 7, 8:
			season = "여름";
		break;
		case 9, 10, 11:
			season = "가을";
		break;
		case 12, 1, 2:
			season = "겨울";
		break;

		default:
			System.out.println("잘못 입력");
			break;
		}
		System.out.println(season);
		scanner.close();
	}
}