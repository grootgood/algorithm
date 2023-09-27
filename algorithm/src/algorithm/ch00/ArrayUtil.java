package algorithm.ch00;

import java.util.Random;

public class ArrayUtil {
	// 최솟값
	static int findMin(int[] arr) {
		int min = arr[0];
		for(int i=0; i<arr.length; i++) {
			if(min > arr[i]) min = arr[i];
		}
		return min;
	}
	
	static int findMax(int[] arr) {
		int max = arr[0];
		for(int i=0; i<arr.length; i++) {
			if(max < arr[i]) max = arr[i];
		}
		return max;
	}
	
	static int countNumber(int[] arr, int n) {
		int count = 0;
		for (int x : arr) {
			if( x == n) {
				count++;
			}
		}
		return count;
	}
	
	static int[] randomArr(int size, int end) { // start가 0인 경우
		return randomArr(size, 0, end);
	}
	
	static int[] randomArr(int size, int start, int end) { // end가 미포함인 경우
		Random r = new Random();
		int[] arr = new int[size];
		
		for(int i=0; i<size; i++) {
			arr[i] = r.nextInt(end-start-1) + start;
			// end는 미포함이기 때문에 -1을 하지 않으면 end는 포함이게 된다.
		}
		
		return arr;
	}
}
