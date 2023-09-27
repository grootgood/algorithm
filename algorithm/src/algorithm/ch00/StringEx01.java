package algorithm.ch00;

public class StringEx01 {
	public static void main(String[] args) {
/*		String s = "나는 프로그래머야";
		String ss = "진짜!!";
		
		System.out.println(s + ss); // 스트링 결합
		System.out.println(s.concat(ss)); // 스트링 결합
		System.out.println(s.charAt(0)); // 문자 1글자 추출
		System.out.println(s.endsWith("야")); // 특정한 문자로 끝나는지 확인
		System.out.println(s.startsWith("진")); // 특정한 문자로 시작하는지 확인
		System.out.println(s.substring(3)); // 인덱스 3이후 글자들 모추 추출
		System.out.println(s.contains(ss)); // s에 s2가 포함되어 있는지 확인
		System.out.println(s.lastIndexOf("프")); // s 중 '프'글자의 위치
		System.out.println(s.toUpperCase()); // 대문자로
		System.out.println(s.toLowerCase()); // 소문자로
		System.out.println(s.replace("나", "너")); // 교체
*/		
/*		String s1 = "참좋다";
		String s2 = "진짜좋다";
		System.out.println(s1.equals(s2));
		
		String s3 ="나는 진짜 java programmer";
		System.out.println(s3.substring(6).toUpperCase());
		
		String s4 = "2056521";
		System.out.println(s4.charAt(0));
*/		
		String s5 = " [ 10,20,30,40,50]";
		s5 = s5.replace("[", " ");
		s5 = s5.replace("]", " ");
		s5 = s5.trim();
		System.out.println(s5);
		
		String[] s55 = s5.split(", ");
		int sum = 0;
		for(String x:s55) {
			int x2 = Integer.parseInt(x);
			sum += x2;
		}
		
		System.out.println(sum);

	}
}
