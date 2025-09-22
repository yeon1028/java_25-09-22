package day17;

// 문서 상태 enum
enum DocumentStatus{
	DRAFT{

		@Override
		public String geMessage() {
			return "문서가 초안 상태입니다. 수정이 가능합니다.";
		}
		
	}, 
	
	IN_REVIEW{

		@Override
		public String geMessage() {
			return "문서가 검토 중입니다. 수정이 제한됩니다.";
		}
	
	}, 
	
	APPROVED{

		@Override
		public String geMessage() {
			return "문서가 승인되었습니다. 변경할 수 없습니다.";
		}
		
	}, 
	
	REJECTED{

		@Override
		public String geMessage() {
			return "문서가 반려되었습니다. 다시 작성해주세요.";
		}
		
	};
	
	public abstract String geMessage();
	
}



public class EnumEx02 {

	public static void main(String[] args) {
		Document doc = new Document("기획안 초안", DocumentStatus.DRAFT);
		doc.print();
		
		doc.setStatus(DocumentStatus.IN_REVIEW);
		doc.print();
		doc.setStatus(DocumentStatus.APPROVED);
		doc.print();
		doc.setStatus(DocumentStatus.REJECTED);
		doc.print();
		
	}

}

// 문서 클래스
class Document{
	private String title;
	private DocumentStatus status;
	
	public Document(String title, DocumentStatus documentStatus) {
		this.title = title;
		this.status = documentStatus;
	}
	
	
	public void setStatus(DocumentStatus status) {
		this.status = status;
	}


	public void print() {
		System.out.println("["+title+"] 상태: "+status);
		System.out.println("-> " + status.geMessage());
	}
	
}