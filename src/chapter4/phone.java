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

      System.out.print("이름과 전화번호 입력");
      phone person1 = new phone(scanner.next(),scanner.next());
      System.out.print("이름과 전화번호 입력");
      phone person2 = new phone(scanner.next(),scanner.next());
     
      System.out.println(person1.name+"의 번호"+person1.tel);
      System.out.println(person2.name+"의 번호"+person2.tel);

      
   }

}