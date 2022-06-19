//Wap to search key in treemap
package Interview;

import java.util.Scanner;
import java.util.TreeMap;

public class Demo13 
{
	public static void main(String[] args) 
	{
		TreeMap<Integer,String> t1=new TreeMap<Integer, String>();
		t1.put(1,"Nani");
		t1.put(2,"Chintu");
		t1.put(3,"Merugu");
		t1.put(4,"Mammu");
		t1.put(5,"Ammulu");
		
		System.out.println("Enter the Search the key");
		Scanner Scan=new Scanner(System.in);
		int i2=Scan.nextInt();
		
		if(t1.containsKey(i2))
		{
			System.out.println("Key is present");
		}
		else
		{
			System.out.println("Key is not prescent");
		}
		
	}
}
