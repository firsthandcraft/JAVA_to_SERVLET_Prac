package step5;

import java.util.ArrayList;

public class MemberMain {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ArrayList<Member> data = new ArrayList<Member>();
		MemberMenu mm = new MemberMenu();
		mm.menuProcess(data);
		System.out.println(mm);
	}}
