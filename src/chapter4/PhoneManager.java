package chapter4;
import java.util.Scanner;

class phone{
	String name;
	String tel;
	phone(String name, String tel) {
	      this.name = name;
	      this.tel = tel;
	   }
	String getName() {
		return name;
	}
	String getTel() {
		return tel;
	}
}

public class PhoneManager {

   public static void main(String[] args) {
   
      Scanner scanner = new Scanner(System.in);
      System.out.print("�ο���>>");
      int count = scanner.nextInt();
      
      phone[] person = new phone[count];
      
      for(int i=0; i<count;i++) {
         System.out.print("�̸��� ��ȭ��ȣ(��ȣ�� ���������� �Է�)>>>");
         person[i] = new phone(scanner.next(),scanner.next());
      }
      System.out.println("����Ǿ����ϴ�...");
      
      while(true) {
    	  System.out.print("�˻��� �̸�>>");
    	  String searchname = scanner.next();
    	  
    	  for(int i=0;i<count;i++) {
    		  if(searchname.equals("exit"))
    			  System.exit(1);
    		  else if(searchname.equals(person[i].name)) {
    			  System.out.println(person[i].getName()+"�� ��ȣ��"+person[i].getTel());
    			  break;
    		  }
    		  else if(!searchname.equals(person[i].name) && i ==(count-1))
    			  System.out.println(searchname+"�� �����ϴ�.");
    	  }
      
   }
}
}