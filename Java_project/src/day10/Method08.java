package day10;

public class Method08 {
	
	public int sum(int ...num) {
		int result = 0;
		for(int tmp : num) {
			result += tmp;
		}
		return result;
	}

	public static void main(String[] args) {
		/* 가변인자 메서드
		   - 매개변수의 개수가 고정되어 있지 않은 경우에 사용
		 */
		Method08 m8 = new Method08();
		System.out.println(m8.sum(1,2,3,4,5));
		System.out.println(m8.sum(6,8,10,12,14));
	}

}
