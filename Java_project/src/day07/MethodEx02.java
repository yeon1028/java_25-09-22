package day07;

import java.util.Arrays;

import day06.Method03;

public class MethodEx02 {
	
	// 1. 배열을 받아 배열을 출력하는 메서드
	// 매개변수 : 배열 => int[] arr
	// 리턴타입 : void
	public void arr1(int[] arr) {
		for (int i : arr) {
			System.out.print(i+" ");
		}
		System.out.println();
	}
	
	// 2. 배열을 받아 배열을 오름차순으로 정렬하는 메서드
	// 매개변수 : 배열 => int[] arr
	// 리턴타입 : void	
	public void up(int[] arr) {
		for(int i=0; i<arr.length-1; i++) {
			for(int j=i+1; j<arr.length; j++) {
				if(arr[i] > arr[j]) {
					int k = arr[i];
					arr[i] = arr[j];
					arr[j] = k;
				}
			}
		}
	}
	
	// 3. 배열을 받아 배열의 합계, 평균, 최대, 최소를 출력하는 메서드
	// 매개변수 : 배열 => int[] arr
	// 리턴타입 : void
	public void result(int[] arr) {
		int sum = 0;
		int max = arr[0];
		int min = arr[0];
		
		for (int i=0; i<arr.length; i++) {
			max = Math.max(max, arr[i]);
			min = Math.min(min, arr[i]);
			sum += arr[i];
		}
		System.out.println("합계: "+sum+" / 평균: "+((double)sum/arr.length)+
				" / 최대값: "+max+" / 최소값: "+min);
	}

	public static void main(String[] args) {
				
		// 메서드 생성
		/* 1. 배열을 받아 배열을 출력하는 메서드
		   2. 배열을 받아 해당 배열을 오름차순으로 정렬하는 메서드
		   3. 배열을 받아 해당 배열의 합계, 평균, 최대, 최소를 출력하는 메서드
		 */
		int[] arr = {78,56,96,85,75,42,63,59,65,45,39,97};
		
		MethodEx02 me2 = new MethodEx02();
		System.out.println("-- 배열 출력 --");
		me2.arr1(arr);
		
		System.out.println("-- 오름차순 --");
		me2.up(arr);
		System.out.println(Arrays.toString(arr));
		
		System.out.println("-- 합계, 평균, 최대, 최소 --");
		me2.result(arr);
		
		//makeRandom 메서드 호출 배열 생성 Method06
		// 출력 => 정렬 => 출력
		System.out.println();
		Method06 m6 = new Method06();
		int[] arr2 = m6.makeRandom();
		me2.arr1(arr2);
		me2.up(arr2);
		System.out.println("정렬 후 출력");
		me2.result(arr2);
		
		// day06 패키지에 있는 Method03 클래스 => sum method 호출
		Method03 m3 = new Method03();
		m3.a(10, 20);
		
		
		
		
		
		
	}
}
