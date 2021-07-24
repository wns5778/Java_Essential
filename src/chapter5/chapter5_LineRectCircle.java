package chapter5;
import java.util.Scanner;

//������ �׷��� ������ (�޼ҵ� �������̵��� �߻� Ŭ������ ���)


class Line extends chapter5_LineRectCircle{
	protected void print() {
		System.out.println("Line");
	}
}

class Rect extends chapter5_LineRectCircle{
	protected void print() {
		System.out.println("Rect");
	}
}

class Circle extends chapter5_LineRectCircle{
	protected void print() {
		System.out.println("Circle");
	}
}

abstract public class chapter5_LineRectCircle {
	protected abstract void print();

	public static void main(String[] args) {
		int count = 0;
		chapter5_LineRectCircle[] array = new chapter5_LineRectCircle[10];
		Scanner scanner = new Scanner(System.in);
		
		while(count<10) {
			System.out.print("����(1), ����(2), ��κ���(3), ����(4)>>");
			int number = scanner.nextInt();
			switch(number) {
			
			case 1:
				System.out.print("���� ���� Line(1), Rect(2), Circle(3) >>");
				int number1 = scanner.nextInt();
				
				switch(number1) {
				case 1:
					array[count] = new Line();
					break;
				case 2:
					array[count] = new Rect();
					break;
				case 3:
					array[count] = new Circle();
					break;
				}
				count++;
				break;
			
			case 2:
				if(count == 0) {
					System.out.print("������ ������ �����ϴ�.");
					break;
				}
				
				System.out.print("������ ������ ��ġ(0~"+(count-1)+") >>");
				int number2 = scanner.nextInt();
				if(number2 >= count) {
					System.out.print("������ �� �����ϴ�.");
					break;
				}
				else {
					count --;
					array[number2] = null;
					
					if(number2 ==0) {
						for(int i =0; i<count;i++) {
							array[i] = array[i+1];
							array[count+1] = null;
						}
					}
					break;
				}
			case 3:
				for(int i=0;i<count;i++)
					array[i].print();
				break;
				
			case 4:
				System.out.print("���α׷��� �����մϴ�.");
				scanner.close();
				System.exit(0);
				break;
			}
		}
	

	}

}

