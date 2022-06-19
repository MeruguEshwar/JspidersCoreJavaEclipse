//WAP to swap elements
package Interview;

import java.util.ArrayList;
import java.util.Collections;

public class Demo18 
{
	public static void main(String[] args) 
	{
		ArrayList<String> a1 = new ArrayList<String>();
		a1.add("Java");
		a1.add("J2EE");
		a1.add("SQL");
		a1.add("HTML");
		a1.add("CSS");
		a1.add("JSP");
		
		System.out.println("Elements before swap:"+a1);
		
		Collections.swap(a1, 1, 2);
		
		System.out.println("Aftr swap:"+a1);
	}
}
