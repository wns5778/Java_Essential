package ��Ȱ�ڵ�;

import java.io.FileWriter;
import java.io.IOException;

public class OthersOOP {

	public static void main(String[] args) throws IOException {
		
		System.out.println(Math.PI);//math Ŭ������  PI���
		System.out.println(Math.floor(1.8));//�Ҽ��� ���� 0�����ؼ� ����
		System.out.println(Math.ceil(1.8));//�ø�
		
		FileWriter f1 = new FileWriter("data.txt");//Hello�� Java�� ����ִ� data.txt���� ����
		f1.write("Hello");
		f1.write(" Java");
		f1.close();
		
		FileWriter f2 = new FileWriter("data2.txt");//Hello�� Java�� ����ִ� data.txt���� ����
		f2.write("Hello");
		f2.write(" Java2");
		f2.close();


	}

}
