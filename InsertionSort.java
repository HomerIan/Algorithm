package DivAndCon;

public class InsertionSort {

	static void insertionSort(int[] arr, int size) {
		
			int j;
		for(int i=1;i<size;i++) {
			int temp=arr[i];
			for(j=i-1;j>=0 && temp<arr[j];j--) {
				
				arr[j+1]=arr[j];
			}
			arr[j+1]=temp;
			
			for(int a:arr) {
				System.out.print(a+" ");
			}
			System.out.println();
		}
	}
	
	public static void main(String[] args) {
		
		
		int[] arr = {35, 10, 55, 20, 5 };
		int size = arr.length;
		insertionSort(arr,size);
	}

}
