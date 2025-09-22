package day09;

import java.text.DecimalFormat;

public class Report {
	
	private String name;
	private int kor;
	private int eng;
	private int math;
	private int sum;
	private double avg;
	private int rank;
	
	
	// 이름		국어		영어		수학		합계		평균		등수
	// 생성자 (이름, 국어, 영어, 수학)
	// 기본 생성자()
	// 합계 평균 계산메서드
	// 출력메서드
	// getter / setter
	
	public Report() {	}
	
	public Report(String name, int kor, int eng, int math) {
		this.name = name;
		this.kor = kor;
		this.eng = eng;
		this.math = math;
	}
	
	public void cal() {
		this.sum = kor+eng+math;
		this.avg = (double)sum / 3;
	}
	
	@Override
	public String toString() {
		DecimalFormat df = new DecimalFormat("##.00");
		return name + "\t" + kor + "\t" + eng + "\t" + math + "\t" + sum + "\t"
				+ df.format(avg) + "\t" + rank;
	}
	
	public int getRank() {
		return rank;
	}

	public void setRank(int rank) {
		this.rank = rank;
	}

	public int getSum() {
		return sum;
	}

	public void setSum(int sum) {
		this.sum = sum;
	}

	public double getAvg() {
		return avg;
	}

	public void setAvg(double avg) {
		this.avg = avg;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public int getKor() {
		return kor;
	}

	public void setKor(int kor) {
		this.kor = kor;
	}

	public int getEng() {
		return eng;
	}

	public void setEng(int eng) {
		this.eng = eng;
	}

	public int getMath() {
		return math;
	}

	public void setMath(int math) {
		this.math = math;
	}

}
