package chapter3;
import java.util.Scanner;

//영문 소문자를 입력받아 그 문자보다 알파벳 순위가 낮은 모든 문자를 출력

public class chapter3_1 {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		System.out.print("알파벳 한 문자를 입력하세요>>");
		char alphabet = scanner.next().charAt(0);
		int n = (int)alphabet;
		for(int i=97; i<=n;i++) {
			int count = i;
			for(int j = count; j <= n; j++) {
				System.out.print((char)j);
			}
			System.out.println("");
			}
		}
		

	}


