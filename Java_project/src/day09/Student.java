package day09;

import java.util.Arrays;

public class Student {
	
	// 학생정보를 관리하기 위한 클래스 생성
	// 학생 기본정보 : 이름, 전화번호, 생년월일, 나이
	// 학원 정보 : 학원명="KOREAIT", 지점
	// 수강 과목 : 수강과목, 기간 --> 여러 과목 수강 가능 [5] / 기간[5]
	
	// 수강과목 추가 -> 메서드가 1번 호출될 때마다 1개의 수강과목 및 기간이 추가
	// 수강과목 취소 -> 메서드가 1번 호출될 때마다 내가 선택한 수강과목이 삭제
	
	// 1. 멤버변수 2. 생성자 3. getter / setter 4. 필요한 일반 메서드
	
	private String name;
	private String phone;
	private String birth;
	private int age;
	
	// 회사명 . 브랜드 . 로고는 바뀔 수 없는 값으로 보통 처리함 : final(상수 처리) => 대문자로 표현
	private final String ACADEMY = "KOREAIT";
	private String branch;
	
	private String[] subject = new String [5]; // 수강과목
	private String[] subdate = new String [5]; // 수강기간
	
	// 멤버변수 안에 배열이 존재한다면 index변수를 사용하는 것이 편리함
	private int cnt;
	
	// 생성자 (오버로딩)
	public Student() {} // 기본생성자
	
	// 전화만 한 사람 / 과목을 설정한 사람
	public Student(String name, String phone) {
		this.name = name;
		this.phone = phone;
	}
	
	public Student(String name, String phone, String branch) {
		// 생성자 호출
		this(name, phone);
		this.branch = branch;
	}
	
	public Student(String name, String birth, String phone, 
			int age, String branch) {
		// 생성자 호출 -> 호출 순서는 앞과 똑같이 해야함
		this(name, phone, branch);
		this.birth = birth;
		this.age = age;
	}

	// 내부확인용
	@Override
	public String toString() {
		return "Student [name=" + name + ", phone=" + phone + ", birth=" + birth + ", age=" + age + ", ACADEMY="
				+ ACADEMY + ", branch=" + branch + ", subject=" + Arrays.toString(subject) + ", subdate="
				+ Arrays.toString(subdate) + ", cnt=" + cnt + "]";
	}
	
	// 출력메서드
	public void printInfo() {
		// 학생의 기본정보 출력 메서드
		System.out.println(" -- 학생 정보 -- ");
		System.out.println("이름: " + name + "(" + age + "세) / " + phone);
	}
	
	public void printAcademy() {
		System.out.println(ACADEMY + "(" + branch + ")");
	}
	public void printCourse() {
		// 수강과목이 없다면 -> 수강과목이 없습니다.
		if(cnt == 0) { 
			System.out.println("수강과목이 없습니다.");
			return;
		}
		// cnt가 있다면 cnt까지만 출력 => 등록되지 않은 null값은 출력 안하기
		for(int i=0; i<cnt; i++) {
			System.out.println(subject[i]+"[" + subdate[i]+"]");
		}
	}
	
	// 수강과목 + 기간 추가 메서드
	// main에서 받은 과목과 기간을 매개변수로 받아 배열에 저장하는 메서드
	// 매개변수 : String subject, String subdate
	public void insertSubject(String subject, String subdate) {
		// 배열이 다 차면 배열을 증가
		// 처음에는 cnt == 0
		if(cnt == this.subject.length) {
			// 배열복사
			String subjectTmp[] = new String[this.subject.length+5];
			String subdateTmp[] = new String[this.subdate.length+5];
			
			// arraycopy
			System.arraycopy(this.subject, 0, subjectTmp, 0, this.subject.length);
			System.arraycopy(this.subdate, 0, subdateTmp, 0, this.subdate.length);
			
			// 기존 배열의 참조변수에 객체를 바꿔치기 (덮어쓰기)
			this.subject = subjectTmp;
			this.subdate = subdateTmp;
		}
		this.subject[cnt] = subject;
		this.subdate[cnt] = subdate;
		cnt++;
	}
	
	
	public String getBranch() {
		return branch;
	}

	public void setBranch(String branch) {
		this.branch = branch;
	}

	public String[] getSubject() {
		return subject;
	}

	public void setSubject(String[] subject) {
		this.subject = subject;
	}

	public String[] getSubdate() {
		return subdate;
	}

	public void setSubdate(String[] subdate) {
		this.subdate = subdate;
	}

	public String getACADEMY() {
		return ACADEMY;
	}

	public int getCnt() {
		return cnt;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getPhone() {
		return phone;
	}

	public void setPhone(String phone) {
		this.phone = phone;
	}

	public String getBirth() {
		return birth;
	}

	public void setBirth(String birth) {
		this.birth = birth;
	}

	public int getAge() {
		return age;
	}

	public void setAge(int age) {
		this.age = age;
	}

}
