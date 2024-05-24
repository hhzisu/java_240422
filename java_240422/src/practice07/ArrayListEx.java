package practice07;

import java.util.ArrayList;
import java.util.Scanner;

public class ArrayListEx {
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		ArrayList<String> list = new ArrayList<>();
		for (int i = 0; i < 4; i++) {
			System.out.print("이름을 입력하세요>>");
			String s = scanner.next();
			list.add(s);
		}
		for (int i = 0; i < list.size(); i++) {
			String name = list.get(i);
			System.out.print(name+" ");
		}
		int longestIndex=0;
		for (int i = 0; i < list.size(); i++) {
//			list.get(0).length() < list.get(0).length()
//			list.get(0).length() < list.get(1).length() =>참이면 longestIndex=i
//			list.get(0 or 1).length() < list.get(2).length() =>참이면 longestIndex=i
//			list.get(0 or 1 or 2).length() < list.get(3).length() =>참이면 longestIndex=i
			if (list.get(longestIndex).length() < list.get(i).length()) {
				longestIndex = i;
			}
		}
		System.out.println("\n가장 긴 이름은 : " + list.get(longestIndex));
		scanner.close();
	}
}
