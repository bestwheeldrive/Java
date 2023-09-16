package jonathan;
import java.io.*;
interface readfile83
{
	public void read();
}
class XYZ implements readfile83{
	public void read()
	{
		try
		{
			File file=new File("abc.txt");
			FileReader fr=new FileReader(file);
			BufferedReader br=new BufferedReader(fr);
			String line;
			while((line=br.readLine())!=null)
			{
				System.out.println(line);
			}
			fr.close();
		}
		catch(IOEception e)
		{
			System.out.println(e);
		} }}
public class ReadLine
{
	public static void main(String[] args)
	{
		XYZ ob=new XYZ();
		ob.read();
	}
}