package sort;

//선택정렬

class Select_Sort{
	int min = 0;
	int min_position = 0;
	int temp = 0;
	
	public void select(int array[]){
		for(int i=0;i<6;i++) {
			min = array[i];
			min_position = i;
			for(int j=i+1;j<7;j++) {
				if(array[j] < min) {
					min = array[j];
					min_position = j;
				}
			}
			temp = array[i];
			array[i] = min;
			array[min_position] = temp;
			
			
		}
		for(int s=0; s<7; s++) {
			System.out.print(array[s]+" ");
		}
		
	}
	
	

	
}

public class SelectionSort {

	public static void main(String[] args) {
		
		int[] array = {1,9,2,8,3,7,4};
		
		System.out.print("선택정렬 -> ");
		Select_Sort ss = new Select_Sort();
		ss.select(array);
	}
	}

