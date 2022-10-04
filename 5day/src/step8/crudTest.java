package step8;

public class crudTest {

/* 등록
 * 검색
 * 전체출력
 * 수정
 * 삭제--> 나중에
 * 종료
 * */
	//클래스에서 만들것
	//변수 name. tel addr
	String name;
	String tel;
	String addr;
	
	//메소드 만들기 
	// search 검색
	boolean search(String name) {
		if(name.equals(name)) {
			return true;			
		} else {
			return false;
		}
	}
	//검색할 내용을 출력
	//print  전체출력
	void print() {
		System.out.println(name);
		System.out.println(tel);
		System.out.println(addr);
	}
	
	//edit  수정
	boolean edit(String name, String tel, String addr) {//
		boolean f;
		f =search(name);//f에 name 을 담는다. 
		if(f==true) {
			this.tel = tel;//this 는 전역 변수 에 붙인다. 
			this.addr=addr;
		}
		return f;
		
	}
	
	
}
