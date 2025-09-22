package day05;

import java.util.Arrays;

public class ArrayEx03 {

	public static void main(String[] args) {
		// 정수 배열[10] 생성 후 1~10까지 순서대로 저장 후 출력
		// 배열 번지는 0~9까지
		
		// 값을 출력 for Arrays.toString() : 배열을 문자열로 바꿔서 출력
		
		int [] arr = new int[5];
		
		for(int i=0; i<arr.length; i++) {
			arr[i]=i+1;
			System.out.print(arr[i]+"  ");
		} 
		System.out.println();
		System.out.println("----------");
		System.out.println(Arrays.toString(arr));
		
		// 교환에 필요한 랜덤 번지 추출 0~9
		// 섞기
		for(int i=0; i<arr.length; i++) {
			// 교환에 필요한 번지 추출
			int index = (int)(Math.random()*arr.length);
			// 교환
			int tmp = arr[i];
			arr[i] = arr[index];
			arr[index] = tmp;
		} 
		System.out.println("----------");
		System.out.println(Arrays.toString(arr));
		
		// 랜덤으로 정렬된걸 원래대로 정렬
		// 작은 수부터 정렬 => 오름차순
		// 큰 수부터 정렬 => 내림차순
		
		for(int i=0; i<arr.length-1; i++) {
			for(int j=i+1; j<arr.length; j++) {
				if(arr[i] > arr[j]) { // 오름차순
					int tmp = arr[i];
					arr[i] = arr[j];
					arr[j] = tmp;
				}
			}
		}
		System.out.println("----------");
		System.out.println(Arrays.toString(arr));
		
		
		
		
		
	}

}
