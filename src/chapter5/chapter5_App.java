package chapter5;
import java.util.Scanner;

//�߻� Ŭ���� Calculator�� ��ӹ޴� Adder��  Subtracter Ŭ���� �ۼ�

abstract class Calculator{
	protected int a,b;
	abstract protected int calc();
	protected void input() {
		Scanner scanner = new Scanner(System.in);
		System.out.print("���� 2���� �Է��ϼ���>>");
		a = scanner.nextInt();
		b = scanner.nextInt();
	}
	public void run() {
		input();
		int res = calc();
		System.out.println("���� ���� " + res);
	}
}

class Adder extends Calculator{
	public int calc() {
		return a+b;
	}
}

class Subtracter extends Calculator{
	public int calc() {
		return a-b;
	}
}

public class chapter5_App {

	public static void main(String[] args) {
		Adder adder = new Adder();
		Subtracter sub = new Subtracter();
		adder.run();
		sub.run();
	}

}
