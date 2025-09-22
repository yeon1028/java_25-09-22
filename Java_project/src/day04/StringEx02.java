package day04;

public class StringEx02 {

	public static void main(String[] args) {
		/* fileName.suffix
		   1) 파일명과 확장자를 분리하여 출력
		   2) 확장자가 "java"면 자바파일입니다. / 기타파일입니다.  
		 */
		
		String file = "자바의정석.java";
		
		System.out.print("파일명:");
		int index1 = file.indexOf(".");
		String name1 = file.substring(0, index1);
		System.out.println(name1);
		
		System.out.print("확장자명:");
//		int index2 = file.indexOf(".");
		String file2 = file.substring(file.indexOf(".")+1);
		System.out.println(file2);
		if (file2.equals("java")) {
			System.out.println(">> 자바파일입니다.");
		} else {
			System.out.println(">> 기타파일입니다.");
		}
		
		
	}

}
