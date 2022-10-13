package service;


import java.util.ArrayList;

import vo.MemberVO;


public class MemberService {
	private ArrayList<MemberVO> list = new ArrayList<MemberVO>();

	//메소드 입력
	public void addMemberVO(MemberVO memberVO) {
	
		boolean flag = false;
		System.out.println(memberVO);
		
		for(int i=0;i<list.size();i++) {
			MemberVO Mem =list.get(i);
			System.out.println("Mem"+Mem);
			//
			if(memberVO.getId().equals(Mem.getId())) {
				System.out.println("동일한 id값이 있다.");
				flag=true;
				break;
			} 
		}
		if (flag==false)
			list.add(memberVO);
		else System.out.println("id 중복");
	}
	public void printAll() {
		System.out.println(list);
	}
	
	public MemberVO findMemberVO(String id) {
		MemberVO pro= null;
		for(int i=0;i<list.size();i++) {
			MemberVO pro1 =list.get(i);
			//
			if(id.equals(pro1.getId())) {
				pro=pro1;
			} 
		}
		return pro;
		
	}
	public void deleteMemberVO(String id) {

		for(int i=0;i<list.size();i++) {
			MemberVO pro1 =list.get(i);
			//
			if(id.equals(pro1.getId())) {
				list.remove(i);
			} 
		}
	}
	/*public void delMember(ArrayList<MemberVO>list) {
		String idx = search(id);
		list.remove(idx);
	}*/
	public boolean updateMemberVO(MemberVO memberVO) {
		
		boolean flag = false;
		//System.out.println(memberVO);
		
		for(int i=0;i<list.size();i++) {
			MemberVO Mem =list.get(i);
			System.out.println("Mem"+Mem);
			//
			if(Mem.getId().equals(memberVO.getId())) {
				list.set(i,memberVO);
				flag=true;
				break;
			} 
		}	return flag;
	}
	

}
