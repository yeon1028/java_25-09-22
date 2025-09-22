package day01;

public class Exam01 {

	public static void main(String[] args) {
		// 카페에 제출
		/* 국어, 영어, 수학점수를 변수로 선언해서 값을 할당.
		 * 합계와 평균을 출력
		 * 예시 - 국어:89, 영어:79, 수학:69
		 * 합계: XXX , 평균: XXX , 결과 :
		 * 조건 선택 연산자를 이용하여 평균이 80점 이상이면 합격, 아니면 불합격
		 */
		
		int kor = 90;
		int eng = 81;
		int math = 67;
		
		int sum = kor + eng + math;
		System.out.println("합계:" + sum);
		
		double average = (kor + eng + math)/3.0;
		// double average = (double)sum / 3; 
		System.out.println("평균:" + average);
		System.out.println("결과:" + (average >= 80? "합격" : "불합격"));

	}

}
