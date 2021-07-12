package chapter4;
import java.util.Scanner;
import java.util.Arrays;

//4���� �簢���� �Է¹޾� �迭�� ������ 4���� �簢�� ������ ���� ���Ѵ�.
class Rect{
   private int width, height;
   public Rect(int width, int height) {
      this.width = width;
      this.height = height;
   }
   public int getArea() {
      return width * height;
   }
}


public class RectArray {

   public static void main(String[] args) {
      int[] width = new int[4];
      int[] height = new int[4];
      Scanner scanner = new Scanner(System.in);
      for(int i=0;i<4;i++) {
         System.out.print((i+1)+" �ʺ�� ���� >>");
         width[i] = scanner.nextInt();
         height[i] = scanner.nextInt();   
      }
      System.out.println("�����Ͽ����ϴ�...");
      int RectSum = 0;
      for(int j=0; j<4; j++) {
         Rect rect = new Rect(width[j], height[j]);
         RectSum += rect.getArea();
         
      }
      System.out.print("�簢���� ��ü ���� "+RectSum);


      
      
      

   }

}