package practice;

import java.util.Scanner;

public class ExSumMultiply {
	public static void main(String[] args) {
		System.out.print("3자리수 정수 입력(100~999)>>");
		Scanner scanner = new Scanner(System.in);
		int a = scanner.nextInt();
		
		int hun = a/100;        //100의자리 수
		int ten = (a%100)/10;   //10의자리 수 
		int one = (a%100)%10;   //1의 자리 수
		
		System.out.println("100의 자리와 10의 자리의 합은 "+(hun+ten));
		System.out.println("10의 자리와 1의 자리의 곱은 "+(ten*one));
		
		scanner.close();
	}
}
