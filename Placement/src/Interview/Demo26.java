//WAP to shuffle the elements in the linkedlsit
package Interview;

import java.util.Collections;
import java.util.LinkedList;


public class Demo26 
{
	public static void main(String[] args) 
	{
		LinkedList<String> t1=new LinkedList<String>();
		t1.add("Nani");
		t1.add("Chintu");
		t1.add("Eshu");
		t1.add("sai");
		t1.add("Krishna");
		
		System.out.println(t1);
		System.out.println("*****************");
		Collections.shuffle(t1);
		System.out.println(t1);
	}
}
