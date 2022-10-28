package main;

import java.util.ArrayList;
import java.util.Scanner;

import board.Board;
import join.Member;
import product.Product;

public class main {
	public static String LoginId="";//전역 변수로 로그인 유지 만들기 
	
	public static void func1(Scanner sc, join.Service service) {
		//로그인 유지->변수 선언 메인에 선언하는 변수는 다 지역변수 전역변수는 없다. 
		int menu = 0;
		String id ="",pwd="";//""공백으로 초기화 null 힙메모리 사용안함
		boolean flag =true, loginFlag=false;
		Member m= null;
		
		
		while(flag) {
			System.out.println("1.회원가입  2.내정보수정  3.로그인  4.로그아웃  5.탈퇴  6.종료");
			menu=sc.nextInt();
			switch(menu) {
			case 1:
				m=new Member();
				System.out.println("아이디 입력");
				m.setId(sc.next());
				System.out.println("비번 입력");
				m.setPwd(sc.next());
				System.out.println("이름 입력");
				m.setName(sc.next());
				System.out.println("이메일 입력");
				m.setEmail(sc.next());

				service.addMember(m);
				break;
			case 2://수정
				if(LoginId.equals("")|| LoginId==null){
					System.out.println("로그인 먼저 하세요");
				} else {
					m = new Member();
					m.setId(LoginId);
					System.out.println("수정 pwd 입력 :");
					m.setPwd(sc.next());
					System.out.println("수정 email 입력 :");
					m.setEmail(sc.next());
					
					service.editMemberInfo(m);
				}
				break;
			case 3:
				System.out.println("아이디 입력 :");
				id= sc.next();
				System.out.println("비번 입력 :");
				pwd= sc.next();
				
				loginFlag=service.login(id, pwd);
				if(loginFlag){
					LoginId=id;
					System.out.println(id+"님 login 성공");
				} else {
					System.out.println("로그인 실패");
				}
				break;
			case 4://로그아웃
				if(LoginId.equals("")|| LoginId==null){
					System.out.println("로그인 먼저 하세요");
				} else {
					LoginId="";
				}
				break;
			case 5://삭제
				if(LoginId.equals("")|| LoginId==null){
					System.out.println("로그인 먼저 하세요");
				} else {
					service.removeMember(LoginId);
				}
				break;
			case 6:
				flag= false;
				break;
			default :
				System.out.println("1-6까지번호만입력");;
			}
		}
		
	}//매개변수를 집어 넣을것 
	public static void func2(Scanner sc, board.Service service) {
		int menu = 0 ,num=0;
		String title="";
		boolean flag =true;
		Board b= null;
		
		
		while(flag) {
			System.out.println("1.글쓰기  2.글번호 검색  3.글 수정 4.글 삭제  5.전체보기  6.종료");
			menu=sc.nextInt();
			switch(menu) {
			case 1:
				b=new Board();
				
				b.getNumber();
				if(LoginId.equals("")|| LoginId==null){
					System.out.println("로그인 먼저 하세요");
				} else {
//					b= new Board();
					b.setWriter(LoginId);
					System.out.println("글 비밀번호 :");
					b.setPwd(sc.next());
					System.out.println("글 제목 :");
					b.setTitle(sc.next());
					System.out.println("글 내용 :");
					b.setContent(sc.next());
					service.write(b);
				}
				break;
			case 2://검색
				if(LoginId.equals("")|| LoginId==null){
					System.out.println("로그인 먼저 하세요");
				} else {
					b=new Board();
					System.out.println("글 비밀번호 :");
					title=sc.next();
					b=service.getArticle(title);
					if(b==null) {
						System.out.println("없다 글번호가");
					} else {
						System.out.println(b);
					}
				}
				
				break;
			case 3://수정
				if(LoginId.equals("")|| LoginId==null){
					System.out.println("로그인 먼저 하세요");
				} else {
					b=new Board();
					System.out.println("글 번호 :");
					//
					b.setNumber(sc.nextInt());
					System.out.println("새글 비밀번호 :");
					b.setPwd(sc.next());
					System.out.println("새제목 :");
					sc.nextLine();
					b.setTitle(sc.nextLine());
					System.out.println("새내용 :");
					b.setContent(sc.next());
					if(b==null) {System.out.println("없다 글번호가");}
					else {
						System.out.println(b);
					}
					service.editArticle(b);
				}
				break;
			case 4://로그아웃
				if(LoginId.equals("")|| LoginId==null){
					System.out.println("로그인 먼저 하세요");
				} else {
					System.out.println("글번호");
					num=sc.nextInt();
					service.delArticle(num);
				}
				break;
			case 5://삭제
				ArrayList<Board>list=(ArrayList<Board>)service.getArticles();
				for(int i=0; i<list.size();i++) {
					System.out.println(list.get(i));
				}
				break;
				
			case 6:
				flag= false;
				break;
			default :
				System.out.println("1-6까지번호만입력");;
			}
		}
	}
	public static void func3(Scanner sc, product.Service service) {
		int menu = 0 ,num=0;
		String name="";
		boolean flag =true;
		Product p= null;
		
		
		while(flag) {
			System.out.println("1.제품 등록  2.넘버검색 3.이름검색 4.전체 출력  5.수정  6.삭제  7.종료");
			menu=sc.nextInt();
			switch(menu) {
			case 1:
				p=new Product();
				if(LoginId.equals("")|| LoginId==null){
					System.out.println("로그인 먼저 하세요");
				} else {
					p= new Product();
					p.setName(LoginId);
					System.out.println("제품가격 :");
					p.setPrice(sc.nextInt());
					System.out.println(" 제품 갯수:");
					p.setQuantity(sc.nextInt());
					System.out.println("제품아이디 :");
					p.setId(sc.next());
				}
				service.addProduct(p); 

				break;
			case 2://넘버 검색
				if(LoginId.equals("")|| LoginId==null){
					System.out.println("로그인 먼저 하세요");
				} else {
					p= new Product();
					System.out.println("product number :");
					num=sc.nextInt();
					p=service.getByNum(num);
					if(p==null) {
						System.out.println("없다 제품이");
					} else {
						System.out.println(p);
					}
				}

				break;
			case 3://이름검색
				if(LoginId.equals("")|| LoginId==null){
					System.out.println("로그인 먼저 하세요");
				} else {
					p= new Product();
					System.out.println("product name :");
					name=sc.next();
					p=service.getByName(name);
					if(p==null) {
						System.out.println("없다 제품이");
					} else {
						System.out.println(p);
					}
				}
				break;
			case 4://전출
				if(LoginId.equals("")|| LoginId==null){
				System.out.println("로그인 먼저 하세요");
			} else {
				service.getAll();}
			case 5://수정
				if(LoginId.equals("")|| LoginId==null){
					System.out.println("로그인 먼저 하세요");
				} else {
					p=new Product();
					System.out.println("제품번호 :");
					p.setNum(sc.nextInt());
					System.out.println("제품 이름 :");
					p.setName(sc.next());
					System.out.println("제품 가격 :");
					sc.nextLine();
					p.setQuantity(sc.nextInt());
					System.out.println("제품 수 :");
					p.setNum(sc.nextInt());
					if(p==null) {System.out.println("없다 제품이 ");}
					else {
						System.out.println(p);
					}
					service.editProduct(p);
				}
				break;
			case 6://삭제
				if(LoginId.equals("")|| LoginId==null){
					System.out.println("로그인 먼저 하세요");
				} else {
					ArrayList<Product>list=(ArrayList<Product>)service.getAll();
					for(int i=0; i<list.size();i++) {
						System.out.println(list.get(i));
					}
				}
				service.delProduct(num);
				break;
			case 7:
				flag= false;
				break;
			default :
				System.out.println("1-6까지번호만입력");;
			}
		}
	}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
	Scanner sc= new Scanner(System.in);
	join.Service joinService= new join.ServiceImpl();
	board.Service boardService=  new board.ServiceImpl();
	product.Service productService=  new product.ServiceImpl();
	int menu =0;
	boolean flag= true;
	
	while(flag) {
		System.out.println("1.회원관리  2.게시판  3.창고 4. 종료");
		menu=sc.nextInt();
		switch(menu) {
		case 1:
			func1(sc,joinService);
			break;
		case 2:
			func2(sc, boardService);
			break;
		case 3:
			func3(sc, productService);
			break;
		case 4:
			flag=false;
			break;
		default :
			System.out.println("1-6까지번호만입력");;
		}
	}
	
}}
