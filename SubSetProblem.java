package DivAndCon;

import java.util.ArrayList;
import java.util.Arrays;

public class SubSetProblem {

	static int subset_count =0;
	
	static void printSubset(int subSet[], int size) {
		for(int i=0;i<size;i++) {
			System.out.print(subSet[i]+" ");
		}
		System.out.println();
	}
	
	static int subset_sum(int[] list,int[] subSet,int subSize, int sum,int starting_index,final int TAGET_SUM) {
		
		if(TAGET_SUM == sum) {
			subset_count++;
			printSubset(subSet,subSize);
			if(starting_index < list.length) {
				subset_sum(list,subSet,subSize-1,sum-list[starting_index-1],starting_index, TAGET_SUM);//other subsets
			}
		}else {
			for(int i = starting_index; i<list.length;i++) {//find node in a subset
				subSet[subSize] = list[i];
				subset_sum(list,subSet,subSize+1,sum+list[i],i+1,TAGET_SUM);//check next node
			}
		}
		return subset_count;
	}

	public static void main(String[] args) {
		int[] arr = {10, 7, 5, 18, 12, 20, 15};
		int[] subSet = new int[arr.length];
		int sum = 35;

		int total = subset_sum(arr,subSet,0,0,0,sum);
		System.out.println(total);
		/*
		 * expected output 10,7,18 
		 * 10,5,20 
		 * 5,18.12 
		 * 20,15
		 */
	}

}
