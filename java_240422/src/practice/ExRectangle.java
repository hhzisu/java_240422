package practice;

import java.util.Scanner;

public class ExRectangle {
	public static void main(String[] args) {
		System.out.println(".출력");
		System.out.print("가로, 세로 길이를 입력하세요>>");
		Scanner square = new Scanner(System.in);
		
		int a = square.nextInt();
		int b = square.nextInt();
		int c = a*b;
		
		System.out.println("사각형의 면적은 "+c+"입니다.");
		square.close();
	}
}
