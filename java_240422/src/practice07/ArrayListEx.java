package practice07;

import java.util.ArrayList;
import java.util.Scanner;

public class ArrayListEx {
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		ArrayList<String> list = new ArrayList<>();
		String strLong ="";
		for (int i = 0; i < 4; i++) {
			System.out.print("이름을 입력하세요>>");
			String a = scanner.next();
			list.add(a);
		}
		for (int i = 0; i < list.size(); i++) {
			String str = list.get(i);
			System.out.print(str+" ");
			if (str.length()>0) {
				strLong = str;
				break;
			}
			if (strLong.length() > str.length()) {
				strLong = str;
			}
		}
		System.out.println();
		System.out.println("가장 긴 이름은 : " + strLong);
		scanner.close();
	}
}
