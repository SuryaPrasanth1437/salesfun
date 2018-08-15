package oops;

import java.util.Scanner;

public class Sales
{
	double s,st,sc,ut;
	public double sale(int s)
	{
		st=s*5/100;
		sc=s*5/100;
		ut=s+st+sc;
		return ut;
	}
	public static void main(String[] args)
	{
		Sales S=new Sales();
		int s2;
		Scanner s1=new Scanner(System.in);
		System.out.println("enter the sales amount");
		s2=s1.nextInt();
		
		double d=S.sale(s2);
		System.out.println("the total is "+d);
		
	}

}
