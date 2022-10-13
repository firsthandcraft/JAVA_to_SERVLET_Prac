package step4;

import java.util.ArrayList;

public class TestArrayList3 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ArrayList<ProductVO> list = new ArrayList<ProductVO>();
		list.add(new ProductVO("������","����",200));
		list.add(new ProductVO("������","�Ｚ",300));
		list.add(new ProductVO("�ؼ���","�Ｚ",400));
		
		System.out.println(list);//[ProductVO [name=������, marker=����, price=200], ProductVO [name=������, marker=�Ｚ, price=300], ProductVO [name=�ؼ���, marker=�Ｚ, price=400]]

		System.out.println("***����Ʈ���� �Ｚ���� ������ ��ǰ�� ���***");
		for(int i=0;i<list.size();i++) {
			ProductVO pro =list.get(i);
			if(pro.getMarker().equals("�Ｚ")) {
				System.out.println(pro.getName());
				/*������
				�ؼ���*/
			}
		}
		
		System.out.println("***����Ʈ���� ��ü ��ǰ�� ��հ���***");
		int sum=0;
		for(int i=0;i<list.size();i++) {
			ProductVO vo =list.get(i);
			sum+=vo.getPrice();
			System.out.println(sum/list.size());
			/*66
			166
			300*/
		}

		System.out.println("***������ �ε����� ���ο� ��ü ���Ҵ�***");
		list.set(0, new ProductVO("�谡","sky",200));
		System.out.println(list);
		//[ProductVO [name=�谡, marker=sky, price=200], ProductVO [name=������, marker=�Ｚ, price=300], ProductVO [name=�ؼ���, marker=�Ｚ, price=400]]

		System.out.println("***����Ʈ ��ǰ���� ���� �����ϴ� ��ǰ���� �̸� ���***");
		for(int i=0;i<list.size();i++) {
			ProductVO vo =list.get(i);
			if(vo.getName().startsWith("��")) {//startsWith
				System.out.println(vo);
				//ProductVO [name=������, marker=�Ｚ, price=300]
			}
			
		}
			 
	}}
