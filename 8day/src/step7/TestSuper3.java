package step7;
	class Animal{
		int age =1;
		private String card="카드";
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
			System.out.println(super.age);//super부모를 가리킨다. 
			System.out.println(super.getCard());//get메소드도 접근가능
			
		}
	}
public class TestSuper3 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Person p = new Person();
		p.info();//1 출력 //카드 출력
	}

}
