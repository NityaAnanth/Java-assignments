package P1;
import java.util.*;
import java.util.Scanner;
public class RichestCust {
	public static void main(String[]args)
	{
	
	int s[][];
	int m,n;
	int e;
	int x=0;
	Scanner scan=new Scanner(System.in);
	System.out.print("Enter no. of rows and columns ");
	m=scan.nextInt();
	n=scan.nextInt();	
	s= new int[m][n];
	
	int max=0;
	System.out.print("Enter elements of the matrix.Note that one row gets filled up first and then moves on to next row ");
	for(int i=0;i<m;i++)
	{for(int j=0;j<n;j++)
	{ e=scan.nextInt();
	s[i][j]=e;
	}
    }
	System.out.print("Analysis :   ");
	for(int i=0;i<m;i++)
	{for(int j=0;j<n;j++)
	{ x=x+s[i][j];
	}
	if(max<x)
	{ max=x;
    }
	x=0;
	
    }
	System.out.print("Richest customer has wealth = "+max);
	
}
}

	