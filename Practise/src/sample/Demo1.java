package sample;

public class Demo1 
{
	public static void main(String argv[])
	{
		char ch='A';
		
		if(ch>='A' && ch<='Z')
		{
			ch=(char)(ch+32);
		}
		
		switch(ch)
		{
			case 'a': 
			case 'e': 
			case 'i': 			
			case 'o': 	
			case 'u': 
				{	
					System.out.println("Char is vowel");
					break;
				}
			
			default:
				{
					System.out.println("Char is Consonanent.....");
				}
		}
	}
}
