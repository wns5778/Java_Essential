package chapter3;
import java.util.Scanner;

//정수 10개를 입력받아 배열에 저장하고 증가순으로 정렬하여 출력

public class chapter3_5 {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		int[] number = new int[10];
		System.out.print("정수 10개 입력>>");
		
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
