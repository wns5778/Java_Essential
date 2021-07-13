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
      System.out.print("인원수>>");
      int count = scanner.nextInt();
      
      phone[] person = new phone[count];
      
      for(int i=0; i<count;i++) {
         System.out.print("이름과 전화번호(번호는 연속적으로 입력)>>>");
         person[i] = new phone(scanner.next(),scanner.next());
      }
      System.out.println("저장되었습니다...");
      
      while(true) {
    	  System.out.print("검색할 이름>>");
    	  String searchname = scanner.next();
    	  
    	  for(int i=0;i<count;i++) {
    		  if(searchname.equals("exit"))
    			  System.exit(1);
    		  else if(searchname.equals(person[i].name)) {
    			  System.out.println(person[i].getName()+"의 번호는"+person[i].getTel());
    			  break;
    		  }
    		  else if(!searchname.equals(person[i].name) && i ==(count-1))
    			  System.out.println(searchname+"는 없습니다.");
    	  }
      
   }
}
}