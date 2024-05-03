package practice02;

import java.util.Scanner;

public class ExRectangle {
	public static void main(String[] args) {
		System.out.print("가로, 세로 길이를 입력하세요>>");
		Scanner square = new Scanner(System.in);
		
		int width = square.nextInt();
		int height = square.nextInt();
		int rectangleArea = width*height;
		
		System.out.println("사각형의 면적은 "+rectangleArea+" 입니다.");
		square.close();
	}
}
