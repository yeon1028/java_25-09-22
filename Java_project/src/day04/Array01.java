package day04;

import java.util.Arrays;

public class Array01 {

	public static void main(String[] args) {
		// 배열 : 같은 타입, 같은 의미를 가지는 변수들을 묶어놓은 집합체 (참조변수)
		/* new 키워드를 통해 생성
		   - 배열 선언 방법
		    * 타입[] 배열명;
		    * 타입 배열명[];	
    
		    * 타입[] 배열명 = new 타입[길이];
		   배열 안의 변수값은 초기화가 자동으로 이루어진다.
		   int[] arr = new int[10]; // 가장 많이 사용하는 방법
		   int[] arr = new int[]{1,2,5,4,7,8,6};
		   int[] arr = {2,5,4,7,8,6}
		   
		   - 배열의 길이는 0이상이어야 한다. (단, -는 허용안됨)
		   - 배열의 index는 0부터 시작
		   - 예) 배열[5] = > 0 1 2 3 4
		   - 배열의 총 길이 => length
		 		
		 */
		
		
		int[] arr1; // null(기본) 선언만 한것
		int[] arr = new int[5]; // ->값이 없기 때문에 기본값인 0이 출력된다
		int[] arr2 = new int[] {1,2,3,4,5};
		int[] arr3 = {10,20,30,40,50};
		System.out.println(arr3[0]);
		System.out.println(arr3[1]);
		System.out.println(arr3[2]);
		System.out.println(arr3[3]);
		System.out.println(arr3[4]);
		
		System.out.println("----------");
		System.out.println(arr[0]);
		System.out.println(arr[1]);
		System.out.println(arr[2]);
		System.out.println(arr[3]);
		System.out.println(arr[4]);
		
		System.out.println("----------");
		// arr배열에 값을 추가
		arr[0] = 100;
		arr[1] = 200;
		arr[2] = 300;
		arr[3] = 400;
		arr[4] = 500;
		System.out.println(arr[0]);
		System.out.println(arr[1]);
		System.out.println(arr[2]);
		System.out.println(arr[3]);
		System.out.println(arr[4]);
		
		System.out.println("----------");
		int[] arr4 = new int[10];
		for(int i=0; i<arr4.length; i++) {
			arr4[i] = i+1;
		}
		// 출력
		for(int a : arr4) {
			System.out.println(a);
		}
		
		System.out.println("----------");
		// int[] arr5를 생성하여 [5]랜덤으로 값 5개를 넣고 출력
		int[] arr5 = new int[5];
		for(int a=0; a<arr5.length; a++) {
			arr5[a] = (int)(Math.random()*10)+1;
		}
		
		// 향상된 for문
		// 번지(index)로 접근이 불가능한 경우에 사용
		// 전체 탐색만 가능
		// 배열의 내부값을 변경하는건 불가능
		
		for(int b : arr5) {
			System.out.println(b);
		}
		
		System.out.println(Arrays.toString(arr5));
		
		

	}

}
