package step11;

public class TestConstructor {
public static void main(String[] args) {
	Person p =new Person("아이유");
	
	System.err.println(p.getName());
	p.setName("보아");
	//생성자를 통해 값을 할당하든  set메소드를 통해 할당하든 값은 같다.
	//생성자를 통한 할당과 setmethod를 통한 할당은 결과적으로 동일
	//용도에 있어 차이는?
	//생성자에서 명시한 인자값을 입력하지 않음면 컴파일 에러 즉 객체생성의 
	//조건을 인자값 있는 생성자에서 요구한다. 
	//생성자는 필수적
	//setmethod 는 선택적 또는 정보수정 
	//생성자는 통한 할당- 객체 생성에 필수적 요소
	//setMethod 를 통한 할당 - 선택적인 요소
	System.err.println(p.getName());
}
}
