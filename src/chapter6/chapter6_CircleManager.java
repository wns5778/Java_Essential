package chapter6;

//�߽� ǥ���ϴ� int�� x,y�� ������ radius�� �����ϴ� circleŬ���� �ۼ�, equals()�޼ҵ带 ����Ͽ� ������ ��

class Circle{
	private int x,y,radius;
	public Circle(int x, int y, int radius) {
		this.x = x;
		this.y = y;
		this.radius = radius;
	}
	
	@Override
	public String toString() {
		return "("+x+","+y+")"+"������"+ radius;
	}
	
	public boolean equals(Circle c) {
		if(radius == c.radius)
			return true;
		else
			return false;
	}
}
public class chapter6_CircleManager {

	public static void main(String[] args) {
		Circle a = new Circle(1,2,10);
		Circle b = new Circle(5,6,10);
		System.out.println("�� 1:" + a);
		System.out.println("�� 2:" + b);
		if(a.equals(b))
			System.out.println("���� ���Դϴ�.");
		else
			System.out.println("�ٸ� ���Դϴ�.");
		
	}

}
