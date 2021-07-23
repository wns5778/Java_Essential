package chapter5;
import java.util.Stack;
import java.util.Scanner;

interface StackInterface{
	int length();//스택에 들어있는 문자열 개수 리턴
	String pop();//스택의 톱에 있는 문자열 팝
	boolean push(String ob);// 스택의 톱에 문자열 ob 푸시 삽입
}

class StringStack implements StackInterface{
	String[] array = new String[5];
	int top = 0;

	public int length() {
		return top = 1;
	}

	public String pop() {
		return array[--top];
	}

	public boolean push(String ob) {
		if(top == 5)
			return false;
		else {
			array[top++] = ob;
			return true;
		}
	}

}
public class chapter5_StackManager {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		StringStack ss = new StringStack();
		System.out.print(">>");
		
		for(int i=0;i<5;i++) {
			ss.array[i] = scanner.next();
			ss.push(ss.array[i]);
		}
		for(int i=0;i<5;i++) {
			System.out.print(ss.pop()+" ");
		}
		
		
	
	}

}
