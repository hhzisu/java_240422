package chapter02;

public class EscapeExample {
	public static void main(String[] args) {
		System.out.println("번호이름직업");
//		백슬래시+t : 탭(tab)만큼 띄움
//		println : 엔터 적용
		System.out.println("번호\t이름\t직업");
//		print : 엔터 적용 안됨
//		백슬래시+n : 엔터(다음행)
		System.out.print("번호\t이름\t직업\n");
		System.out.print("번호\t이름\t직업");
		System.out.println(); //엔터
		System.out.println("우리는 개발자 입니다.");
//		백슬래시+" : 큰따옴표
		System.out.println("우리는 \"개발자\" 입니다.");
		System.out.println("봄여름가을겨울");
		System.out.println("봄\r여름가을겨울");
//		백슬래시+백슬래시 : 백슬래시
		System.out.println("봄\\여름\\가을\\겨울");
		
	}
}
