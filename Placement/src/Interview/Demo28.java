package Interview;
import java.util.HashMap;
import java.util.TreeMap;

//WAP to get greatest key Less than the given key
public class Demo28 
{
	public static void main(String[] args) 
	{
		HashMap<Integer,String> t1=new HashMap<Integer, String>();
		t1.put(1,"Nani");
		t1.put(2,"Chintu");
		t1.put(3,"Eshu");
		t1.put(4,"sai");
		t1.put(5,"Krishna");
		
		System.out.println(t1);
		
		TreeMap<Integer,String> h1=new TreeMap<Integer,String>(t1);
		System.out.println(h1.higherKey(4));
	}
}
