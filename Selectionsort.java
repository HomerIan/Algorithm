package DivAndCon;

public class Selectionsort {

	static void selectionSort(int[] arr,int size) {
		
		for(int i=0;i<size-1;i++) {
			int min = arr[i];
			int index=i;
			for(int j=i+1;j<size;j++) {
				if(min>arr[j]) {
					
					min = arr[j];//value of min. value
					index=j;//position in array of min value
				}
			}
			arr[index]=arr[i];
			arr[i]=min;
			
			for(int a:arr) {
				System.out.print(a+" ");
			}
			System.out.println();
		}
	}
	
	public static void main(String[] args) {
	
		int[] arr = {35, 10, 55, 20, 5 };
		int size = arr.length;
		selectionSort(arr,size);
	}

}
