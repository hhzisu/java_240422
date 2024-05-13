package chapter04;

import java.util.Scanner;

/*
 * static 사용 (필드, 메소드)
 * 클래스 이름으로 static 멤버 접근
 * 환율을 입력받아 100만원 몇 달러?
 * 환율 -> 100달러가 몇 원?
 */
//접근지정자 : default
class CurrencyConverter{
//	자기 클래스에서만 접근(객체 생성 없이)
//	멤버 변수는 일반적으로 private 많이 사용(보안)
//jsp, spring 할때도 많이 사용
//메소드를 사용해서 멤버변수를 접근해서 사용(직접적인 값 수정을 막음 -> 보안)
//getter(ex>getAbc : 값을 가져올때), setter(ex>setAbc: 값을 지정할때) 메소드 사용해서 멤버변수 사용
	private static double rate; //멤버 변수 필드
	 public static void setRate(double rate) {
//		매개변수를 static(클래스)멤버로 저장 ex> non-static(객체)멤버
		 CurrencyConverter.rate = rate;
	}
//	 1300원, 환율:1300-> 1300원/환율1300=1달러
	 public static double toDollar(double won) {
	 return won/rate;
	 }
//	 환율 1300*1달러=1300원
	 public static double toKWR(double dollar) {
		 return dollar*rate;
	 }
}
public class StaticMember {
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		System.out.print("환율(1달러)>>");
		double rate = scanner.nextDouble();
		CurrencyConverter.setRate(rate);
		System.out.println("백만원은 $"+CurrencyConverter.toDollar(1000000)+"입니다.");
		System.out.println("100$는 "+CurrencyConverter.toKWR(100)+"입니다.");
		scanner.close();
	}
}
