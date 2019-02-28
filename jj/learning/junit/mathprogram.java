package jj.learning.junit;

public class mathprogram {


	public int addInt(int a , int b )
	{
		return a+b;
    }
	
	
	public int multInt(int a , int b )
	{
		return a*b;
	}
	
	public int divInt(int a , int b )
	{
		return a/b;
	}
	
	public static void main (String args[]) {
		
		mathprogram mp=new mathprogram();
		System.out.println(mp.addInt(10, 5));
		System.out.println(mp.multInt(13, 4));
	}
}

