package step9;

public class TestOverriding3 {
public static void main(String[] args) {
	Student s= new Student("������","100","�Ǳ�","12");
	System.out.println(s.getDetails());
	Teacher t =new Teacher("�迬��","020","����","ü��");
	System.out.println(t.getDetails());
	/*name : ������tel : 100address : �Ǳ�stuId : 12
	name : �迬��tel : 020address : ����subject : ü��	*/

	//toString �� ���� getDetails�۾��� �ʿ����. 
}
}
