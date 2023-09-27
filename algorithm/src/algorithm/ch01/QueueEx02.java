package algorithm.ch01;

import java.util.LinkedList;
import java.util.Queue;

public class QueueEx02 {

	public static void main(String[] args) {
		
		Queue subject = new LinkedList();
		
		subject.add("국어");
		subject.add("수학");
		subject.add("영어");
		subject.add("컴퓨터");
		System.out.println("전체 시험 볼 과목: "+subject);
		
		for(int i=1; i<=subject.size(); i++) {
			System.out.println(i+"일차 시험 본 과목 : "+subject.poll());
			
			if(subject.isEmpty()) {
				System.out.println("모든 시험이 종료되었습니다. 수고했습니다.");
				return;
			}
			System.out.println(i+"일차-남은과목 : "+subject );
		}
	}
}
