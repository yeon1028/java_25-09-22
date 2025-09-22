package day04;

public class StringEx01 {

	public static void main(String[] args) {
		// 주민등록번호를 참고하여 생년월일, 성별, 나이를 출력
		
		String regNum1 = "990101-1234567"; // 1900년대생 => 1(남) 2(여)
//		String regNum2 = "000101-3456789"; // 2000년대생 => 3(남) 4(여)
		int today = 2025;
		
		System.out.print("생년월일: ");
		int index = regNum1.indexOf("-");
		String birth = regNum1.substring(0, index);
		System.out.println(birth);
		
		String reg = regNum1.substring(index+1, index+2);
		
		System.out.print("성별: ");
		if(reg.equals("1") || reg.equals("3")) {
			System.out.println("남자입니다.");
		} else {
			System.out.println("여자입니다.");
		}  
		
		String year = regNum1.substring(0,2);
		if(reg.equals("1")||reg.equals("2")) {
			year = "19".concat(year);
		} else {
			year = "20".concat(year);
		}
		
		System.out.print("나이: ");
		int num2 = Integer.parseInt(year);
		System.out.println((today - num2)+1);
		
	}

}
