package join;

public interface Dao {
	int insertMember(Member m);
	int updateMember(Member m);
	//전에 있는 데이터를 수정은 불러와야한다. 
	int removeMember(String id);
	boolean login(String id, String pwd);
	Member MemberInfo(String id);
	
}
