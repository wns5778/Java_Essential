package chapter2;
import java.util.Scanner;

//1~99사이 정수 입력받아 3,6,9중 하나 있으면 "박수짝", 두개있으면 "박수짝짝", 하나도없으면 "박수없음"을 출력
public class ThreeSixNineGame {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		System.out.print("1~99 사이의 정수를 입력하세요>>");
		int number = scanner.nextInt();
		int first = number/10;
		int second = number%10;
		int count = 0;
		if(first==3 || first==6 || first==9) {
			count++;
		}
		if(second==3 || second==6 || second==9) {
			count++;
		} 
		if(count == 0) {
			System.out.print("박수없음");
		}
		else if(count == 1) {
			System.out.print("박수짝");
		}
		else if(count == 2) {
			System.out.print("박수짝짝");
		}
	}

}
