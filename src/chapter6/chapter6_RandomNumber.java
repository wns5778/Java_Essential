package chapter6;

//1���� 3���� ���� 3�� ��Z���� 3���� �������� ���ö����� �ݺ�, �����ϸ� "����"���

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
				System.out.print("����");
				break;
			}

		}
		

	}

}
