package day04;

public class Array03 {

	public static void main(String[] args) {
		// arr배열의 최대값, 최소값, 합계, 평균 출력
		
		int arr1[] = {74,66,30,54,90,89,91,61,94,32};
		int max = arr1[0];
		int min = arr1[0];
		int sum = 0;
		double ave = 0;
		
		for (int i=0; i<arr1.length; i++) {
			
			max = Math.max(max, arr1[i]);
			min = Math.min(min, arr1[i]);
			
			/*
			if (arr1[i] > max) {
				max = arr1[i];
			} 
			if (arr1[i] < min) {
				min = arr1[i];
			}
			*/
			sum += arr1[i];
			
		}
			ave = (double)sum / arr1.length;
			System.out.println("최대값은: " + max);
			System.out.println("최소값은: " + min);
			System.out.println("합계는: " + sum);
			System.out.println("평균은: " + ave);
			

	}

}
