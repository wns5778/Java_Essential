package chapter4;
import java.util.Scanner;

//이름과 전화번호 2개를 입력받아 2개의 phone객체를 생성하여 출력
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
         System.out.print("이름과 전화번호 입력");
         name[i] = scanner.next();
         tel[i] = scanner.next();      
      }   
      
      String name1 = name[0];
      String tel1 = tel[0];
      String name2 = name[1];
      String tel2 = tel[1];
      
      phone phone1 = new phone(name1, tel1);
      System.out.println(name1+"의 번호 "+tel1);
      phone phone2 = new phone(name2, tel2);
      System.out.println(name2+"의 번호 "+tel2);

   }

}