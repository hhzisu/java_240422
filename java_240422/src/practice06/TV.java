package practice06;

public class TV {
	String tv;
	int year;
	int size;
	public TV(String tv, int year, int size) {
		this.tv = tv;
		this.year = year;
		this.size = size;
	}
	void show() {
		System.out.println(tv+"에서 만든 "+year+"년형 "+size+"인치 TV");
	}
	public static void main(String[] args) {
		TV myTV = new TV("LG", 2017, 32);
		myTV.show();
	}
}
