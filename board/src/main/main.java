package main;

import java.util.ArrayList;
import java.util.Scanner;

import board.Board;
import join.Member;
import product.Product;

public class main {
	public static String LoginId="";//���� ������ �α��� ���� ����� 
	
	public static void func1(Scanner sc, join.Service service) {
		//�α��� ����->���� ���� ���ο� �����ϴ� ������ �� �������� ���������� ����. 
		int menu = 0;
		String id ="",pwd="";//""�������� �ʱ�ȭ null ���޸� ������
		boolean flag =true, loginFlag=false;
		Member m= null;
		
		
		while(flag) {
			System.out.println("1.ȸ������  2.����������  3.�α���  4.�α׾ƿ�  5.Ż��  6.����");
			menu=sc.nextInt();
			switch(menu) {
			case 1:
				m=new Member();
				System.out.println("���̵� �Է�");
				m.setId(sc.next());
				System.out.println("��� �Է�");
				m.setPwd(sc.next());
				System.out.println("�̸� �Է�");
				m.setName(sc.next());
				System.out.println("�̸��� �Է�");
				m.setEmail(sc.next());

				service.addMember(m);
				break;
			case 2://����
				if(LoginId.equals("")|| LoginId==null){
					System.out.println("�α��� ���� �ϼ���");
				} else {
					m = new Member();
					m.setId(LoginId);
					System.out.println("���� pwd �Է� :");
					m.setPwd(sc.next());
					System.out.println("���� email �Է� :");
					m.setEmail(sc.next());
					
					service.editMemberInfo(m);
				}
				break;
			case 3:
				System.out.println("���̵� �Է� :");
				id= sc.next();
				System.out.println("��� �Է� :");
				pwd= sc.next();
				
				loginFlag=service.login(id, pwd);
				if(loginFlag){
					LoginId=id;
					System.out.println(id+"�� login ����");
				} else {
					System.out.println("�α��� ����");
				}
				break;
			case 4://�α׾ƿ�
				if(LoginId.equals("")|| LoginId==null){
					System.out.println("�α��� ���� �ϼ���");
				} else {
					LoginId="";
				}
				break;
			case 5://����
				if(LoginId.equals("")|| LoginId==null){
					System.out.println("�α��� ���� �ϼ���");
				} else {
					service.removeMember(LoginId);
				}
				break;
			case 6:
				flag= false;
				break;
			default :
				System.out.println("1-6������ȣ���Է�");;
			}
		}
		
	}//�Ű������� ���� ������ 
	public static void func2(Scanner sc, board.Service service) {
		int menu = 0 ,num=0;
		String title="";
		boolean flag =true;
		Board b= null;
		
		
		while(flag) {
			System.out.println("1.�۾���  2.�۹�ȣ �˻�  3.�� ���� 4.�� ����  5.��ü����  6.����");
			menu=sc.nextInt();
			switch(menu) {
			case 1:
				b=new Board();
				
				b.getNumber();
				if(LoginId.equals("")|| LoginId==null){
					System.out.println("�α��� ���� �ϼ���");
				} else {
//					b= new Board();
					b.setWriter(LoginId);
					System.out.println("�� ��й�ȣ :");
					b.setPwd(sc.next());
					System.out.println("�� ���� :");
					b.setTitle(sc.next());
					System.out.println("�� ���� :");
					b.setContent(sc.next());
					service.write(b);
				}
				break;
			case 2://�˻�
				if(LoginId.equals("")|| LoginId==null){
					System.out.println("�α��� ���� �ϼ���");
				} else {
					b=new Board();
					System.out.println("�� ��й�ȣ :");
					title=sc.next();
					b=service.getArticle(title);
					if(b==null) {
						System.out.println("���� �۹�ȣ��");
					} else {
						System.out.println(b);
					}
				}
				
				break;
			case 3://����
				if(LoginId.equals("")|| LoginId==null){
					System.out.println("�α��� ���� �ϼ���");
				} else {
					b=new Board();
					System.out.println("�� ��ȣ :");
					//
					b.setNumber(sc.nextInt());
					System.out.println("���� ��й�ȣ :");
					b.setPwd(sc.next());
					System.out.println("������ :");
					sc.nextLine();
					b.setTitle(sc.nextLine());
					System.out.println("������ :");
					b.setContent(sc.next());
					if(b==null) {System.out.println("���� �۹�ȣ��");}
					else {
						System.out.println(b);
					}
					service.editArticle(b);
				}
				break;
			case 4://�α׾ƿ�
				if(LoginId.equals("")|| LoginId==null){
					System.out.println("�α��� ���� �ϼ���");
				} else {
					System.out.println("�۹�ȣ");
					num=sc.nextInt();
					service.delArticle(num);
				}
				break;
			case 5://����
				ArrayList<Board>list=(ArrayList<Board>)service.getArticles();
				for(int i=0; i<list.size();i++) {
					System.out.println(list.get(i));
				}
				break;
				
			case 6:
				flag= false;
				break;
			default :
				System.out.println("1-6������ȣ���Է�");;
			}
		}
	}
	public static void func3(Scanner sc, product.Service service) {
		int menu = 0 ,num=0;
		String name="";
		boolean flag =true;
		Product p= null;
		
		
		while(flag) {
			System.out.println("1.��ǰ ���  2.�ѹ��˻� 3.�̸��˻� 4.��ü ���  5.����  6.����  7.����");
			menu=sc.nextInt();
			switch(menu) {
			case 1:
				p=new Product();
				if(LoginId.equals("")|| LoginId==null){
					System.out.println("�α��� ���� �ϼ���");
				} else {
					p= new Product();
					p.setName(LoginId);
					System.out.println("��ǰ���� :");
					p.setPrice(sc.nextInt());
					System.out.println(" ��ǰ ����:");
					p.setQuantity(sc.nextInt());
					System.out.println("��ǰ���̵� :");
					p.setId(sc.next());
				}
				service.addProduct(p); 

				break;
			case 2://�ѹ� �˻�
				if(LoginId.equals("")|| LoginId==null){
					System.out.println("�α��� ���� �ϼ���");
				} else {
					p= new Product();
					System.out.println("product number :");
					num=sc.nextInt();
					p=service.getByNum(num);
					if(p==null) {
						System.out.println("���� ��ǰ��");
					} else {
						System.out.println(p);
					}
				}

				break;
			case 3://�̸��˻�
				if(LoginId.equals("")|| LoginId==null){
					System.out.println("�α��� ���� �ϼ���");
				} else {
					p= new Product();
					System.out.println("product name :");
					name=sc.next();
					p=service.getByName(name);
					if(p==null) {
						System.out.println("���� ��ǰ��");
					} else {
						System.out.println(p);
					}
				}
				break;
			case 4://����
				if(LoginId.equals("")|| LoginId==null){
				System.out.println("�α��� ���� �ϼ���");
			} else {
				service.getAll();}
			case 5://����
				if(LoginId.equals("")|| LoginId==null){
					System.out.println("�α��� ���� �ϼ���");
				} else {
					p=new Product();
					System.out.println("��ǰ��ȣ :");
					p.setNum(sc.nextInt());
					System.out.println("��ǰ �̸� :");
					p.setName(sc.next());
					System.out.println("��ǰ ���� :");
					sc.nextLine();
					p.setQuantity(sc.nextInt());
					System.out.println("��ǰ �� :");
					p.setNum(sc.nextInt());
					if(p==null) {System.out.println("���� ��ǰ�� ");}
					else {
						System.out.println(p);
					}
					service.editProduct(p);
				}
				break;
			case 6://����
				if(LoginId.equals("")|| LoginId==null){
					System.out.println("�α��� ���� �ϼ���");
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
				System.out.println("1-6������ȣ���Է�");;
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
		System.out.println("1.ȸ������  2.�Խ���  3.â�� 4. ����");
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
			System.out.println("1-6������ȣ���Է�");;
		}
	}
	
}}
