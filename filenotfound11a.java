package jonathan;
import java.io.*;
public class filenotfound11a {
	public static void main(String[] args)
	{
		FileReader file=new FileReader("C:\\Users\\User\\Desktopkachaow.txt");
		BufferedReader fileinput=new BufferedReader(file);
		for (int counter=0;counter<3;counter++)
			System.out.println(fileinput.readline());
		fileinput.close();
	}
}