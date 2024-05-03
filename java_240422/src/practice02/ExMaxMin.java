package practice02;

import java.util.Scanner;

public class ExMaxMin {
	public static void main(String[] args) {
		System.out.print("정수 3개 입력>>");
		Scanner scanner = new Scanner(System.in);
		int a = scanner.nextInt();
		int b = scanner.nextInt();
		int c = scanner.nextInt();
		
		if (a>b&&a>c) {
			System.out.println("최대값은 "+a);
		}else if (b>c&&b>a) {
			System.out.println("최대값은 "+b);
		}else {
			System.out.println("최대값은 "+c);
		}
		if (a<b&&a<c) {
			System.out.println("최소값은 "+a);
		}else if (b<c&&b<a) {
			System.out.println("최소값은 "+b);
		}else {
			System.out.println("최소값은 "+c);			
		}
		scanner.close();
	}
}
