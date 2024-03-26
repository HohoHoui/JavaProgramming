import java.util.Scanner;

class Dictionary{
	private static String kor[] = {"사랑", "아기", "돈", "미래", "희망"};
	private static String eng[] = {"love", "baby", "money", "future", "hope"};
	public static String kor2Eng(String word) {
		for(int i = 0 ; i < kor.length ; i++) {
			if(word.equals(kor[i])) {
				return eng[i];
			}
		}
		return "null";
	}
}

class DicApp{
	Scanner scanner = new Scanner(System.in);
	protected static String ans;
	protected static String Ans;
	public void start(){
		System.out.println("한영 단어 검색 프로그램입니다.");
		
		while(true) {
			//System.out.print("한글 단어? ");
			ans = scanner.next();
			if(ans.equals("그만")) break;
			Ans = Dictionary.kor2Eng(ans);
			if(Ans.equals("null")) {
				System.out.println(ans + " : 저의 사전에 없습니다.");
			}
			else {
				System.out.println(ans + " : "  + Ans);
			}
		}
	}
}

public class Main {
	public static void main(String[] args) {
		DicApp d = new DicApp();
		d.start();
	}
}
