package ��Ȱ�ڵ�;
//Ŭ������ �ν��Ͻ��� �ʿ伺

public class MyOOP {
	public static String delimiter = "";

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		//refactor �� Extract Method������� ����
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
