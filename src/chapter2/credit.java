package chapter2;
import java.util.Scanner;

//switch문을 사용하여 학점이 A,B이면 Excellent C,D이면 Good F이면 Bye출력

public class credit {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		System.out.print("학점을 입력하세요>>");
		char credit = scanner.next().charAt(0);
		switch(credit){
			case 'A': case 'B':
				System.out.print("Excellent");
				break;
			case 'C': case 'D':
				System.out.print("Good");
				break;
			case 'F':
				System.out.print("Bye");
				break;
			default:
				System.out.print("잘못된 입력입니다.");
				break;
				
			}
		}

}
