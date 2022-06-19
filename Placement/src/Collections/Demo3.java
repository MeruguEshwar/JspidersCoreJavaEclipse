//Priority Queus...
package Collections;

import java.util.LinkedList;
import java.util.PriorityQueue;
import java.util.Queue;

public class Demo3 
{
	public static void main(String[] args) 
	{
		PriorityQueue<Integer> q1= new PriorityQueue<Integer>();
		q1.add(5);
		q1.add(2);
		q1.add(3);
		q1.add(1);
		q1.add(4);
		while(q1.peek()!=null)
		{
			System.out.println(q1.poll());
		}
	}
}
