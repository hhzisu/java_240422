package practice;

import java.util.Scanner;

public class ExArea {
	public static void main(String[] args) {
		System.out.print("정수를 입력하시오>>");
		Scanner scanner = new Scanner(System.in);
		int a = scanner.nextInt();
		int b = scanner.nextInt();
		int c = scanner.nextInt();
		
		double triangle = a*b/2;
		double trapezium = (a+b)*c/2;
		
		if (c==0) {
			System.out.println("삼각형의 넓이는 "+triangle);
		} else {
			System.out.println("사다리꼴의 넓이는 "+trapezium);
		}
		scanner.close();
	}
}
