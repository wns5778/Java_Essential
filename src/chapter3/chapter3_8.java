package chapter3;
import java.util.Scanner;

//컴퓨터와 사용자의 가위바위보 개임

public class chapter3_8 {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		String[] str = {"가위", "바위", "보"};
		System.out.println("컴퓨터와 가위 바위 보 게임을 합니다.");
		while(true) {
			int n = (int)(Math.random()*3);
			System.out.print("가위 바위 보!");
			String a = scanner.next();
			if((a.equals("가위") && str[n].equals("보")) || (a.equals("바위") && str[n].equals("가위")) || (a.equals("보") && str[n].equals("바위"))) {
				System.out.println("사용자 = "+a+", 컴퓨터 = "+str[n]+", 사용자가 이겻습니다.");
			}
			else if((a.equals("가위") && str[n].equals("바위")) || (a.equals("바위") && str[n].equals("보")) || (a.equals("보") && str[n].equals("가위"))) {
				System.out.println("사용자 = "+a+", 컴퓨터 = "+str[n]+", 컴퓨터가 이겻습니다.");
			}
			else if((a.equals("가위") && str[n].equals("가위")) || (a.equals("바위") && str[n].equals("바위")) || (a.equals("보") && str[n].equals("보"))) {
				System.out.println("사용자 = "+a+", 컴퓨터 = "+str[n]+", 비겼습니다.");
			}
			else if(a.equals("그만")) {
				System.out.print("게임을 종료합니다....");
				break;
			}
		}

	}

}
