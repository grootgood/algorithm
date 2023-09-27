package algorithm.ch00;

import java.util.Arrays;
import java.util.List;

public class StringEx03 {
	public static void main(String[] args) {
		String all = "국어, 영어, 수학, 컴퓨터";
		
		String[] arr = all.split(",");
		System.out.println(Arrays.toString(arr));
		
		for(int i=0; i<arr.length; i++) {
			if(arr[i].contains(" ")) {
				arr[i] = arr[i].trim();
				arr[i] = arr[i].replace(" ", "");
			}
		}
		System.out.println("과목수 :"+arr.length);
		System.out.println(Arrays.toString(arr));
		
		for(int i=0; i<arr.length; i++) {
			if(arr[i].equals("컴퓨터")) {
				System.out.println(i);
			}
		}
		
		int count = 0;
		for(int i=0; i<arr.length; i++) {
			if(arr[i].length() < 3) {
				count++;
			}
		}
		System.out.println(count);
		
		List<String> list = Arrays.asList(arr);
		System.out.println(list.indexOf("컴퓨터"));
	}
}
