package DivAndCon;

public class Bubblesort {
	
	static void bubbleSort(int[] arr,int size) {
		
		for(int i=0;i<size-1;i++) {
			for(int j=0;j<size-1;j++) {
				
				if(arr[j]>arr[j+1]) {
					int temp = arr[j];
					arr[j] = arr[j+1];
					arr[j+1] = temp;
				}
			}
			for(int a:arr) {
				System.out.print(a+" ");
			}
			System.out.println();
		}
	}
	
	public static void main(String[] args) {
	
		int[] arr = {35, 10, 55, 20, 5 };
		int size = arr.length;
		bubbleSort(arr,size);
	}

}
