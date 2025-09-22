package day14;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class ListEx02 {

	public static void main(String[] args) {
		/* 숫자를 입력받아서 입력받은 숫자로 list 생성
		   출력 => 전체 합계 출력
		   
		   - ex) 입력 > 74,51,66,98,70,16,90,89,91,28 enter
		   - split "," => String[] ~> 숫자로 변환하여 ArrayList<Integer>
		   - 합계 출력
		 */
		
		Scanner sc = new Scanner(System.in);
		String str = "74,51,66,98,70,16,90,89,91,28";
		
		String[] numbers = str.split(",");
		
		List<Integer> list = new ArrayList<>();
		
		int sum=0;
		for(String num : numbers) {
			int n = Integer.parseInt(num);
			list.add(n);
			sum += n;
		}
		System.out.println(list);
		System.out.println("합계: "+sum);
		
		sc.close();
		
	}

}