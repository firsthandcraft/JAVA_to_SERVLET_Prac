package step4;

import java.util.ArrayList;

public class TestArrayList3 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ArrayList<ProductVO> list = new ArrayList<ProductVO>();
		list.add(new ProductVO("아이폰","애플",200));
		list.add(new ProductVO("갤럭시","삼성",300));
		list.add(new ProductVO("넥서스","삼성",400));
		
		System.out.println(list);//[ProductVO [name=아이폰, marker=애플, price=200], ProductVO [name=갤럭시, marker=삼성, price=300], ProductVO [name=넥서스, marker=삼성, price=400]]

		System.out.println("***리스트에서 삼성에서 생산한 제품명 출력***");
		for(int i=0;i<list.size();i++) {
			ProductVO pro =list.get(i);
			if(pro.getMarker().equals("삼성")) {
				System.out.println(pro.getName());
				/*갤럭시
				넥서스*/
			}
		}
		
		System.out.println("***리스트에서 전체 상품의 평균가격***");
		int sum=0;
		for(int i=0;i<list.size();i++) {
			ProductVO vo =list.get(i);
			sum+=vo.getPrice();
			System.out.println(sum/list.size());
			/*66
			166
			300*/
		}

		System.out.println("***지정한 인덱스에 새로운 객체 재할당***");
		list.set(0, new ProductVO("배가","sky",200));
		System.out.println(list);
		//[ProductVO [name=배가, marker=sky, price=200], ProductVO [name=갤럭시, marker=삼성, price=300], ProductVO [name=넥서스, marker=삼성, price=400]]

		System.out.println("***리스트 상품명중 갤로 시작하는 상품정보 이름 출력***");
		for(int i=0;i<list.size();i++) {
			ProductVO vo =list.get(i);
			if(vo.getName().startsWith("갤")) {//startsWith
				System.out.println(vo);
				//ProductVO [name=갤럭시, marker=삼성, price=300]
			}
			
		}
			 
	}}
