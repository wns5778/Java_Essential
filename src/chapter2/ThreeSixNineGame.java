package chapter2;
import java.util.Scanner;

//1~99���� ���� �Է¹޾� 3,6,9�� �ϳ� ������ "�ڼ�¦", �ΰ������� "�ڼ�¦¦", �ϳ��������� "�ڼ�����"�� ���
public class ThreeSixNineGame {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		System.out.print("1~99 ������ ������ �Է��ϼ���>>");
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
			System.out.print("�ڼ�����");
		}
		else if(count == 1) {
			System.out.print("�ڼ�¦");
		}
		else if(count == 2) {
			System.out.print("�ڼ�¦¦");
		}
	}

}
