package test001;

import java.util.Scanner;

public class test01 {
 public static void main(String[] args) {
		int arr[] = new int[10];
		Scanner sc = new Scanner(System.in);
		
		for(int i=0; i<arr.length;i++) {
		System.out.println(i + "�ε��� ���� �Է�");
		arr[i] = sc.nextInt();
		}
		
		System.out.println("�迭");
		for(int i=0; i<arr.length;i++) {
			System.out.print(arr[i] + "	");
			}
		System.out.println();
		System.out.println("3�� �����");
		for(int i=0; i<arr.length;i++) {
			if(arr[i]%3==0) {
			System.out.print(arr[i] + "	");
			}
			}
		
		
		sc.close();
			
		}

}
