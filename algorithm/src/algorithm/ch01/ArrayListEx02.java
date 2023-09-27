package algorithm.ch01;

import java.util.ArrayList;

public class ArrayListEx02 {
	public static void main(String[] args) {
		
		ArrayList ski = new ArrayList();
		
		ski.add("박스키");
		ski.add("송스키");
		ski.add("김스키");
		ski.add("정스키");
		System.out.println(ski);
		System.out.println("개수: "+ski.size());
		
		for(int i=0; i<ski.size(); i++) {
			System.out.println(i+1+"등: " +ski.get(i));
		}
		System.out.println("--------");
		//2등 탈락처리
		ski.remove(1);
		
		for(int i=0; i<ski.size(); i++) {
			System.out.println(i+1+"등: " +ski.get(i));
		}
	}
}
