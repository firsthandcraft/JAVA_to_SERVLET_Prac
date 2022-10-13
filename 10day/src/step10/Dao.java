package step10;

public interface Dao {
	void connect();
	void addPerson(MemberVo p);
	void printAll();
	MemberVo findPerson(String name);
	
	
}
