package chapter3;
import java.util.Scanner;

//��ǻ�Ϳ� ������� ���������� ����

public class chapter3_8 {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		String[] str = {"����", "����", "��"};
		System.out.println("��ǻ�Ϳ� ���� ���� �� ������ �մϴ�.");
		while(true) {
			int n = (int)(Math.random()*3);
			System.out.print("���� ���� ��!");
			String a = scanner.next();
			if((a.equals("����") && str[n].equals("��")) || (a.equals("����") && str[n].equals("����")) || (a.equals("��") && str[n].equals("����"))) {
				System.out.println("����� = "+a+", ��ǻ�� = "+str[n]+", ����ڰ� �̰���ϴ�.");
			}
			else if((a.equals("����") && str[n].equals("����")) || (a.equals("����") && str[n].equals("��")) || (a.equals("��") && str[n].equals("����"))) {
				System.out.println("����� = "+a+", ��ǻ�� = "+str[n]+", ��ǻ�Ͱ� �̰���ϴ�.");
			}
			else if((a.equals("����") && str[n].equals("����")) || (a.equals("����") && str[n].equals("����")) || (a.equals("��") && str[n].equals("��"))) {
				System.out.println("����� = "+a+", ��ǻ�� = "+str[n]+", �����ϴ�.");
			}
			else if(a.equals("�׸�")) {
				System.out.print("������ �����մϴ�....");
				break;
			}
		}

	}

}
