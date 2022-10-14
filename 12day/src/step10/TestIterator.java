package step10;// 참고

import java.util.ArrayList;
import java.util.Iterator;

public class TestIterator {
public static void main(String[] args) {

     ArrayList list =new ArrayList();
     list.add("태연");
     list.add("서현");
     list.add("제시");
     list.add("티파니");
     list.add("수영");
     list.add("효연");
     list.add("써니");
     list.add("윤아");
     list.add("유리");
     
     //Collection(데이터 집합)안 요소들을 열거하기 위한 표준을 제공하는
     //인터페이스 
     Iterator it = list.iterator();
     
     //하위로 따라오는것
    //다음 요소가 있는지 true false
     //요소가 존재 할때까지 수행한다.
     //hasNext() 데이터가 있는동안 true를 반환
     //컬렉션에 저장된 데이터의개숫 만큼만 반복한다. 
     
     while(it.hasNext()/*있으면 다음으로 넘어감*/ ) {
    	 System.out.println(it.next());
     }


}}
