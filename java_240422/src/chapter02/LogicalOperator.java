package chapter02;

public class LogicalOperator {
	public static void main(String[] args) {
//		문자끼리 비교는 유니코드 크기로 비교됨
		System.out.println('a' > 'b');  //false
		System.out.println('a' < 'b');  //true
		
		System.out.println(-1 < 0);  //true
		System.out.println(3 >= 2);  //true
		System.out.println("================");
		System.out.println(3.45 <= 2);  //false
		System.out.println(3 == 2);     //false
		System.out.println(3 != 2);     //true 
		System.out.println(!(3 != 2));  //false\
		
		System.out.println("================");
//		참 && 거짓 = 거짓
		System.out.println((3>2) && (3>4));
//		참 || 거짓 = 참 
		System.out.println((3 != 2) || (-1 > 0));
//		참 ^ 거짓 = 참
		System.out.println((3 != 2) ^ (-1 > 0));
	}
}
