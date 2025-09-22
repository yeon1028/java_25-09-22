package day09;

import java.util.Scanner;

public class StudentMain {

	public static void main(String[] args) {
		/* ex) 홍길동, 010-1111-1111, 010101, 25
		 * 	   KOREAIT, 강남
		 *     java,	2025-08-01~2025-08-30
		 *     웹개발국비,	2025-08-26~2026-02-14
		 *     DB,		2025-09-15~2025-10-15
		 */
		
		Scanner sc = new Scanner(System.in);

		// 기본 Student[5] 더 추가되면 배열복사
		Student[] student = new Student[5];
		
		String[] gigum = {"강남", "신촌", "인천", "대전", "수원"};
		String[] subjectName = {"java", "DB", "javaScript", "python", "C", "웹국기"};
		String[] subjectDate = {"2025-08-01~2025-08-30", "2025-09-15~2025-10-15", "2025-07-01~0205-07-31","2025-10-01~2025-10-31",
				"2025-09-01~2025-09-31" ,"2025-08-26~2026-02-14"};
		
		System.out.println("학생명: ");
		String name = sc.next();
		System.out.println("전화번호: ");
		String phone = sc.next();
		Student s = new Student(name, phone);
		
		System.out.println("-- 지점 선택 --");
		int gIdx = 0;
		for(String g : gigum) {
			gIdx++;
			System.out.println(gIdx+"."+g+" ");
		}
		System.out.println();
		System.out.println("지점 >> ");
		int gigumIdx = sc.nextInt();
		s.setBranch(gigum[gigumIdx-1]);
		
		System.out.println();
		System.out.println("-- 과목 선택 --");
		for(int i=0; i<subjectName.length; i++) {
			System.out.println((i+1)+"."+subjectName[i]+" / "+subjectDate[i]);
		}
		
		System.out.println();
		System.out.println("과목 >>");
		int subjectIdx = sc.nextInt();
		
		s.insertSubject(subjectName[subjectIdx-1], subjectDate[subjectIdx-1]);
		
		student[0] = s;
		student[0].printInfo();
		student[0].printAcademy();
		student[0].printCourse();
		
		student[1] = new Student("kim", "010101", "010-2222-2222", 25, "신촌");
		student[1].insertSubject(subjectName[1], subjectDate[1]);
		student[1].insertSubject(subjectName[0], subjectDate[0]);
		student[1].insertSubject(subjectName[5], subjectDate[5]);
		
		student[2] = new Student("lee", "010103", "010-3333-3333", 25, "인천");
		student[2].insertSubject(subjectName[3], subjectDate[3]);
		student[2].insertSubject(subjectName[0], subjectDate[0]);
		student[2].insertSubject(subjectName[2], subjectDate[2]);
		
		student[3] = new Student("park", "020901", "010-2222-3333", 24, "강남");
		student[3].insertSubject(subjectName[4], subjectDate[4]);
		student[3].insertSubject(subjectName[5], subjectDate[5]);
		
		student[4] = new Student("choi", "030801", "010-2222-2222", 23, "강남");
		
		
//		System.out.println("---- 전체 학생 정보 ----");
//		for(Student tmp : student) {
//			tmp.printInfo();
//			tmp.printAcademy();
//			tmp.printCourse();
//		}
		
		/*
		System.out.println("<< 검색 결과 >>");
		String searchBranch = "강남";
		// 강남 지점 학생 명단 출력
		for(int i =0; i<student.length; i++) {
			if(student[i].getBranch().equals(searchBranch)) {
				student[i].printInfo();
				student[i].printAcademy();
				student[i].printCourse();
			}
		}
		*/
		
		/*
		System.out.println("---------------");
		String searchSubject = "java";
		// java를 수강하고 있는 학생 명단
		System.out.println("-- "+searchSubject+" 수강 학생 목록 --");
		
		int cnt = 0;
		while(cnt<student.length) {
			for(int i=0; i<student[cnt].getCnt(); i++) {
				if(student[cnt].getSubject()[i].equals(searchSubject)) {
					student[cnt].printInfo();
					student[cnt].printAcademy();
					student[cnt].printCourse();					
				}
			}
			cnt++;
		}
		*/
		
		
		// 학생 이름을 입력받아 입력받은 학생의 정보를 출력
		System.out.println();
		System.out.println("검색 학생을 입력해주세요.");
		String searchName = sc.next();
		for(int i = 0; i<student.length; i++) {
			if (student[i].getName().equals(searchName)) {
				student[i].printInfo();		
			}
		}
		
		
//		System.out.println("사용자가 선택한 지점");
//		System.out.println(gigum[gigumIdx-1]);
//		System.out.println("사용자가 선택한 과목");
//		System.out.println(subjectName[subjectIdx-1]+
//				" / "+subjectDate[subjectIdx-1]);
		
		
		
//		System.out.println(student[0]);
//		s.academy();
//		s.lecture(n, p);
		
		sc.close();
	}
	

}
