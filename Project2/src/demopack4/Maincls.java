package demopack4;

import demopack2.B;
import demopack3.C;
import package4.E;

public class Maincls 
{
	public static void main(String argv[])
	{
		
		System.out.println(B.k);
		System.out.println(C.m);
		System.out.println(E.p);
		
		
		B b1=new B();
		System.out.println(b1.l);
		
		C c1=new C();
		System.out.println(c1.n);
		
		E a1=new E();
		System.out.println(a1.q);
	}
}
