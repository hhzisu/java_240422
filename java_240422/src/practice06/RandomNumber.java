package practice06;

/*
 * 난수를 발생 Math(클래스), Random(클래스)
 */
import java.util.Random;

public class RandomNumber {
	public static void main(String[] args) {
		int rNumber;
		Random generator = new Random();

		while (true) {
			rNumber = generator.nextInt(10)+1;
			System.out.println(rNumber);
			
			if (rNumber ==7) {
				break;
			}
		}
		/*
		generator.nextInt(); //난수 발생(범위:int타입 범위 -> -2의 31승~2의 31승-1)
		generator.nextInt(10);//난수 발생(0~9의 정수)
		generator.nextInt(10)+1;//난수 발생(1~10의 정수)
		generator.nextInt(10)*(-1);//난수 발생(-9~0의 정수)
		generator.nextDouble() double범위. nextFloat() float범위. nextLong() lont타입범위 nextBoolean() 참/거짓
		*/
		
//		while (rNumber!=7) {
//			rNumber = (int)(Math.random()*10);
//			if (rNumber!=0) {
//				System.out.println(rNumber);
//			}
//		}
	}
}
