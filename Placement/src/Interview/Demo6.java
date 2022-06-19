//WAP to create priority queues  and another one in last
package Interview;

import java.util.PriorityQueue;
import java.util.Scanner;

public class Demo6 
{
	public static void main(String[] args) 
	{
		PriorityQueue<String> p1=new PriorityQueue<String>();
		p1.add("Audi");
		p1.add("benz");
		p1.add("ferrari");
		System.out.println(p1);
		
		Scanner scan = new Scanner(System.in);
		System.out.println("Enter new element");
		String ele=scan.next();
		p1.add(ele);
		System.out.println(p1);
	}
}
