//LinkedList act as a both list and que
package Collections;

import java.util.LinkedList;
import java.util.Queue;

public class Demo2 
{
	public static void main(String[] args) 
	{
		Queue<Integer> q1= new LinkedList<Integer>();
		q1.add(1);
		q1.add(2);
		q1.add(3);
		q1.add(4);
		q1.add(5);
		while(q1.peek()!=null)
		{
			System.out.println(q1.poll());
		}
	}
}
