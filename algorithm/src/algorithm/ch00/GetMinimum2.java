package algorithm.ch00;

import java.util.Arrays;
import java.util.Random;

import javax.sound.midi.SysexMessage;

public class GetMinimum2 {

	public static void main(String[] args) {
		int[] s = new int[1000];
		
		Random r = new Random();
		for(int i=0; i<s.length; i++) {
			s[i] = r.nextInt(999)+1; //0~998 -> 1~999
			// r.nextInt(size) + start;
		}
		System.out.println(Arrays.toString(s));
		
		int min = ArrayUtil.findMin(s);
		
		//System.out.println("최소값>>" + min);
	}

}
