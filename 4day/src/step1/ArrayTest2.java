package step1;

import java.util.Scanner;

public class ArrayTest2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//배열에 값넣기
		
		Scanner sc = new Scanner(System.in);
		int i, k,l,m,n,sum=0,average;
		int [] es =new int[4];//30명의 데이터 입력
		
		/*
		System.out.println("Please, Input the English Score of %%d Student : 0");
		k= sc.nextInt();
		es[0]=k;
		System.out.println("Please, Input the English Score of %%d Student : 1");
		l= sc.nextInt();
		es[1]=l;
		System.out.println("Please, Input the English Score of %%d Student : 2");
		m= sc.nextInt();
		es[2]=m;
		System.out.println("Please, Input the English Score of %%d Student : 3");
		n= sc.nextInt();
		es[3]=n;
		for(i=0; i<es.length; i++){
			sum += es[i];
			System.out.println("es["+i+"] :"+sum);
		}
		average = sum/es.length;
		System.out.println("average : "+average);
	*/
		
		//총합
		for(i=0; i<es.length; i++) {
System.out.println("Please, Input the English Score of %%d Student : "+""+i);
			es[i]=sc.nextInt();
			sum+=es[i];
			sum =sum+es[i];
			System.out.println(es[i]);
		}
		average = sum/4;
		System.out.println("average : "+average);
		System.out.println(es[0]);
		System.out.println(es[1]);
		System.out.println(es[2]);
		System.out.println(es[3]);
	}

}
