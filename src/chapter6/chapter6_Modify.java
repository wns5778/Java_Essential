package chapter6;
import java.util.Scanner;

//���� �� ���� �Է¹ް� ���� �ϳ��� �����ϰ� �����Ͽ� ���(���鵵 ������ ����)

public class chapter6_Modify {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		while(true) {
			System.out.print(">>");
			String s = scanner.nextLine();
			StringBuffer sb = new StringBuffer(s);
			if(s.equals("exit")) {
				System.out.print("�����մϴ�.");
				break;
			}
			int index = (int)(Math.random()*s.length());
			while(true) {
				int i = (int)(Math.random()*26); // ���ĺ��߿��� ����
				char c = (char)('a'+i); // ������ ���� ����
				if(!sb.equals(c)) {
					sb.replace(index,index+1, Character.toString(c));
					break;
					
				}

			}
			System.out.println(sb);
		}

	}

}
