package chapter6;

//1에서 3까지 난수 3개 생Z성뒤 3개가 같은수가 나올때까지 반복, 성공하면 "성공"출력

public class chapter6_RandomNumber {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int array[] = new int[3];
		while(true) {
			for(int i=0;i<3;i++) {
				array[i] = (int)(Math.random()*3+1);
				System.out.print(array[i]);
			}
			System.out.println("");
			if(array[0] == array[1] && array[1]== array[2]) {
				System.out.print("성공");
				break;
			}

		}
		

	}

}
