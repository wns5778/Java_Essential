package chapter3;
import java.util.Scanner;

//���� 10���� �Է¹޾� �迭�� �����ϰ� ���������� �����Ͽ� ���

public class chapter3_5 {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		int[] number = new int[10];
		System.out.print("���� 10�� �Է�>>");
		
		for(int i=0; i<10;i++) {
			number[i] = scanner.nextInt();
		}
		
		int a = 0;
		
		for(int j=0; j<9;j++) {
			for(int k=0;k<9;k++) {
				if(number[k] > number[k+1]) {
					a = number[k];
					number[k] = number[k+1];
					number[k+1] = a;
				}
			}
		}
		
		for(int e=0; e<10; e++) {
			System.out.print(number[e] + " ");
		}
	}

}
