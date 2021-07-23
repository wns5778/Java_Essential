package chapter6;


class Point{
	int x,y;
	public Point(int x, int y) {
		this.x = x; this.y=y;
	}
}

public class PointEX {

	public static void main(String[] args) {
		Point a = new Point(2,3);
		String s = a + "Á¡";
		System.out.println(s);
		
		int as = 50;
		String ad = "50";
		
		System.out.println(as);
		System.out.println(ad);

	}

}