package chapter2;
import java.util.Scanner;

//돈의 액수를 입력하면 각 단위의 돈의 갯수를 알려줌

public class CountCoin {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		System.out.print("돈의 액수를 입력하세요>>");
		int money = scanner.nextInt();
		int fiftythousand = money/50000;
		int tenthousand = (money%50000)/10000;
		int thousand = (money%10000)/1000;
		int fivehundred = (money%1000)/500;
		int hundred = (money%500)/100;
		int ten = (money%100)/10;
		int one = money%10;
		
		System.out.print("오만원"+fiftythousand+"개,만원"+tenthousand+"개,천원"+thousand+"개,500원"+fivehundred+"개,100원"+hundred+"개,10원"+ten+"개,1원"+one);
		

	}

}
