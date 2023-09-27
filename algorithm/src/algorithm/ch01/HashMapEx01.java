package algorithm.ch01;

import java.util.HashMap;
import java.util.LinkedHashMap;

public class HashMapEx01 {
	public static void main(String[] args) {
		
		HashMap<Integer, String> map = new LinkedHashMap();
		
		map.put(100, "김데이");
		map.put(200, "김사전");
		map.put(300, "김구조");
		map.put(400, "김자료");
		System.out.println(map);
		
		map.remove(200);
		map.put(300, "김충성");
		
		System.out.println(map);
		
		for(Integer key:map.keySet()) {
			System.out.println(key+"="+map.get(key));
		}
	}
}
