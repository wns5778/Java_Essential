package chapter3;
import java.util.Scanner;

//���� �ҹ��ڸ� �Է¹޾� �� ���ں��� ���ĺ� ������ ���� ��� ���ڸ� ���

public class chapter3_1 {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		System.out.print("���ĺ� �� ���ڸ� �Է��ϼ���>>");
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


