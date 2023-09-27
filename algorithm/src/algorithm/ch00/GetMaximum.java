package algorithm.ch00;

import java.util.Arrays;
import java.util.Random;

public class GetMaximum {
	public static void main(String[] args) {
		
		int[] arr = ArrayUtil.randomArr(1000, 1, 1000);
		int max = ArrayUtil.findMax(arr);
		int maxCount = ArrayUtil.countNumber(arr, max);
		
		System.out.println(Arrays.toString(arr));
		System.out.println("최댓값>> " + max);
		
		System.out.printf("최대값은 총 %d번 나왔습니다.", maxCount);
		
		Arrays.sort(arr); // 오름차순 정렬
		System.out.println(Arrays.toString(arr));
		
		int count = 0;
		for(int i=0; i<arr.length; i++) {
			if(arr[i] == max) {
				System.out.println(max + "의 위치값: " + i);
				count++;
			}
		}
	}
}
