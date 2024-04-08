class TV{
	private int size;
	public TV(int size) {this.size = size;}
	protected int getSize() {return size;}
}

class ColorTV extends TV{
	private int color;
	
	public ColorTV(int x, int y) {
		super(x);
		this.color = y;
	}
	void printProperty() {
		System.out.println(super.getSize() + "인치 " + this.color + "컬러");
	}
}

class IPTV extends ColorTV{
	private String IP;
	
	public IPTV(String a, int b, int c) {
		super(b, c);
		this.IP = a;
	}
	
	void printProperty() {
		System.out.print("나의 IPTV는 " + this.IP + " 주소의 ");
		super.printProperty();
	}
} 
public class Main {
	public static void main(String[] args) {
		IPTV iptv = new IPTV("192.1.1.2", 32, 2048);
		iptv.printProperty();
	}

}
