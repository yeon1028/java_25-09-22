package day05;

public class ArrayEx02 {

	public static void main(String[] args) {
		// 그림 파일만 출력 -> 확장자가 jpg, png
		
		
		String[] fileName = {
				"이것이자바다.java", "java의정석.java", "Array.txt",
				"array.java", "String.png", "StringMethod.jpg",
				"ArrayMethod.java", "method.png", "javaMethod.jpg"
		};
		
		int a = 0;
		
		for (String search : fileName) {
			String s = search.substring(search.lastIndexOf(".")+1);
			if(s.toLowerCase().equals("jpg") || s.toLowerCase().equals("png")) {
				System.out.println(search);
				a++;
			}
		}
		
	}
}
