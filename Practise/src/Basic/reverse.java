package Basic;

import java.util.Scanner;

public class reverse {
	
		
		public static int lhs(int a,int b)
		{
			int res=((a*a*a)-(b*b*b));
			return res;
		}
		public static int rhs(int a,int b)
		{
			int res=((a*a*a)-(b*b*b)-3*a*b*(a-b));
			return res;
		}
		public static void main(String[] args) {
			
			int lhsres=lhs(2,3);
			int rhsres=rhs(2,3);
			System.out.println(lhsres+" "+rhsres);
	}
}
