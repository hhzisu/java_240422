package practice03;

import java.util.Scanner;

public class ThreeSixNine2 {
	public static void main(String[] args) {
//		count : 3, 6, 9 갯수
//		num : 입력받는 정수
//		ten : 10의 자리
//		one : 1의 자리
		int count=0, num, ten, one;
		
		Scanner scanner = new Scanner(System.in);
		System.out.print("10~99까지의 정수를 입력하세요>>");
		num = scanner.nextInt();
		ten = num/10;
		one = num%10;
	
//		3, 6, 9일때
		if(ten%3==0) {
			count++; //카운트 증가
		}
//		3, 6, 9일때
		if(one%3==0 && one!=0) {
			count++; //카운트 증가
		}
		if (count ==2) {
			System.out.println("박수짝짝");
		}else if (count==1) {
			System.out.println("박수짝");
		}else {
			System.out.println("박수없음");
		}
		scanner.close();
	}
}
