package com.Pattern_Matching;

public class Pattern_Matching1 {

	public static void main(String[] args) {


		/*
		int n = 5;
		for(int i=0; i<n; i++)
		{
			for(int j = 0; j<n; j++)
			{
				System.out.print("* ");
			}
			System.out.println();
		}
		*/
		
		/*int n = 5;
		for(int i=0; i<n; i++)
		{
			for(int j = 0; j<n; j++)
			{
				if(i==j)
				{
					System.out.print("* ");
				}
				else
				{
					System.out.print("  ");
				}
			}
			System.out.println();
		}
		*/

		/*int n = 5;
		for(int i=0; i<n; i++)
		{
			for(int j = 0; j<n; j++)
			{
				if(i+j == n-1)
				{
					System.out.print("* ");
				}
				else
				{
					System.out.print("  ");
				}
			}
			System.out.println();
		}

		*/
		
		/*
		int n = 5;
		for(int i=0; i<n; i++)
		{
			for(int j = 0; j<n; j++)
			{
				if(i+j <= n-1)
				{
					System.out.print("* ");
				}
				else
				{
					System.out.print("  ");
				}
			}
			System.out.println();
		}*/
		/*
		int n = 5;
		for(int i=0; i<n; i++)
		{
			for(int j = 0; j<n; j++)
			{
				if(i<=j)
				{
					System.out.print("* ");
				}
				else
				{
					System.out.print("  ");
				}
			}
			System.out.println();
		}*/

		int n1 = 4;
		for(int i=0; i<n1; i++)
		{
			
			
			for(int j = 0; j<n1; j++)
			{
				if(i+j >=n1-1)
				{
					System.out.print("* ");
				}
				else
				{
					System.out.print("  ");
				}
			}
			
			for(int j = 1; j<n1; j++)
			{
				if(i>=j)
				{
					System.out.print("* ");
				}
				else
				{
					System.out.print("  ");
				}
			}
			
			
			System.out.println();
		}
		
		
		int n = 4;
		for(int i=1; i<n; i++)
		{
			
			
			for(int j = 0; j<n; j++)
			{
				if(i<=j)
				{
					System.out.print("* ");
				}
				else
				{
					System.out.print("  ");
				}
			}
			
			for(int j = 1; j<n; j++)
			{
				if(i+j<=n-1)
				{
					System.out.print("* ");
				}
				else
				{
					System.out.print("  ");
				}
			}
			
			
			System.out.println();
		}

	}

}
