package practice07;

import java.util.Scanner;

public class Trapezoid {
	int down, up, height;
//	계산 메소드
	public double getArea() {
		return 0.5*(down+up)*height;
	}
	public static void main(String[] args) {
		Trapezoid tra = new Trapezoid(); // 객체 생성 ->생성자 호출(기본생성자 만들어서 호출 <- 컴파일러)
		Scanner scanner = new Scanner(System.in);
		System.out.print(">> ");
		tra.down = scanner.nextInt(); //객체로 멤버에 접근
		tra.up = scanner.nextInt(); //객체로 멤버에 접근
		tra.height = scanner.nextInt(); //객체로 멤버에 접근
		System.out.println("사다리꼴의 면적은 "+tra.getArea());
		scanner.close();
	}
}
