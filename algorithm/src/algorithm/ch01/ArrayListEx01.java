package algorithm.ch01;

import java.util.ArrayList;
import java.util.HashSet;

public class ArrayListEx01 {
	public static void main(String[] args) {
		// 크기 유동적, 타입도 내마음대로 목록을 만들고 싶은 경우
		ArrayList list = new ArrayList();
		
		list.add("홍길동");
		list.add("홍길동");
		list.add("홍길동");
		list.add(100);
		list.add(100);
		list.add(45.3);
		list.add(true);
		
		HashSet list2 = new HashSet();
		for(int i=0; i<list.size(); i++) {
			list2.add(list.get(i));
		}
		System.out.println(list);
		System.out.println(list.get(3));
		System.out.println(list2);
	}
}
