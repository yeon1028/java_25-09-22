package day05;

public class Array05 {

	public static void main(String[] args) {
		// 10개의 숫자 값을 가지는 배열 생성
		/* 1~50까지의 랜덤 수를 배열에 저장 후 출력
		   최대, 최소, 합계, 평균 출력		 
		 */
		
		int [] arr = new int[10];
		int sum = 0, max = 0, min = 51;
		
		for(int i=0; i<arr.length; i++) {
			arr[i]=(int)(Math.random()*50) + 1;
			sum += arr[i];
			max = Math.max(max, arr[i]);
			min = Math.min(min, arr[i]);
		}
		
		for(int a : arr) {
			System.out.print(a+" ");
		}
		System.out.println();
		System.out.println("최대값은: " + max);
		System.out.println("최소값은: " + min);
		System.out.println("합계는: " + sum);
		System.out.println("평균은: " + ((double)sum/arr.length));
		
	}

}
