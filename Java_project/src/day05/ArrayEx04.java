package day05;

import java.util.Arrays;

public class ArrayEx04 {

	public static void main(String[] args) {
		// 정수배열 [10] => 1~100까지의 랜덤수 저장 후 출력
		// 오름차순 정렬 후 출력
		
		int [] arr = new int [10];
		//Integer[] arr = new Integer[10]; 
		
		for(int i=0; i<arr.length; i++) {
			arr[i]=(int)(Math.random()*100)+1;
		}
		
		for(int j : arr) {
			System.out.print(j+" ");
		}
		
		System.out.println();
		System.out.println("----------");
		
		 for(int i=0; i<arr.length-1; i++) {
			for(int j=i+1; j<arr.length; j++) {
				if(arr[i] > arr[j]) {
					int a = arr[i];
					arr[i] = arr[j];
					arr[j] = a;
				}
			}
		}
		
		 // Arrays.sort(arr); // 오름차순 정렬
		
		 // 내림차순 정렬방법 => 기본 자료형의 배열로는 불가능 => Object
//		 Arrays.sort(arr, Collections.reverseOrder());
		 
		System.out.println(Arrays.toString(arr));
	}
}
