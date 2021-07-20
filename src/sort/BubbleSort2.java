package sort;


//문자열 버블정렬

public class BubbleSort2 {

	public static void main(String[] args) {
		
		char[] array = {'B','C','A','D','E'};
		System.out.print("버블정렬  ->");
		char temp;
		for(int i=0;i<4;i++) {
			for(int j=0;j<4;j++) {
				if(array[j]>array[j+1]) {
					temp = array[j+1];
					array[j+1] = array[j];
					array[j] = temp;
				}
			}
		}
		for(int s=0; s<5; s++) {
			System.out.print(array[s]+" ");
		}

	}

}