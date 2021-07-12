package chapter4;
import java.util.Scanner;

public class PhoneManager {
   private String name, phone;
   public PhoneManager(String name, String phone) {
      this.name = name;
      this.phone = phone;
   }

   public static void main(String[] args) {
      // TODO Auto-generated method stub
      Scanner scanner = new Scanner(System.in);
      System.out.print("인원수>>");
      int count = scanner.nextInt();
      
      String name[] = new String[count];
      String phone[] = new String[count];
      
      for(int i=0; i<count;i++) {
         System.out.print("이름과 전화번호(번호는 연속적으로 입력)>>>");
         name[i] = scanner.next();
         phone[i] = scanner.next();
      }
      System.out.print("저장되었습니다...");
      
      do {
         System.out.print("검색할 이름>>");
         String Name = scanner.next();
         
         for(int j=0;j<count;j++) {
            if(Name == name[j]) {
               PhoneManager name1 = new PhoneManager(name[j], phone[j]);
               System.out.print(name1.name+"의 번호는"+name1.phone+"입니다.");      
            }
         }
      
   }
}
}