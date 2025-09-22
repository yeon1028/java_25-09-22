package day06;

import java.util.Scanner;

public class MultiArray03 {

	public static void main(String[] args) {
		// 성적표
		/* 테스트 참가인원 : 3명
		   이름		국어 	영어 	수학 	합계 	평균 	등수 \t
		   홍길동 	 89 	 85		 74 	-- 	 	--  	--
		   김길동 	 89 	 85		 74 	-- 	 	--  	--
		   이길동 	 89 	 85		 74 	-- 	 	--  	--
		 */
		
		Scanner sc = new Scanner(System.in);
		System.out.println("테스트 참가인원 > ");
		int test = sc.nextInt();
		
		String [] names = new String [test];
		int[][] arr = new int[test][3];
		int[] sum = new int[test];
		double[] avg = new double[test];
		int[]ranking = new int[test];
		
		for(int i=0; i<test; i++) {
			System.out.println("이름 입력: ");
			names[i] = sc.next();
			
			for(int j=0; j<arr[i].length; j++) {
				arr[i][j] = (int)(Math.random()*50)+50;
				sum [i] += arr[i][j];
			}
		}
		
		System.out.println("이름\t국어\t영어\t수학\t합계\t평균\t등수\t");
		for(int i=0; i<arr.length; i++) {
			System.out.print(names[i]+"\t");
			for(int j=0; j<arr[i].length; j++) {
				System.out.print(arr[i][j]+"\t");
			}
			
			System.out.print(sum[i]+"\t");
			avg[i] = (double)sum[i]/3.0;
			System.out.printf("%.1f\t", avg[i]);
			
			int rank = 1;
			for(int r=0; r<test; r++) {
				if(sum[i] < sum[r]) {
					rank ++;
				}
			}
			ranking[i] = rank;
			System.out.print(ranking[i]+"\t");
			System.out.println();
		
		}
		
		sc.close();
	}
	
}

