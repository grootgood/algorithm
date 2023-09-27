package algorithm.ch01;

import java.util.ArrayList;

public class ArrayListEx03 {
	public static void main(String[] args) {
		
		ArrayList list = new ArrayList(); // 참조형 변수
		
		list.add("홍길동");
		list.add(100);
		list.add(11.2);
		list.add(true);
		
		System.out.println(list);
		System.out.println(list.get(0));
		System.out.println(list.get(1));
		System.out.println(list.get(2));
		System.out.println(list.get(3));
		
		// 중간에 삽입
		list.add(0, "김길동");
		System.out.println(list);
		
		// 제거
		list.remove(0); 
		System.out.println(list);
		
		//변경
		list.set(0, "정길동");
		System.out.println(list);
		
		int index = list.indexOf(true);
		System.out.println(index);
		
		boolean result = list.contains(11.6);
		System.out.println(result);
		
		ArrayList list2 = new ArrayList();
		
		list2.add("ironman");
		list2.add("captin");
		list.addAll(list2);
		System.out.println(list);
		
		System.out.println(list2.isEmpty());
		list2.clear(); // list2 내용 전체 삭제
		System.out.println(list2);
		System.out.println(list2.isEmpty());
	}
}
