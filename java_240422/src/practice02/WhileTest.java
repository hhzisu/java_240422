package practice02;

public class WhileTest {
	public static void main(String[] args) {
		int sum = 0, i=0;
		
		while (i<100) {
			sum += i;
			i += 2;
			System.out.println("@# i ===>"+i);      //맞는지 확인 법
			System.out.println("@# sum ===>"+sum);  //맞는지 확인 법
		}
		System.out.println(sum);
	}
}
