package practice08;

import java.util.Scanner;

public class RandomArray2 {
//	난수의 중복체크하는 메소드
//	2. 	a[]: intArray, to: 0, r: 23 // to:1, r:33 // to:2, r:33
	public static boolean exists(int a[], int to, int r) {
//		0: 반복안함
//		0<1 1번반복
//		0<2 2번반복
		for (int i = 0; i < to; i++) {
//			a[0]:23, r:33
//			a[0]:23, r:33 a[1]:33, r:33
			if (a[i] == r) {
				return true;
			}
		}
		return false;
	}
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		System.out.print("정수 몇개?");
		int n = scanner.nextInt();
		int intArray[] = new int[n];
		
		for (int i = 0; i < intArray.length; i++) {
			int r = (int)(Math.random()*100+1);
//		1.	i=0, r=23 //i=1, r=33 //i=2, r=33
			if (exists(intArray, i, r)) {
				i--;
				continue;
			}
//			intArray[0]=23 //intArray[1]=33
			intArray[i] = r;
			if (i==0) { 
				System.out.print(intArray[i]+" ");
			} else {
				if (i%10 == 0) {
					System.out.println();
				}
				System.out.print(intArray[i]+" ");
			}
		}
		scanner.close();
	}
}
