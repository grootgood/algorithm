package algorithm.ch01;

import java.util.Arrays;
import java.util.HashSet;
import java.util.Random;
import java.util.Set;

public class HashSetEx02 {

	public static void main(String[] args) {
		Set numbers = new HashSet();
		int[] cards = new int[52];
		Random r = new Random();
		
		// 1~10 범위의 숫자를 랜덤하게 뽑아 numbers를 채워라
		// 단, 숫자는 중복되면 안됨
		int count = 0;
		while(numbers.size()<52) {
			int data = r.nextInt(52)+1;
			if( numbers.add(data)) { // 새로운 숫자이면
				cards[numbers.size()-1] = data;
			};
			count++;
		}
		System.out.println("시도횟수 " +count);
		System.out.println(Arrays.toString(cards));
	}
}
