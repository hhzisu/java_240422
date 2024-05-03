package practice03;

import java.util.Scanner;

public class ThreeSixNine {
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		System.out.print("10~99 사이의 정수를 입력하시오>>");
		int n = scanner.nextInt();
		int ten = n/10;
		int one = n%10;
//		if ((ten==3||ten==6||ten==9)&&(one==3||one==6||one==9)){
//			System.out.println("박수짝짝");
//		}else if (ten==3||ten==6||ten==9||one==3||one==6||one==9) {
//			System.out.println("박수짝");
//		}
		if (ten==3||ten==6||ten==9) {
			if (one==3||one==6||one==9) {
				System.out.println("박수짝짝");
			}else {
				System.out.println("박수짝");
			}
		}else if (one==3||one==6||one==9) {
			System.out.println("박수짝");
		}
	scanner.close();
	}
}
