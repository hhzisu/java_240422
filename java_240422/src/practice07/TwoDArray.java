package practice07;

//import java.util.Random;

public class TwoDArray {
	public static void main(String[] args) {
		int intArray[][] = new int [4][4];
//		Random r = new Random();
//		for (int i = 0; i < intArray.length; i++) {
//			for (int j = 0; j < intArray[i].length; j++) {
//				intArray[i][j] = r.nextInt(10)+1;
//				System.out.print(intArray[i][j]+"\t");
//			}
//			System.out.println();
//		}
		for (int i = 0; i < intArray.length; i++) {
			for (int j = 0; j < intArray[i].length; j++) {
				intArray[i][j] = (int)(Math.random()*10+1);
				System.out.print(intArray[i][j]+"\t");
			}
			System.out.println();
		}
	}
}
