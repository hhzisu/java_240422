package practice06;

import java.util.Random;

public class RandomTen {
	public static void main(String[] args) {
		int intArray[] = new int [10];
		double sum =0,average=0;
		Random generator = new Random();
		System.out.print("랜덤한 정수들 : ");
		for (int i = 0; i < intArray.length; i++) {
			intArray[i] = generator.nextInt(10)+1;
			System.out.print(intArray[i]+" ");
			sum += intArray[i];
		}
		average = sum/intArray.length;
		System.out.println();
		System.out.println("평균은 "+average);
		
//		for (int i = 0; i < intArray.length; i++) {
//			int r = (int)(Math.random()*10)+1; //1~10
//			intArray[i] = r; //난수를 배열에 저장
//			sum += intArray[i]; //배열 원소의 누적 합계
//		}
//		System.out.print("랜덤한 정수들 : ");
//		for (int i = 0; i < intArray.length; i++) {
//			System.out.print(intArray[i]+" ");
//		}
//		System.out.println("\n평균은 "+(double)sum/intArray.length);
	}
}
