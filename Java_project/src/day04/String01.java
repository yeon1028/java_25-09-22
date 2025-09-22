package day04;

public class String01 {

	public static void main(String[] args) {
		// String Class : 문자열을 다루기 위한 클래스 => 기본 자료형이 아님
		// class : 여러가지 기능을 담고 있는 정의서
		/* 클래스타입 객체명 = new 클래스명(생성자);
		  String str = new String();
		 */
		
		String str = "abc def"; // 일반 자료형처럼 사용 가능
		System.out.println(str);
		
		// length : 전체 글자수 (글자의 총 길이)
		System.out.println("-- length --");
		System.out.println(str.length());
		
		// charAt(index) : index 번지에 있는 문자를 반환 -> char
		System.out.println("-- charAt --");
		System.out.println(str.charAt(2));
		
		// substring : 문자열 추출
		System.out.println("-- substring --");
		System.out.println(str.substring(4)); // 4번지부터 끝까지
		System.out.println(str.substring(0, 3)); // 시작 번지는 포함하나 마지막 번지는 포함하지 않음
		
		// equals() : 두 문자가 같은지 비교(대소문자 구분)
		// 같으면 true / 다르면 false
		// 참조 자료형은 == 로 비교하면 주소가 같은지 비교(값이 같은지 비교X)
		System.out.println("-- equals --");
		System.out.println("abc".equals("abc"));
		
		// indexOf() : 문자의 위치(index)를 찾아주는 기능
		// 한 문자열에 같은 단어가 여러개 있으면 처음 일치하는 값만 리턴
		// 찾는 문자가 없으면 -1을 리턴
		System.out.println("-- indexOf --");
		System.out.println(str.indexOf("ab", 3)); // 찾을 시작 위치
		System.out.println(str.lastIndexOf("c")); // 뒤에서부터 
		
		
		System.out.println("----------");
		// email에서 id만 추출해서 출력
		String email = "abc12453@naver.com";
		int index = email.indexOf("@");
		String e = email.substring(0, index);
		System.out.println(e);
		
		System.out.println("----------");
		String mail = email.substring(email.indexOf("@")+1);
		System.out.println(mail);
		
		// str.compareTo(str2) : str, str2를 비교하여 사전 순으로 앞이면 -, 같으면 0, 뒤면 + 값으로 리턴
		// 문자 정렬시 사용
		System.out.println("-- compareTo --");
		System.out.println("b".compareTo("a"));
		
		// contains : 해당 문자를 포함하고 있는지 체크
		System.out.println("-- contains --");
		String file = "Hellojava.html";
		System.out.println(file.contains("java"));
		
		// concat : 이어붙이기 (+ 연결연산자와 같은 의미)
		System.out.println("-- concat --");
		System.out.println("abc".concat(file));
		System.out.println("abc"+file);
		
	}

}
