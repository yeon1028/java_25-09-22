package day13;

public class Exception04 {

	public static void main(String[] args) {
		// 멀티 캐치 구문, 다중 캐치 구문
		/* try{
		   } catch(예외클래스명 객체){
		   } catch(예외클래스명 객체){
		   } catch(예외클래스명 객체){
		   } catch(예외클래스명 객체){
		   }
		   
		   - 예외를 구체적으로 세분화해서 잡고 싶을 때 => 멀티 캐치
		 
		 * Exception : 모든 예외의 최고 조상 => 어떤 예외가 와도 다 캐치(에러는 제외)
		   - 멀티캐치에서 사용하려면 가장 마지막에 사용되어야 함.
		 */
		
		try {
//			int arr[] = null;
//			System.out.println(arr[0]);
			System.out.println(4/0);
			
		} catch (ArithmeticException e) {
			System.out.println("0으로 나누었습니다.");
		} catch (NullPointerException e) {
			System.out.println("객체가 null입니다.");
		} catch (ArrayIndexOutOfBoundsException e) {
			System.out.println("배열의 범위가 넘어갔습니다.");
		} catch (Exception e) {
			// 최고 조상은 가장 마지막에...
			e.printStackTrace();
		}
		
		System.out.println("종료");
		
		
		
		
		
	}

}
