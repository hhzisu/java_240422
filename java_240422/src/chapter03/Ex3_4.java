package chapter03;

public class Ex3_4 {
	public static void main(String[] args) {
//		String 타입의 names 배열 선언
//		String[] names; 
//		배열 선언, 생성, 초기화
//		배열 원소(값)이 4개면 인덱스 3까지
//		String[] names= {"Sam","Kate","John","Jenny"};
//		String 배열 객체 생성
//		String 기본값 : null
//		String[] names= new String[5];
//		names : 참조(레퍼런스)변수
//		String[] names;  // 배열 선언
//		names = new String[5];  //  배열 생성
//		0번째 인덱스에 aaa 문자열 값(원소)을 할당
//		names[0]="aaa";   
		
//		double[] names;
//		double 기본 값 : 0.0
//		names=new double[5];
		
//		배열 선언, 생성
//		int 기본값 : 0
		int[] names=new int[5];
		
		
//		System.out.println(names[-1]); //오류
		System.out.println(names[0]);
		System.out.println(names[1]);
		System.out.println(names[2]);
		System.out.println(names[3]);
		System.out.println(names[4]);
//		System.out.println(names[5]);  //오류
	}
}
