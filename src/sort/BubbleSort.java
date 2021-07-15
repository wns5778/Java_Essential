package sort;


//버블정렬

public class BubbleSort {

	public static void main(String[] args) {
		
		int[] array = {1,9,2,8,3,7,4};
		
		System.out.print("버블정렬  ->");
		int temp = 0;
		for(int i=0;i<6;i++) {
			for(int j=0;j<6;j++) {
				if(array[j]>array[j+1]) {
					temp = array[j+1];
					array[j+1] = array[j];
					array[j] = temp;
				}
			}
		}
		for(int s=0; s<7; s++) {
			System.out.print(array[s]+" ");
		}

	}

}
