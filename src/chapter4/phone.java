package chapter4;
import java.util.Scanner;

public class phone{
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

      System.out.print("�̸��� ��ȭ��ȣ �Է�");
      phone person1 = new phone(scanner.next(),scanner.next());
      System.out.print("�̸��� ��ȭ��ȣ �Է�");
      phone person2 = new phone(scanner.next(),scanner.next());
     
      System.out.println(person1.name+"�� ��ȣ"+person1.tel);
      System.out.println(person2.name+"�� ��ȣ"+person2.tel);

      
   }

}