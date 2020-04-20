package DivAndCon;

import java.util.ArrayList;
import java.util.Scanner;

public class Mergesort {

	static ArrayList<Integer> path = new ArrayList<Integer>();

	public static void mergeSort(int[] arr, int left, int right) {

		if (left < right) {
			int mid = (left + right) / 2;
			mergeSort(arr, left, mid); // sort the first half
			mergeSort(arr, mid + 1, right); // sort the second half
			merge(arr, left, mid, right);
		}
	}

	static void merge(int[] arr, int left, int mid, int right) {

		int l = left;
		int r = mid + 1;
		int count = 0;
		int[] aux = new int[right - left + 1];
		for (int i = left; i <= right; i++) {
			if (r > right) {
				aux[count++] = arr[l++];
			} else if (l > mid) {
				aux[count++] = arr[r++];
			} else if (arr[l] < arr[r]) {
				aux[count++] = arr[l++];
			} else {// left > right
				aux[count++] = arr[r++];
			}
		}//end loop
		for (int i = 0; i < count; i++) {
			arr[left++] = aux[i];
		}
		for (int i = 0; i < arr.length; i++) {
			System.out.print(arr[i] + " ");
		}
		System.out.println();
	}

	public static int binarySearch(int[] arr, int left, int right, int key) {

		if (right >= left) {
			double tempmid = Math.floor(left + (right - left) / 2.0);
			int mid = (int) tempmid;
			if (arr[mid] == key) {
				path.add(arr[mid]);
				return mid;
			}
			if (arr[mid] > key) {
				path.add(arr[mid]);
				return binarySearch(arr, left, mid - 1, key);
			}
			if (arr[mid] < key) {
				path.add(arr[mid]);
				return binarySearch(arr, mid + 1, right, key);
			}
		}
		return -1;
	}

	public static void main(String[] args) {

		Scanner in = new Scanner(System.in);
		System.out.println("Enter Size of the Array: ");
		int n = in.nextInt();
		System.out.println("Enter " + n + " values: ");
		int[] arr = new int[n];
		for (int i = 0; i < arr.length; i++) {
			arr[i] = in.nextInt();
		}

		System.out.println("MERGE SORT");
		mergeSort(arr, 0, n - 1);

		System.out.println("BINARY SEARCH\n" + "Enter Key to be SEARCH: ");
		int key = in.nextInt();

		int result = binarySearch(arr, 0, arr.length-1, key);

		if (result == -1) {
			for (int i : path) {
				System.out.print(i + " ");
			}
			System.out.println(key + " NOT FOUND");
		} else {
			for (int i : path) {
				System.out.print(i + " ");
			}
			System.out.println("FOUND");
		}

	}
}
