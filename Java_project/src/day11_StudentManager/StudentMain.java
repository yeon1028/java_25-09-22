package day11_StudentManager;

import java.util.Scanner;

public class StudentMain {

	public static void main(String[] args) {
		
		Scanner scan = new Scanner(System.in);
		
		StudentController sc = new StudentController();
		
		Subject s = new Subject();
		s.getClass();
		
		
		/* 
		<< 메뉴 >>
		1. 학생 등록 
		2. 학생 리스트 출력 
		3. 학생 검색(학생정보, 수강정보)
		4. 수강 신청(한 학생에 대한) (로그인 개념) 
		5. 수강 철회(한 학생에 대한)
		6. 종료
		*/
		
		int menu = 0;
		do {
			// 컨트롤러에 메서드 추가하기
			// 리턴 int 매개변수(scan)
		
			menu = sc.menuPrint(scan);
			switch(menu) {
			case 1: sc.intsertStudent(scan); break;
			case 2: sc.printStudent(); break;
			case 3: sc.searchStudent(scan); break;
			case 4: sc.insertSubject(scan); break;
			case 5: sc.deleteSubject(scan); break;
			case 6: System.out.println("종료합니다."); break;
			default: System.out.println("잘못된 메뉴입니다.");
			}
			
		}while(menu!=6);
		

		
		
		scan.close();

	}

}
