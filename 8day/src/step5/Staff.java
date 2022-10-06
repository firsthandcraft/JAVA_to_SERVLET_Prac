package step5;

public class Staff extends Person {
	//구분해주는 변수
	private String job;
	//메소드 만들기
	public void print_job() {
		System.out.println(name+"교직원의 직무는"+job);
	}
	//SETGET 메소드 - job
	public String getJob() {
		return job;
	}
	public void setJob(String job) {
		this.job = job;
	}
	
	
}
