package step10;// ����

import java.util.ArrayList;
import java.util.Iterator;

public class TestIterator {
public static void main(String[] args) {

     ArrayList list =new ArrayList();
     list.add("�¿�");
     list.add("����");
     list.add("����");
     list.add("Ƽ�Ĵ�");
     list.add("����");
     list.add("ȿ��");
     list.add("���");
     list.add("����");
     list.add("����");
     
     //Collection(������ ����)�� ��ҵ��� �����ϱ� ���� ǥ���� �����ϴ�
     //�������̽� 
     Iterator it = list.iterator();
     
     //������ ������°�
    //���� ��Ұ� �ִ��� true false
     //��Ұ� ���� �Ҷ����� �����Ѵ�.
     //hasNext() �����Ͱ� �ִµ��� true�� ��ȯ
     //�÷��ǿ� ����� �������ǰ��� ��ŭ�� �ݺ��Ѵ�. 
     
     while(it.hasNext()/*������ �������� �Ѿ*/ ) {
    	 System.out.println(it.next());
     }


}}
