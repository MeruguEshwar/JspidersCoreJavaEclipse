package demopack4;

public class Sample2 
{
	public static void main(String argv[])
	{
		File f1 = new File("D:/zzzgame/zzz.ser");
		try
		{
			FileInputStream fis = new FileInputStream(f1);
			ObjectInputStream ois = new ObjectInputStream(fis);
			Game g1 = (Game) ois.readObject();
			g1.display();
			ois.close();
			fis.close();
	}
}
