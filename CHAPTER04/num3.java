import java.util.Scanner;

class Phone{
	public String name;
	public String tel;
	public void search() {
		System.out.println( this.name+ "의 번호는 " + this.tel + " 입니다.");
	}
}

class PhoneBook extends Phone{
	Scanner scanner = new Scanner(System.in);

	public int Pnum;
	Phone []p = new Phone[this.Pnum];
	
	public PhoneBook() {
		
	}
	
	public void InputPerson() {
		while(true) {
			//System.out.print("인원 수 >> ");
			this.Pnum = scanner.nextInt();
			if(this.Pnum > 0){
				break;
			}
			else {
				//System.out.println("0");
			}
		}
		
		p = new Phone[this.Pnum];
		for(int i = 0 ; i < this.Pnum ; i++) {
			p[i] = new Phone();
		}
		
		InputInformation();
	}
	
	public void InputInformation() {
		for(int i = 0 ; i < this.Pnum ; i++) {
			//System.out.print("이름과 전화번호(이름과 번호는 빈 칸 없이 입력) >> ");
			p[i].name = scanner.next();
			p[i].tel = scanner.next();
		}
		System.out.println("저장되었습니다...");
		//search();
	}
	
	public void search() {
		String ans;
		while(true) {
			//System.out.print("검색할 이름 >> ");
			ans = scanner.next();
			if(ans.equals("그만")) break;
			
			for(int i = 0 ; i < this.Pnum ; i++) {
				if(ans.equals(p[i].name)) {
					p[i].search();
					break;
				}
				else if(i == this.Pnum - 1){
					System.out.println(ans + " 이 없습니다.");
				}
			}
		}
	}
}

public class Main {
	public static void main(String[] args) {
		PhoneBook a = new PhoneBook();
		a.InputPerson();
		a.search();
	}

}
