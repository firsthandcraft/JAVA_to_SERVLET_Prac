package step14;

public class MemberVO {
	//전역변수로 private 설정
	private String id;
	private String password;
	private int money;
	
	
	//설정값 설정후 public
	public MemberVO(String id,String password,int money) {
		this.id=id;
		this.password=password;
		this.money=money;
	}


	//set get 메소드 실행
	public String getId() {
		return id;
	}
	public void setId(String id) {
		this.id = id;
	}


	public String getPassword() {
		return password;
	}
	public void setPassword(String password) {
		this.password = password;
	}


	public int getMoney() {
		return money;
	}
	public void setMoney(int money) {
		this.money = money;
	}




}