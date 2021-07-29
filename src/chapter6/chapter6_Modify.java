package chapter6;
import java.util.Scanner;

//영문 한 줄을 입력받고 글자 하나만 랜덤하게 수정하여 출력(공백도 수정에 포함)

public class chapter6_Modify {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		while(true) {
			System.out.print(">>");
			String s = scanner.nextLine();
			StringBuffer sb = new StringBuffer(s);
			if(s.equals("exit")) {
				System.out.print("종료합니다.");
				break;
			}
			int index = (int)(Math.random()*s.length());
			while(true) {
				int i = (int)(Math.random()*26); // 알파벳중에서 선택
				char c = (char)('a'+i); // 삽입할 문자 결정
				if(!sb.equals(c)) {
					sb.replace(index,index+1, Character.toString(c));
					break;
					
				}

			}
			System.out.println(sb);
		}

	}

}
