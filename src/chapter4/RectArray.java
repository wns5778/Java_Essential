package chapter4;
import java.util.Scanner;
import java.util.Arrays;

//4개의 사각형을 입력받아 배열에 저장후 4개의 사각형 면접의 합을 구한다.
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
         System.out.print((i+1)+" 너비와 높이 >>");
         width[i] = scanner.nextInt();
         height[i] = scanner.nextInt();   
      }
      System.out.println("저장하였습니다...");
      int RectSum = 0;
      for(int j=0; j<4; j++) {
         Rect rect = new Rect(width[j], height[j]);
         RectSum += rect.getArea();
         
      }
      System.out.print("사각형의 전체 합은 "+RectSum);


      
      
      

   }

}