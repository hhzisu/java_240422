package practice09;

class TV2{
	private int size;
	public TV2(int size) {
		this.size =size;
	}
	protected int getSize() {
		return size;
	}
}

class ColorTv2 extends TV2 {
	private int color;
	
	public ColorTv2(int size, int color) {
		super(size);
		this.color = color;
	}
	public void printProperty() {
		System.out.println(getSize()+"인치 "+color+"컬러");
	}
}
public class IPTV extends ColorTv2 {
	private String ipAddr;
	public IPTV(String ipAddr, int size, int color) {
		super(size, color);
		this.ipAddr = ipAddr;
	}
	public void printProperty() {
		System.out.print("나의 IPTV는 "+ipAddr+"주소의 ");
		super.printProperty();
	}

	public static void main(String[] args) {
		IPTV iptv = new IPTV("192.1.12", 32, 2048);
		iptv.printProperty();
	}
}