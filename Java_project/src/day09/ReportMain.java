package day09;

//import java.text.DecimalFormat;
import java.util.Scanner;

public class ReportMain {

	public static void main(String[] args) {
		// 레포트 배열
		// 데이터 스캐너로 받기
		// 순위 계산
		
		Scanner sc = new Scanner(System.in);
		System.out.println("테스트 참가인원: ");
		int mem = sc.nextInt();
		Report[] report = new Report[mem];
		
		for(int i=0; i<mem; i++) {
			System.out.println("이름 / 국어 / 영어 / 수학 순으로 입력해주세요.");
			String name = sc.next();
			int kor = sc.nextInt();
			int eng = sc.nextInt();
			int math = sc.nextInt();
			Report r = new Report(name, kor, eng, math);
			r.cal();
			report[i] = r;
		}
		
		// 순위 계산
		int rank = 1;
		for(int i=0; i<mem; i++) {
			for(int j=0; j<mem; j++) {
				if(report[i].getSum() < report[j].getSum()) {
					rank++; 
				}
			}
			report[i].setRank(rank);
		}
		
		System.out.println("이름\t국어\t영어\t수학\t합계\t평균\t등수");
		for(Report r : report) {
			System.out.println(r);
		}
		
		sc.close();
		
	}

}


/* 
< printf 없이 소숫점 나타내는 방법 >
DecimalFormat df = new DecimalFormat("##.00");
double a = 3;
System.out.println(df.format(a));
*/

