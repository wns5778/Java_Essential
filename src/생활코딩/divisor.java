package ��Ȱ�ڵ�;
import java.util.Scanner;
//�ϳ��� ������ �Է¹޾� �� ������ ��� ���ϱ�

public class divisor {

	public static void main(String[] args) {
	
	System.out.print("���� �Է� : "); 
	Scanner scanner = new Scanner(System.in);
	int num = scanner.nextInt(); 
	
	System.out.printf("%d�� ��� : ", num); 
	for(int i = 1; i <= num; i++) { 
		if(num % i == 0) { 
			if(num == i) { 
				System.out.println(i + "\n"); 
				break; 
				} 
			System.out.print(i + ", "); 
			} 
		} 
	} 
}

	

