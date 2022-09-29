package step1;

import java.util.Scanner;

public class testprac {

	public static void main(String[] args) {
		int curLine,nLineBlank,nLineStar,line;
		System.out.println("몇줄짜리 마름모인가요? : ");
	
		// 마름모의 상단을 찍습니다. 
		for(curLine=0; curLine < line; curLine++)
		{

			//공백을 기본으로 한줄 띄우는 것에 주의. (보기 좋으라고..)
			for(nLineBlank=curLine; nLineBlank < line; nLineBlank++)
			{
				System.out.print(" ");
			}

			// 별이 찍히는 수 = 현재 라인 * 2 + 1 
			for(nLineStar=0; nLineStar<curLine*2+1; nLineStar++)
			{
				System.out.print("*");
			}
			System.out.print("\n");
		}


		//마름모의 하단을 찍는다. 이것은 위보다 하나 적다. 
		// curline = 1 로서 이미 한줄 찍혀 있는 것으로 계산한다. 
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
