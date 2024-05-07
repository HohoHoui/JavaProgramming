class Circle{
	private int x, y, rad;
	public Circle(int a, int b, int c) {
		this.x = a;
		this.y = b;
		this.rad = c;
	}
	public String toString() {
		return "Circle(" + this.x + "," + this.y + ")반지름" + this.rad;
	}
	public boolean equals(Circle Circle) {
		if((this.x == Circle.x) && (this.y == Circle.y)) {
			return true;
		}
		else return false;
	}
}
public class Main {
	public static void main(String[] args) {
		Circle a = new Circle(2, 3, 5);
		Circle b = new Circle(2, 3, 30);
		
		System.out.println("원 a : " + a);
		System.out.println("원 b : " + b);
		
		if(a.equals(b)) {
			System.out.println("같은 원");
		}else {
			System.out.println("서로 다른 원");
		}
	}

}
