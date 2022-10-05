package vo;

public class MemberVO {

	private String id;
	private String name;
	private String tel;
	private String addr;
	
	public MemberVO(String id, String name, String tel, String add) {
		super();
		this.id = id;
		this.name = name;
		this.tel = tel;
		this.addr = add;
	}

	public String getId() {
		return id;
	}

	public void setId(String id) {
		this.id = id;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getTel() {
		return tel;
	}

	public void setTel(String tel) {
		this.tel = tel;
	}

	public String getAddr() {
		return addr;
	}

	@Override
	public String toString() {
		return "MemberVO [id=" + id + ", name=" + name + ", tel=" + tel + ", addr=" + addr + "]";
	}

	public void setAddr(String addr) {
		this.addr = addr;
	}
	
	
	
}
