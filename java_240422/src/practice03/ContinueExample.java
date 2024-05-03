package practice03;

import java.util.Scanner;

public class ContinueExample {
	public static void main(String[] args) {
		int n , sum=0;
		Scanner scanner = new Scanner(System.in);
		System.out.println("정수를 5개 입력하세요.");
		
		for (int i = 0; i < 5; i++) {
			n = scanner.nextInt();
			if (n<=0) {
				continue; //i++ 증감쪽으로 이동
			}else {
				sum += n;
			}
			/*
			if (n>0) { //양수일때
				sum += n;  //sum에 합계를 누적
			}
			*/
		}
		System.out.println("양수의 합은 "+sum);
	}
}
