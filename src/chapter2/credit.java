package chapter2;
import java.util.Scanner;

//switch���� ����Ͽ� ������ A,B�̸� Excellent C,D�̸� Good F�̸� Bye���

public class credit {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		System.out.print("������ �Է��ϼ���>>");
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
				System.out.print("�߸��� �Է��Դϴ�.");
				break;
				
			}
		}

}
