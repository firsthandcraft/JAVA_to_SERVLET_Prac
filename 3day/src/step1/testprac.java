package step1;

import java.util.Scanner;

public class testprac {

	public static void main(String[] args) {
		int curLine,nLineBlank,nLineStar,line;
		System.out.println("����¥�� �������ΰ���? : ");
	
		// �������� ����� ����ϴ�. 
		for(curLine=0; curLine < line; curLine++)
		{

			//������ �⺻���� ���� ���� �Ϳ� ����. (���� �������..)
			for(nLineBlank=curLine; nLineBlank < line; nLineBlank++)
			{
				System.out.print(" ");
			}

			// ���� ������ �� = ���� ���� * 2 + 1 
			for(nLineStar=0; nLineStar<curLine*2+1; nLineStar++)
			{
				System.out.print("*");
			}
			System.out.print("\n");
		}


		//�������� �ϴ��� ��´�. �̰��� ������ �ϳ� ����. 
		// curline = 1 �μ� �̹� ���� ���� �ִ� ������ ����Ѵ�. 
		for(curLine=1; curLine < line; curLine++)
		{
			for(nLineBlank=curLine; nLineBlank + 1>0; nLineBlank--)
			{
				System.out.print(" ");
			}
			
			for(nLineStar=line*2-1; nLineStar>curLine*2; nLineStar--)
			{
				System.out.print("*");
			}
			System.out.print("\n");
		}
	}

}
