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
      System.out.print("�ο���>>");
      int count = scanner.nextInt();
      
      String name[] = new String[count];
      String phone[] = new String[count];
      
      for(int i=0; i<count;i++) {
         System.out.print("�̸��� ��ȭ��ȣ(��ȣ�� ���������� �Է�)>>>");
         name[i] = scanner.next();
         phone[i] = scanner.next();
      }
      System.out.print("����Ǿ����ϴ�...");
      
      do {
         System.out.print("�˻��� �̸�>>");
         String Name = scanner.next();
         
         for(int j=0;j<count;j++) {
            if(Name == name[j]) {
               PhoneManager name1 = new PhoneManager(name[j], phone[j]);
               System.out.print(name1.name+"�� ��ȣ��"+name1.phone+"�Դϴ�.");      
            }
         }
      
   }
}
}