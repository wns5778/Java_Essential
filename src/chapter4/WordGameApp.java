package chapter4;
import java.util.Scanner;
import java.util.Arrays;

class player{
   void String sayWord(){
   
   }
}

public class WordGameApp {

   public static void main(String[] args) {
      // TODO Auto-generated method stub
      Scanner scanner = new Scanner(System.in);
      System.out.print("게임에 참가하는 인원은 몇명입니까?");
      int number = scanner.nextInt();
      String[] player = new String[number];
   
      for(int i=0; i<number;i++) {
         System.out.print("참가자의 이름을 입력하세요>>");
         player[i] = scanner.next();         
      }
      System.out.print("시작하는 단어는 아버지입니다.");
      while(true) {
         String word = "아버지";
         int lastIndex = word.length() -1;
         char lastchar = word.charAt(lastIndex);
         char firstchar = word.charAt(0);
         
      }

   }

}
public class WordGameApp {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}

}
