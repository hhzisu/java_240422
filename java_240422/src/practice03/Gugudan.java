package practice03;


public class Gugudan {
	public static void main(String[] args) {
		for (int i = 1; i < 10; i++) {
			for (int j = 1; j < 10; j++) {
//				                              \t  탭으로 띄어서 정렬되게 출력
				System.out.print(i+"*"+j+"="+i*j+"\t"); 
			}
			System.out.println();
		}
	}
}
