package day05;

import java.util.Scanner;

public class ArrayEx01 {

	public static void main(String[] args) {
		// 파일명을 저장하고 있는 배열이 주어졌을 때
		// 검색어를 입력하면 해당 검색어를 포함하고 있는 파일을 출력
		// 검색 결과 없다면 -> "일치하는 항목이 없습니다." 출력
		// 대소문자 구분없이 검색어 출력
		
		String[] fileName = {
				"이것이자바다.java", "java의정석.java", "Array.txt",
				"array.java", "String.png", "StringMethod.jpg",
				"ArrayMethod.java", "method.png", "javaMethod.jpg"
		};
		
		Scanner sc = new Scanner(System.in);
		
		System.out.println("검색어를 입력하세요: ");
		String file = sc.next();
		
		int a = 0;
		
		for (String search : fileName) {
			if(search.toLowerCase().contains(file)) {
				System.out.println(search);
				a++;
			}
		}
		
		if (a == 0) {
			System.out.println("일치하는 항목이 없습니다.");
		}
		
		sc.close();
		
	}

}
