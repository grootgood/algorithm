package algorithm.ch00;

import java.util.Random;

public class RandomArray {

	public static void main(String[] args) {
		Random r = new Random();
				
		int[] numbers = new int[1000];
		
		for(int i=0; i<numbers.length; i++) {
			numbers[i] = r.nextInt(101);
			System.out.println(i +":" + numbers[i]);
		}
	}
}
