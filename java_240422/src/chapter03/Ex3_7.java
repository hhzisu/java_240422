package chapter03;

public class Ex3_7 {
	public static void main(String[] args) {
		int[] evens = {0,2,4,6,8,10,12,14,16,18}; //선언,생성,초기화
		int[] primes = {2,3,5,7,11,13,17,19};
		
//		1. 짝수배열을 메소드 매개변수로 호출
//		5. 합계를 받아서 evenSum에 저장
		int evenSum = sum(evens);
//		int evenSum = sum(evens[]); //오류
		int primeSum = sum(primes);
		
		
		System.out.println("짝수 배열의 합: "+evenSum);
		System.out.println("솟수 배열의 합: "+primeSum);
	}
//	sum->메소드 int->리턴타입 arr->파라미터
//	2. arr로 evens를 받는다
//	배열을 받아서 합계를 구하는 메소드
	public static int sum(int[] arr) {
//	public static int sum(int[] evens) {// 같은 이름을 사용해도 무관
//	public static int sum(int arr) { << 오류남
		int sum=0;
		
//		매개변수 배열의 크기만큼 반복하면서 sum에 합계를 누적
//		3.arr 배열원소를 가지고 반복(0,2,4,6,8,10,12,14,16,18)해서 합계 구함
		for (int i = 0; i < arr.length; i++) {
			sum += arr[i];
		}
//		4.합계를 반복
		return sum;
	}
}
