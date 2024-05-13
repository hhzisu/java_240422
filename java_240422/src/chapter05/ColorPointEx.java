package chapter05;

/*
 * Point 클래스 : (x,y) 한 점을 표현
 * Point 클래스를 상속받는 ColorPoint 클래서 (색을 가진 점)
 */
class Point{
	private int x,y; //x,y 멤버변수 // 4. (1,2)
	public void set(int x, int y) { // 2. (1,2)
		this.x = x; this.y = y; // 3. (1,2)
	}
	public void showPoint() {
		System.out.println("("+x+","+y+")");
	}
}
class ColorPoint extends Point{//ColorPoint:서브클래스(자식) //Point:슈퍼 클래스(부모)
	private String color;
	public void setColor(String color) {//setter b.("red")
		this.color = color; // c.("red")
	}
	public void showColorPoint() {
		System.out.print(color);
		showPoint();
	}
}
public class ColorPointEx {
	public static void main(String[] args) {
		Point p=new Point();//객체를 생성, 멤버는 4개, 생성자 호출(기본)//p: 레퍼런스변수 
//		1.메소드 호출
		p.set(1, 2);
		p.showPoint();
		
//		객체를 생성, 멤버는 7개, 생성자 호출(기본): Point(슈퍼) -> ColorPoint(서브)
		ColorPoint cp = new ColorPoint();
		cp.set(3, 4);
		cp.showPoint();
//		a. red 값을 가지고 메소드 호출
		cp.setColor("red");  //red: 매개변수 (메소드 안에 매개변수)
		cp.showColorPoint();
	}
}
