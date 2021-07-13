package chapter3;
import java.util.Scanner;
import java.util.InputMismatchException;

//try-catch-finally문을 사용하여 정수를 입력받아 홀수면 "홀수" 짝수면 "짝수" 출력

public class chapter3_3 {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		System.out.print("정수를 입력하세요>>");

		try {
			int number = scanner.nextInt();
			if(number%2 == 0) {
				System.out.println("짝수");
			}
			else if(number%2 == 1) {
				System.out.println("홀수");			
		}
			
		}
		catch(InputMismatchException e) {
			System.out.println("수를 입력하지 않아 프로그램 종료합니다.");
		}
		finally {
			scanner.close();
		}

	}

}
