package step5;

public class Staff extends Person {
	//�������ִ� ����
	private String job;
	//�޼ҵ� �����
	public void print_job() {
		System.out.println(name+"�������� ������"+job);
	}
	//SETGET �޼ҵ� - job
	public String getJob() {
		return job;
	}
	public void setJob(String job) {
		this.job = job;
	}
	
	
}
