package chapter4;
import java.util.Scanner;

//2���� �̸��� ��ȭ��ȣ�� �Է¹޾� Phone��ü �����Ͽ� ���

public class Phone {
	private String name;
	private String tel;
	public Phone(String name, String tel){
		this.name = name;
		this.tel = tel;
	}
	public String getName() {return name;}
	public String getTel() {return tel;}
	
	public static void main(String[] args){
		Scanner scanner = new Scanner(System.in);
		System.out.print("�̸��� ��ȭ��ȣ �Է�>>");
		Phone phone1 = new Phone(scanner.next(), scanner.next());
		System.out.print("�̸��� ��ȭ��ȣ �Է�>>");
		Phone phone2 = new Phone(scanner.next(),scanner.next());
		System.out.println(phone1.getName() + "�� ��ȣ " + phone1.getTel());
		System.out.println(phone2.getName() + "�� ��ȣ " + phone2.getTel());
		scanner.close();	
		
		
	}
}
