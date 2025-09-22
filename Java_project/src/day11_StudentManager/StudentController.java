package day11_StudentManager;

import java.util.Scanner;

public class StudentController implements StudentProgram{
	
	String[] code = {"A01", "B01", "C01", "D01", "E01"};
	String[] title = {"java", "DB", "python", "C", "javaScript"};
	String[] date = {"25-09-01 ~ 25-09-30", "25-08-01 ~ 25-08-31", "25-07-01 ~ 25-07-16",
					 "25-10-15 ~ 25-11-01", "25-11-02 ~ 25-11-30"};
	int[] time = {8, 4, 6, 4, 3};
	String[] teacher = {"kim", "lee", "park", "yoon", "choi"};
	String[] hall = {"A 강의실", "B 강의실", "C 강의실", "D 강의실", "E 강의실"};
	
	// 학생을 등록하기 위한 배열 Student[] (내부에 subject[]) 
	private Student[] students = new Student[5];
	private int cnt;

	public int menuPrint(Scanner sc) {
		System.out.println("-- menu --");
		System.out.println("1. 학생 등록 | 2. 학생 리스트 | 3. 학생 검색");
		System.out.println("4. 수강 신청 | 5. 수강 철회 | 6. 종료");
		System.out.println("menu >");
		return sc.nextInt();
	}

	
	@Override
	public void intsertStudent(Scanner sc) {
		System.out.println("1. 학생 등록");
		System.out.println("학번: ");
		int id = sc.nextInt();
		// 학번 중복 불가처리
//		for(int i=0; i<cnt; i++) {
//			if(id[i].getcode()=num) {
//				System.out.println("학번이 중복됩니다.");
//				return;
//			}
//		}
		System.out.println("이름: ");
		String name = sc.next();
		System.out.println("나이: ");
		int age = sc.nextInt();
		System.out.println("전화번호: ");
		String phone = sc.next();
		System.out.println("주소: ");
		String add = sc.next();
		students[cnt] = new Student(id, name, age, phone, add);
		cnt++;
	}

	@Override
	public void printStudent() {
		for(int i = 0; i<cnt; i++) {
			System.out.println((i+1)+". "+students[i]);
		}
	}

	@Override
	public void searchStudent(Scanner sc) {
		System.out.println("검색할 학생 이름: ");
		String name = sc.next();
		
		for(Student s : students) {
			if(s != null && s.getName().equals(name)) {
				//s.toString(); return string
				System.out.println(s);
				return;		
			}			 
		}
		System.out.println("검색한 학생이 없습니다.");
	}

	@Override
	public void insertSubject(Scanner sc) {
		System.out.println("-- 수강신청 --");
		for(int i=0; i<title.length; i++) {
			System.out.println((i+1)+". "+code[i]+") "+title[i]+" / "+date[i]+" / "
								+time[i]+" / "+teacher[i]+" / "+hall[i]);
		}
		
		System.out.println("신청할 과목을 선택하세요 >");
		int subIdx = sc.nextInt();
		if(subIdx <= 0 || subIdx > 5) {
			System.out.println("해당 과목은 존재하지 않습니다.");
			System.out.println("다시 입력해주세요.");
		} else {
			System.out.println(title[subIdx-1]+"과목을 신청했습니다.");			
		}
	}

	@Override
	public void deleteSubject(Scanner sc) {
	}
	
}
