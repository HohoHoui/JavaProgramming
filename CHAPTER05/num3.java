class Point{
	private int x, y;
	public Point(int x, int y) {this.x = x; this.y = y;}
	public int getX() {return x;}
	public int getY() {return y;}
	protected void move(int x, int y) {this.x = x; this.y = y;}
}

class ColorPoint extends Point{
	private String a;
	
	public ColorPoint() {
		super(0, 0);
		this.a = "BLACK";
	}
	public ColorPoint(int a, int b) {
		super(a, b);
		this.a = "BLACK";
	}
	
	public void setXY(int a, int b) { 
		super.move(a, b);
	}
	public void setColor(String a) { this.a = a;}
	public String toString() {
		return this.a + "색의 (" + super.getX() + "," + super.getY() + ")의 점";
	}
}

public class Main {
	public static void main(String[] args) {
		ColorPoint zeroPoint = new ColorPoint();
		System.out.println(zeroPoint.toString() + "입니다.");
		
		ColorPoint cp = new ColorPoint(10, 10);
		cp.setXY(5, 5);
		cp.setColor("RED");
		System.out.println(cp.toString()+ "입니다.");
	}
}
