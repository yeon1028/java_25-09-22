package day11_StudentManager;

import java.util.Scanner;

public interface StudentProgram {
	/*
	 * << 메뉴 >>
	   1. 학생 등록
	   2. 학생 리스트 출력 
	   3. 학생 검색(학생정보, 수강정보)
	   4. 수강 신청(한 학생에 대한) (로그인 개념) 
	   5. 수강 철회(한 학생에 대한)
	 */
	
	void intsertStudent(Scanner sc);
	void printStudent();
	void searchStudent(Scanner sc); // scanner 대신 int studentNum
	void insertSubject(Scanner sc); // scanner 대신 int subjectNum
	void deleteSubject(Scanner sc); // scanner 대신 int subjectNum
}

