package day13;

import java.util.Arrays;

public class Exception06 {

	public static void main(String[] args) {
		System.out.println((int)(Math.random()*5)+10);
		
		int size = 0, start =1, count =0;
		Exception06 ex06 = new Exception06();
		
		// 익셉션이 발생하더라도 그 후 구문이 정상 작동하도록 만들어주는 것이 이유
		try {
			int arr[] = ex06.Array(size, start, count);
			System.out.println(Arrays.toString(arr));
		} catch (Exception e) {
			e.printStackTrace();
		}
		
		System.out.println(1);
		System.out.println(2);

	}
	
	/* size를 입력받아 size의 길이를 가지는 배열을 생성
	 * 랜덤값을 채워 배열을 리턴하는 메서드
	 * 랜덤값의 범위는 start(시작), count(개수)
	   - size가 0보다 작으면 예외 발생
	   - count가 0보다 작으면 예외 발생
	 * 리턴타입 : 배열 => int[]
	 * 매개변수 : int size, int start, int count 
	 */
	
	public int[] Array (int size, int start, int count) {
		if(size <= 0 || count <= 0) {
			throw new RuntimeException("0보다 작을 순 없습니다.");
		}
		
		int arr[] = new int[size];
		for(int i=0; i<arr.length; i++) {
			arr[i] = (int)(Math.random()*count)+start;
		}
		return arr;
		}
	}
