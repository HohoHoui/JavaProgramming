import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		
		String course[] = {"Java", "C++", "HTML5", "컴퓨터구조", "안드로이드"};
		int score[] = {95, 88, 76, 62, 55};
		
		String ans = "";
		
		while(true) {
			System.out.print("과목 이름>>");
			ans = scanner.next();
			if(ans.equals("그만")){
			    break;
			}
			int num = 0;
			for(int i = 0 ; i < 5 ; i++) {
				if(ans.equals(course[i])) {
					System.out.println(course[i] + "의 점수는 "+ score[i]);
					num++;
				}
				else if(i == 4 && num == 0){
					System.out.println("없는 과목입니다.");
					break;
				}
			}
			
		}
		scanner.close();
	}

}
