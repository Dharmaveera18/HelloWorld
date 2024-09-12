package com.Pattern_Matching;

public class Pattern {

	public static void main(String[] args) {
		int n1 = 4;
		
		for(int i=0; i<n1; i++)
		{
			for(int j = 0; j<n1; j++)
			{
				if(i+j>=n1-1)
				{
					System.out.print("* ");
				}
				else
				{
					System.out.print(" ");
				}
			}
			System.out.println();
		}

		
		
		for(int i=0; i<n1; i++)
		{
			for(int j = 0; j<n1; j++)
			{
				if(i<=j)
				{
					System.out.print("* ");
				}
				else
				{
					System.out.print(" ");
				}
			}
			System.out.println();
		}

		

		
	}

}
