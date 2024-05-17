package chapter07;

public class BoxExample {
	public static void main(String[] args) {
		Box box = new Box();
		Object box2 = new Box(); //업캐스팅
		box.set("홍길동");
//		down casting(String)
		String name = (String) box.get();
		System.out.println(name);
		
		box.set(777);
//		downcasting(int)
		int number = (int) box.get();
		System.out.println(number);
		
		box.set(new Apple());
//		downcating(Apple)
		Apple apple = (Apple) box.get();
//		chapter07.Apple@515f550a (패키지.클래스@해시코드)
		System.out.println(apple); 
	}
}
