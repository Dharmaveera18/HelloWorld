package com.Pattern_Matching;

public class Up_PyramidStar_Pattern {

	public static void main(String[] args) {


		int row = 4;
		
		for(int i = 0; i < row; i++)
		{
			for(int j=row-i; j>1; j--)
			{
				System.out.print("1");
			}
			
			for(int k= 0 ; k<=i; k++)
			{
				System.out.print("* ");
			}
			
			System.out.println();
		}
		
		
		for(int i = 1; i <=row-1; i++)
		{
			for(int j=0; j<i; j++)
			{
				System.out.print("1");
			}
			
			for(int k= 0 ; k<=row-1-i; k++)
			{
				System.out.print("* ");
			}
			
			System.out.println();
		}

	}

}
