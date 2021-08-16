package 생활코딩;
//클래스와 인스턴스의 필요성

public class MyOOP {
	public static String delimiter = "";

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		//refactor 의 Extract Method기능으로 만듬
		delimiter = "----";
		printA();
		printB();
		
		
		delimiter = "****";
		printA();
		printB();

	}

	private static void printA() {
		System.out.println(delimiter);
		System.out.println("A");
		System.out.println("A");
	}
	
	private static void printB() {
		System.out.println(delimiter);
		System.out.println("B");
		System.out.println("B");
	}

}
