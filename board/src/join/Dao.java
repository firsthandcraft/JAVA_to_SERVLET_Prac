package join;

public interface Dao {
	int insertMember(Member m);
	int updateMember(Member m);
	//���� �ִ� �����͸� ������ �ҷ��;��Ѵ�. 
	int removeMember(String id);
	boolean login(String id, String pwd);
	Member MemberInfo(String id);
	
}
