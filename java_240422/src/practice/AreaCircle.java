package practice;

import java.util.Scanner;

public class AreaCircle {
	public static void main(String[] args) {
		System.out.print("반지름을 입력하세요>>");
//		입력받기 위해서 Scanner 객체 생성		
		Scanner circle = new Scanner(System.in);
//		반지름을 정수로 입력 받음
		int radius = circle.nextInt();
//		원의 면적 공식
		double circleArea = 3.14*radius*radius;
				
		System.out.println("원의 면적은"+circleArea+"입니다.");
		
		circle.close();
		
	}
}
