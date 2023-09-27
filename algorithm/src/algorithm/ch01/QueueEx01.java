package algorithm.ch01;

import java.util.LinkedList;
import java.util.Queue;

public class QueueEx01 {
	public static void main(String[] args) {
		
		LinkedList day = new LinkedList();
		day.add("월요일");
		day.add("화요일");
		day.add("수요일");
		
		System.out.println(day);
		day.remove(1);
		day.add(1,"금요일");
		System.out.println(day);
		
		Queue day2 = new LinkedList();
		day2.offer("월요일");
		day2.offer("화요일");
		day2.offer("수요일");
		
		System.out.println(day2);
		System.out.println(day2.poll()); // 데이터를 꺼내고 확인
		day2.offer("금요일");
		day2.offer("금요일");
		System.out.println(day2.peek()); // 이번에 꺼낼 데이터 확인
		System.out.println(day2);
	}
}
