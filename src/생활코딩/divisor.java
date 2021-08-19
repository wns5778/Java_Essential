package 생활코딩;
import java.util.Scanner;
//하나의 정수를 입력받아 그 정수의 약수 구하기

public class divisor {

	public static void main(String[] args) {
	
	System.out.print("정수 입력 : "); 
	Scanner scanner = new Scanner(System.in);
	int num = scanner.nextInt(); 
	
	System.out.printf("%d의 약수 : ", num); 
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

	

