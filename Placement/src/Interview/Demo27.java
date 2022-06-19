//WAP to insert element in the frt and last position linkedlist
package Interview;

import java.util.LinkedList;

public class Demo27 
{
	public static void main(String[] args) 
	{
		LinkedList<String> t1 = new LinkedList<String>();
		t1.add("Nani");
		t1.add("Chintu");
		t1.add("Eshu");
		t1.add("sai");
		t1.add("Krishna");
		
		System.out.println(t1);
		System.out.println("********Aftr Inserting**********");
		t1.addFirst("HP");
		t1.addLast("Lenovo");
		System.out.println(t1);
	}
}
