package demopack2;

import demopack1.A;
import demopack1.B;
import demopack1.C;


public class Maincls 
	{
		public static void main(String argv[])
		{
			System.out.println(A.s1);
			System.out.println("****Loves****");
			A a1 = new A();
			System.out.println(a1.s2);
			System.out.println("**********************************");
			
			System.out.println(B.s3);
			System.out.println("****Loves****");
			B b1 = new B();
			System.out.println(b1.s4);
			System.out.println("**********************************");
			
			System.out.println(C.s5);
			System.out.println("****Loves****");
			C c1 = new C();
			System.out.println(c1.s6);
		}
	}
