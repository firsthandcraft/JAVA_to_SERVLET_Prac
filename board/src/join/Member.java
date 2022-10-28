package join;

/*sql 테이블 만들기 
 * crate table member2(
 * id varchar2(20)primary key,
 * pwd varchar2(20) not null,
 * name varchar2(20),
 * email varchar2(40)
 * );
 * */

public class Member {
	private String id;
	private String pwd;
	private String name;
	private String email;
	
	public Member(String id, String pwd, String name, String email) {
		super();
		this.id = id ;
		this.pwd = pwd;
		this.name = name;
		this.email = email;
	}
	public Member() {
		super();
	}
	public String getId() {
		return id;
	}
	public void setId(String id) {
		this.id = id;
	}
	public String getPwd() {
		return pwd;
	}
	public void setPwd(String pwd) {
		this.pwd = pwd;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getEmail() {
		return email;
	}
	public void setEmail(String email) {
		this.email = email;
	}
	@Override
	public String toString() {
		return "Member [id=" + id + ", pwd=" + pwd + ", name=" + name + ", email=" + email + "]";
	}


}
