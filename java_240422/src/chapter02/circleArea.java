package chapter02;

public class circleArea {
	public static void main(String[] args) {
		double pi = 3.14;
		int radius = 10;
		
//		원의 넓이 공식
//		숫자 연산시 결과는 큰 타입을 따라감 (정수 * 실수 = 실수 int<double)
		double circleArea = pi*radius*radius;
		System.out.println(circleArea);
	}
}
