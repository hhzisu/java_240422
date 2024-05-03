package practice03;

import java.util.Scanner;

public class ArithmeticOperator {
	public static void main(String[] args) {
		System.out.print("정수를 입력하세요:");
		Scanner scanner = new Scanner(System.in);
		int time = scanner.nextInt();
		int hour, minute, second;
		hour = time/3600; 
		minute = (time/60)%60; 
		second= time%60; 
		System.out.println(time+"초는 "+hour+"시간, "+minute+"분 ,"+second+"초입니다.");
		scanner.close();
	}
}
