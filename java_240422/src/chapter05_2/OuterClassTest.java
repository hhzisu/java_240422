package chapter05_2;

class OuterClass{ //외부 클래스
	private String secret = "Time is money"; //secret: 필드
//	public String secret = "Time is money"; //secret: 필드
	public OuterClass() {//생성자 //2. 달걀의 생성자 호출됨
//		new InnerClass(); //객체 생성 //3. 노른자 객체 생성
		InnerClass obj = new InnerClass(); //객체 생성 //3. 노른자 객체 생성
		obj.method(); //a.
	}
	public class InnerClass{ //내부(중첩 or inner) 클래스
//	private class InnerClass{ //내부(중첩 or inner) 클래스
		public InnerClass() {//생성자 //4. 노른자의 생성자 호출됨
			System.out.println("내부 클래스의 생성자 입니다.");
		}
		//b.
		public void method() {
//			노른자에서 달걀의 private 접근
			//c.
			System.out.println(secret);
		}
	}
}
public class OuterClassTest {
	public static void main(String[] args) {
//		new OuterClass(); //1. 달걀 객체 생성
		OuterClass outer = new OuterClass();
//		outer.secret=""; //접근제한(private 이면)
//		private을 안해도 접근 제한
//		new InnerClass();//접근제한, 노른자 객체 생성(오류)
	}
}
