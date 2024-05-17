package chapter07;

public class Box {
	private Object object; //object: 레퍼런스 변수//홍길동, 777, 애플객체
	
	public Object get() {
		return object;
	}
	
//	Object object="홍길동" //upcasting
//	Object object=777 //upcasting
//	Object object=new Apple() //upcasting
	public void set(Object object) {
		this.object = object;
	}
}
