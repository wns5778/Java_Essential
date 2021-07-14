package chapter4;
import java.util.Scanner;

//�̸� ��ȭ��ȣ �ʵ带 �����Ͽ� �˻��� �̸��� ��ȣ�� ã�� ���

class Phone2 {
	String name;
	String tel;

	public Phone2(String name, String tel) {
		this.name = name;
		this.tel = tel;
	}
	public String getName() {return name;}
	public String getTel() {return tel;}
}

public class PhoneManager {
	public static void main(String[] args) {
		System.out.print("�ο��� >> ");
		Scanner scanner = new Scanner(System.in);
		int n = scanner.nextInt();
		Phone2[] ph = new Phone2[n];

		for (int i = 0; i < n; i++) {
			System.out.print("�̸��� ��ȭ��ȣ(��ȣ�� ���������� �Է�) >> ");
			ph[i] = new Phone2(scanner.next(), scanner.next());
		}
		System.out.println("����Ǿ����ϴ�");
		
		while (true) {
			System.out.print("�˻��� �̸� >> ");
			String string = scanner.next();
			if (string.equals("exit"))
				break; 
			for (int i = 0; i < n; i++) {
			if (string.equals(ph[i].name)) {
			System.out.println(string + "�� ��ȣ�� " + ph[i].tel + "�Դϴ�.");
			break;
			}
			if(i==n-1)
			System.out.println(string + "�� �����ϴ�. ");	
			}
		}
		scanner.close();
	}
}