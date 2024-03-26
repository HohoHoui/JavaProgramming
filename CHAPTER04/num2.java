import java.util.Scanner;

class Rectangle{
	int x, y, width, height;
	
	public Rectangle(int a, int b, int c, int d) {
		this.x = a;
		this.y = b;
		this.width = c;
		this.height = d;
	}
	
	int square() {
		return this.width * this.height;
	}
	
	void show() {
		System.out.println("(" + this.x + "," + this.y +")에서 크기가 " + this.width + "x" + this.height + "인 사각형");
	}
	
	boolean contains(Rectangle m) {
		/*if((this.x <= m.x) && ((m.x + m.width) <= (this.x + this.width))) {
			if((this.y <= m.y) && ((m.y + m.width) <= this.y + this.width))
				return true;			
		}*/
		//System.out.println("this x : "+this.x + " m.x : " + m.x);
		//System.out.println("this y : "+this.y + " m.y : " + m.y);
		return ((this.x < m.x) && ((m.x + m.width) < (this.x + this.width))) && ((this.y < m.y) && ((m.y + m.width) < this.y + this.width));
		//완전히 포함하는 것을 말함 한 변이라도 겹치면 안 됨.
	}
}

public class Main {
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		int x, y, w, h;
		Rectangle t = new Rectangle(1, 1, 10, 10);
		x = scanner.nextInt();
		y = scanner.nextInt();
		w = scanner.nextInt();
		h = scanner.nextInt();
		Rectangle r = new Rectangle(x, y, w, h);
		
		x = scanner.nextInt();
		y = scanner.nextInt();
		w = scanner.nextInt();
		h = scanner.nextInt();
		Rectangle s = new Rectangle(x, y, w, h);
		
		r.show();
		System.out.println("s의 면적은 " + s.square());
		
		if(t.contains(r)) System.out.println("t는 r을 포함합니다."); //맞으면 true를 리턴하고 아니면 false를 리턴함.
		if(t.contains(s)) System.out.println("t는 s를 포함합니다.");
		
	}

}
