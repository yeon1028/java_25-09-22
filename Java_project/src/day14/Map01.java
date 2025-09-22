package day14;

import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;

public class Map01 {

	public static void main(String[] args) {
		// Map : 값을 쌍으로 저장 key / value
		/* - key : 중복 불가능, value : 중복 가능
		   - HashMap을 가장 많이 사용
		 */
		
		Map<String, Integer> map = new HashMap<>();
		
		// put() 으로 추가
		map.put("apple", 2000);
		map.put("banana", 2500);
		map.put("orange", 3000);
		map.put("apple", 2500); // 중복 -> 덮어쓰기
		map.put("peach", 4000);
		map.put("kiwi", 3000);
		
		System.out.println(map);
		
		// list.get(i) / map.get(key) => value 리턴
		System.out.println(map.get("banana"));
		
		// keySet() : 키만 set으로 리턴
		// values() : value만 출력
		System.out.println(map.keySet());
		System.out.println(map.values());
		System.out.println(map.entrySet());

		
		System.out.println("- - - - - - - - - ");
		// map 출력
		// 합계 출력
		int sum = 0;
		for(String s : map.keySet()) {
			// s 는 하나의 key
			int value = map.get(s);
			sum += value;
			System.out.println(s + ": " + map.get(s));
		}
		System.out.println("합계: "+sum);
		
		System.out.println("- - - - - - - - - ");
		// Iterator
		Iterator<String> it = map.keySet().iterator();
		while(it.hasNext()) {
			String key = it.next();
			System.out.println(key + ": " + map.get(key));
		}
		
		System.out.println("- - - - - - - - - ");
		// remove(object)
		System.out.println(map.remove("apple")); // return : value
		
		System.out.println(map.remove("banana", 2500)); // return : boolean
		System.out.println(map);
		System.out.println(map.remove("apple"));
		
		
		
		
		
		
		
		
		
		
	}

}