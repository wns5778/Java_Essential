package chapter3;
import java.util.Scanner;
import java.util.InputMismatchException;

//try-catch-finally���� ����Ͽ� ������ �Է¹޾� Ȧ���� "Ȧ��" ¦���� "¦��" ���

public class chapter3_3 {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		System.out.print("������ �Է��ϼ���>>");

		try {
			int number = scanner.nextInt();
			if(number%2 == 0) {
				System.out.println("¦��");
			}
			else if(number%2 == 1) {
				System.out.println("Ȧ��");			
		}
			
		}
		catch(InputMismatchException e) {
			System.out.println("���� �Է����� �ʾ� ���α׷� �����մϴ�.");
		}
		finally {
			scanner.close();
		}

	}

}
