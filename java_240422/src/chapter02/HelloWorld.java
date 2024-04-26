package chapter02;

/*
 * 작성일 : 2024-04-23
 * 작성자 : 하지수
 * 내용 : HelloWorld 클래스로 문자열 출력
 */

public class HelloWorld {
	public static void main(String[] args) {
		//String : 문자열 타입
		//message: 변수(명)
//		String message = "헬로 월드!"; < 이렇게 해도 됨
		String message; // 변수 선언
		message = "헬로 월드!";//변수값 할당(변수 초기화)
		System.out.println(message);
		message="웰컴 투 헬!";
		System.out.println(message);
		
	}
}
