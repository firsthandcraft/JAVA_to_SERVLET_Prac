package step5;

public class Student extends Person{
	private String[] subject;
	
	public void print_subj() {
		System.out.println(name+"학생의 개설과목");
		for(int i =0; i<subject.length;i++) {
			System.out.println("subject"+subject[i]);
		}
	}
	//SETGET메소드 -subject
	public String[] getSubject() {
		return subject;
	}

	public void setSubject(String[] subject) {
		this.subject = subject;
	}
	
}
