package day13;

public class Exception02 {

	public static void main(String[] args) {
		/* 자주 발생하는 런타임 예외 코드들
		   - ArithmeticException : 0으로 나누었을 때 발생
		   - ArrayIndexOutOfBoundsException : 배열의 범위가 넘어갔을 때 발생
		   - NullPointerException : 객체의 값이 null일 경우 발생
		   - ClassCastException : 다운 캐스팅이 잘못 되었을 경우 발생
		 */
		
//		int arr[] = new int[5]; // 0~4
//		System.out.println(arr[5]);
		
		int arr2[] = null;
		System.out.println(arr2[0]);
		
		
	}

}
