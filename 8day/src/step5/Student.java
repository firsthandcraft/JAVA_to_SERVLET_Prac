package step5;

public class Student extends Person{
	private String[] subject;
	
	public void print_subj() {
		System.out.println(name+"�л��� ��������");
		for(int i =0; i<subject.length;i++) {
			System.out.println("subject"+subject[i]);
		}
	}
	//SETGET�޼ҵ� -subject
	public String[] getSubject() {
		return subject;
	}

	public void setSubject(String[] subject) {
		this.subject = subject;
	}
	
}
