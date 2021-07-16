package sort;
import java.util.Arrays;

//»ğÀÔÁ¤·Ä

class insertsort{
	int standard,i,j;
	void insertion(int array[]) {
		for(i=1; i<7;i++) {
			standard = array[i];
			
			for(j=i-1;j>=0 && array[j] > standard;j--) {
				array[j+1] = array[j];
				
			}
			array[j+1] = standard;
			
			
		}
		System.out.print("»ğÀÔÁ¤·Ä -> ");
		System.out.print(Arrays.toString(array));
	}
}

public class InsertionSort {

	public static void main(String[] args) {
		int[] array = {1,9,2,8,3,7,4};
		insertsort is = new insertsort();
		is.insertion(array);
		
		

	}

}
