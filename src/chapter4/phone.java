package chapter4;
import java.util.Scanner;

//�̸��� ��ȭ��ȣ 2���� �Է¹޾� 2���� phone��ü�� �����Ͽ� ���
public class phone {
   private String name, tel;
   public phone(String name, String tel) {
      this.name = name;
      this.tel = tel;
   }
   public String getName() {return name;}
   public String getTel() {return tel;}
   

   public static void main(String[] args) {
      // TODO Auto-generated method stub
      Scanner scanner = new Scanner(System.in);
      String name[] = new String[2];
      String tel[] = new String[2];
      for(int i=0; i<2; i++) {
         System.out.print("�̸��� ��ȭ��ȣ �Է�");
         name[i] = scanner.next();
         tel[i] = scanner.next();      
      }   
      
      String name1 = name[0];
      String tel1 = tel[0];
      String name2 = name[1];
      String tel2 = tel[1];
      
      phone phone1 = new phone(name1, tel1);
      System.out.println(name1+"�� ��ȣ "+tel1);
      phone phone2 = new phone(name2, tel2);
      System.out.println(name2+"�� ��ȣ "+tel2);

   }

}