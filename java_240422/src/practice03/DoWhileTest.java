package practice03;

public class DoWhileTest {
	public static void main(String[] args) {
		int a=0, sum=0;
//		do {
//			if (a%2==0) {
//				sum += a;
//			}
//			a++;
//		} while (a<=99);
		do {
			if (a>99) {
				break;
			}
			sum += a;
			a += 2;
		} while (true);
		System.out.println(sum);
	}
}
