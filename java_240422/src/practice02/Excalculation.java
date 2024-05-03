package practice02;

import java.util.Scanner;

//class -> 여러개 사용해도 무관
//public class : 자바파일 안에 두 개 이상 존재 시 오류
//public class Caa{}
//1. JVM이 수 많은 class에서 public class를 찾아감

public class Excalculation {
//	method -> 여러개 사용해도 무관
	public static void aaa(){}
	public static void bbb(){}
//2. JVM이 수 많은 method에서 main 메소드를 찾아감
	public static void main(String[] args) {
		System.out.print("2개의 실수 입력>>");
		Scanner scanner = new Scanner(System.in);
		double a = scanner.nextDouble();
		double b = scanner.nextDouble();
		System.out.println("두 수의 덧셈은 " + (a+b));
		System.out.println("두 수의 뺄셈은 " + (a-b));
		System.out.println("두 수의 곱셈은 " + (a*b));
		System.out.println("두 수의 나눗셈은 " + (a/b));
		
		scanner.close();
		
	}
}
