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
      System.out.print("���ӿ� �����ϴ� �ο��� ����Դϱ�?");
      int number = scanner.nextInt();
      String[] player = new String[number];
   
      for(int i=0; i<number;i++) {
         System.out.print("�������� �̸��� �Է��ϼ���>>");
         player[i] = scanner.next();         
      }
      System.out.print("�����ϴ� �ܾ�� �ƹ����Դϴ�.");
      while(true) {
         String word = "�ƹ���";
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
