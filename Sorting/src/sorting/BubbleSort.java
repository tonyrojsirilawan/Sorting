package sorting;

public class BubbleSort {

	public BubbleSort(int[] list){
		int n = list.length;
		int temp = 0;
		for(int i=0; i < n; i++){
			for(int j=1; j < (n-i); j++){
				if(list[j-1] > list[j]){
					temp = list[j-1];
					list[j-1] = list[j];
					list[j] = temp;
				}
			}
		}
	}
	public static void main (String args[]){
		int list[] = {5, 48, 8, 46, 2, 24, 52, 12};
		System.out.println("List before Bubble Sort");
			
	}
	
}
