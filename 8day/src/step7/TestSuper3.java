package step7;
	class Animal{
		int age =1;
		private String card="ī��";
		//SETGET method
		public int getAge() {
			return age;
		}
		public void setAge(int age) {
			this.age = age;
		}
		public String getCard() {
			return card;
		}
		public void setCard(String card) {
			this.card = card;
		}
		
	}

	class Person extends Animal{
		public void info() {
			System.out.println(super.age);//super�θ� ����Ų��. 
			System.out.println(super.getCard());//get�޼ҵ嵵 ���ٰ���
			
		}
	}
public class TestSuper3 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Person p = new Person();
		p.info();//1 ��� //ī�� ���
	}

}
