package practice08;

import java.util.Scanner;

public class RandomArray {
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		System.out.print("정수 몇개? ");
		int n = scanner.nextInt();
		int intArray[] = new int [n];
		
		for (int i = 0; i < intArray.length; i++) {
			int r = (int)(Math.random()*100+1);
			intArray[i] = r;
			if (i==0) { //첫번째는 엔터 안친다.
				System.out.print(intArray[i]+" ");
			} else {
				if (i%10 == 0) {//10번째마다 엔터 친다.
					System.out.println();
				}
				System.out.print(intArray[i]+" ");
			}
		}
		scanner.close();
	}
}
