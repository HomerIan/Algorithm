package DivAndCon;

public class quicksort {

	static void quickSort(int[] arr, int start, int end) {
		swap(arr,(start+(end-start)/2),start);
		int pIndex = partition(arr,start,end);
		quickSort(arr, start,pIndex-1);
		quickSort(arr,pIndex+1,end);
	}
	static void swap(int[] arr, int index1, int index2) {
        int temp = arr[index1];
        arr[index1] = arr[index2];
        arr[index2] = temp;
	}
	static int partition(int[] arr, int start, int end) {
		int i=start;
		int j=end;
		int pIndex = start, pivot = arr[start];
		while(arr[i]<pivot) {
			i++;
			if(arr[i]>=pivot) {
				swap(arr,i,arr[start]);
			}
		}
		while(arr[j]>pivot) {
			j--;
			if(arr[j]<=pivot) {
				swap(arr,j,arr[start]);
			}
		}
        swap(arr,pIndex,end);
        return pIndex;
	}
	
	public static void main(String[] args) {
		int[] arr = {10, 7, 5, 18, 12, 20, 15};
		int length = arr.length;
		quickSort(arr,0,length-1);
		for(int i=0;i<arr.length;i++) {
			System.out.print(arr[i]+" ");
		}

	}

}
