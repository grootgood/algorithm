package algorithm.ch00;

import java.util.Arrays;
import java.util.Scanner;

public class StringEx04 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.print("전화번호를 입력>>");
		String num = sc.nextLine();
		String num2 = num.trim();
		String[] num3 = num2.split("-");
		System.out.println(Arrays.toString(num3));
		System.out.println(num3[1]);
		System.out.println(num3[2]);
		
		if(num3[0].equals("011")) {
			System.out.println("sk");
		}
	}

}
