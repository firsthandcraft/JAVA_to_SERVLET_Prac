package vo;

public class MemberVO {
	//id, name , tel , add
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
	public String getAdd() {
		return addr;
	}
	public void setAdd(String add) {
		this.addr = add;
	}
	@Override
	public String toString() {
		return "MemberVO [id=" + id + ", name=" + name + ", tel=" + tel + ", addr=" + addr + "]";
	}
	
}

