package practice09;

interface Shape {
	final double PI = 3.14;
	void draw();
	double getArea();
	default public void redraw() {
		System.out.print("--- 다시 그립니다. ");
		draw();
	}
}
class Circle2 implements Shape{
	private int radius;
	public Circle2(int radius) {this.radius = radius;}
	@Override
	public void draw() {System.out.println("반지름이 "+radius+"인 원입니다.");} //오버라이딩(동적 바인딩)
	@Override
	public double getArea() {return PI*radius*radius;}
}
public class Shapes{
	public static void main(String[] args) {
		Shape donut = new Circle2(10); //upcasting
		donut.redraw();
		System.out.println("면적은 "+donut.getArea());
	}
}

