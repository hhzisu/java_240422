package chapter02;

import java.util.Scanner;

public class ScannerEx {
	public static void main(String[] args) {
		System.out.println("이름, 도시, 나이, 체중, 독신 여부를 빈칸으로 분리하여 입력하세요");
//		System.in : 바이트 표준 입력 스트림
//		System.in : 매개변수(인자, 파라미터, argument)
//		new Scanner(System.in): 객체 생성
//		scanner : 참조(reference) 변수
//		Scanner 객체를 생성하고, Scanner 클래스 타입의 scanner 참조변수가 가리킴
		Scanner scanner = new Scanner(System.in);
//		scanner : 객체 // next() :  문자열 입력 받는 메소드
		String name = scanner.next();
		System.out.println("내 이름이 모냐면 "+name+"야~!");

//		입력 받을때 스페이스나 탭으로 구분해서 토큰 단위로 받음
		String city = scanner.next();
		System.out.println("도시는"+city);

		int age = scanner.nextInt();
		System.out.println("나이는 "+age+"살이야!!!");
		
		double weight = scanner.nextDouble();
		System.out.println("몸무게는 "+weight+"kg");

		boolean single = scanner.nextBoolean();
		System.out.println("독신여부는 "+single+"이에요.");
		
//		(close는 메소드) close() : scanner 객체 종료(자원 반납)
//		=>메모리를 더 사용할 수 있고, 안하면 garbage collector(쓰레기청소부)가 자동으로 정리해버림
		scanner.close();
	}	
}
