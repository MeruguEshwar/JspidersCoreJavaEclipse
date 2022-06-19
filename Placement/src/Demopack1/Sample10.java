package Demopack1;
/* wap to print index number of e character */
public class Sample10 
{
	public static void main(String[] args) 
	{
		String s1 = "webdevelopment";
		
		int index = s1.indexOf('e');
		System.out.print("e appears @ index ");
		while(index != -1)
		{
			System.out.print(index+" ");
			index=s1.indexOf('e',index+1);
		}
	}
}
