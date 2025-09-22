package day07;

public class MethodEx03 {

	// 1. 배열을 매개변수로 받아 랜덤수를 채워주는 메서드
	// 1-1. 중복제거 메서드
	public int[] random(int[] arr) {
		for(int i=0; i<arr.length; i++) {
			arr[i] = (int)(Math.random()*45)+1;
			for(int j=0; j<i; j++) {
				if(arr[i] == arr[j]) {
					i--;
				}
			}
		}
		return arr;
	}
	
	
	// 2. 배열을 출력하는 메서드 (보너스번호는 마지막에 []안에 오도록)
	public void num(int[] arr) {
		for (int i=0; i<6; i++) {
				System.out.print(arr[i]+" ");				
			} 
		if(arr.length == 7) {
				System.out.println("[" +arr[arr.length-1]+ "]");
			}
		System.out.println();
		}
	
	// 3. 당첨을 확인하는 메서드
	public void result(int[] user, int[] lotto) {
		int count = 0;
		int bonus = 0;
		
		for(int i = 0; i<user.length; i++) {
			for(int j = 0; j<user.length; j++) {
				if(user[i] == lotto[j]) {
					count++;
					break;
				} else if(user[i] == lotto[6]) {
					bonus++;
					break;
				}
			}
		}
		if(count == 6) {
			System.out.println("1등 당첨입니다!!");
		} else if(count == 5 && bonus == 1) {
			System.out.println("2등 당첨입니다!");
		} else if(count == 5) {
			System.out.println("3등 당첨입니다!");
		} else if(count == 4) {
			System.out.println("4등 당첨입니다!");
		} else if(count == 3) {
			System.out.println("3등 당첨입니다!");
		} else {
			System.out.println("꽝! 낙첨입니다.");
		}
	}
	

	public static void main(String[] args) {
		/* 로또 번호 생성
		 * user 번호 :
		   1~45까지 중 6개 번호를 랜덤 생성 (자동)
		 * 당첨 번호 :
		   7개 (+1=보너스 번호)
		   
		 * 당첨 번호와 유저 번호를 비교하여 등수 추출
		   6개 일치 : 1등 (보너스 제외)
		   5개+보너스 일치 : 2등
		   5개 일치 : 3등
		   4개 일치 : 4등
		   3개 일치 : 5등
		   나머지는 꽝
		 */
		
		int[] user = new int[6]; // 사용자번호 배열
		int[] lotto = new int[7]; // 당첨번호 배열
		
		MethodEx03 me3 = new MethodEx03();
		me3.random(user);
		me3.random(lotto);
		
		System.out.print("내 번호: ");
		me3.num(user);
		System.out.print("당첨 번호: ");
		me3.num(lotto);		
		
		System.out.print("당첨 결과: ");
		me3.result(user, lotto);
		
	}

}
