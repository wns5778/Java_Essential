package chapter2;
import java.util.Scanner;

//���� �׼��� �Է��ϸ� �� ������ ���� ������ �˷���

public class CountCoin {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		System.out.print("���� �׼��� �Է��ϼ���>>");
		int money = scanner.nextInt();
		int fiftythousand = money/50000;
		int tenthousand = (money%50000)/10000;
		int thousand = (money%10000)/1000;
		int fivehundred = (money%1000)/500;
		int hundred = (money%500)/100;
		int ten = (money%100)/10;
		int one = money%10;
		
		System.out.print("������"+fiftythousand+"��,����"+tenthousand+"��,õ��"+thousand+"��,500��"+fivehundred+"��,100��"+hundred+"��,10��"+ten+"��,1��"+one);
		

	}

}
