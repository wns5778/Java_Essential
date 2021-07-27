package chapter6;

//중심 표현하는 int형 x,y와 반지름 radius를 저장하는 circle클래스 작성, equals()메소드를 사용하여 같은지 비교

class Circle{
	private int x,y,radius;
	public Circle(int x, int y, int radius) {
		this.x = x;
		this.y = y;
		this.radius = radius;
	}
	
	@Override
	public String toString() {
		return "("+x+","+y+")"+"반지름"+ radius;
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
		System.out.println("원 1:" + a);
		System.out.println("원 2:" + b);
		if(a.equals(b))
			System.out.println("같은 원입니다.");
		else
			System.out.println("다른 원입니다.");
		
	}

}
