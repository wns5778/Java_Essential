package 생활코딩;

import java.io.FileWriter;
import java.io.IOException;

public class OthersOOP {

	public static void main(String[] args) throws IOException {
		
		System.out.println(Math.PI);//math 클래스의  PI출력
		System.out.println(Math.floor(1.8));//소수점 값을 0으로해서 내림
		System.out.println(Math.ceil(1.8));//올림
		
		FileWriter f1 = new FileWriter("data.txt");//Hello와 Java가 들어있는 data.txt파일 생성
		f1.write("Hello");
		f1.write(" Java");
		f1.close();
		
		FileWriter f2 = new FileWriter("data2.txt");//Hello와 Java가 들어있는 data.txt파일 생성
		f2.write("Hello");
		f2.write(" Java2");
		f2.close();


	}

}
