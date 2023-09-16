package jonathan;
import java.io.*;
public class CheckedException11b{
	public static void main(String[] args)
	throws IOException
	{
		FileReader file=new FileReader("C:\\Users\\User\\Desktop");
		BufferedReader fileinput=new BufferedReader(file);
		for (int counter=0;counter<3;counter++) 
			System.out.println(fileinput.readLine());
		fileinput.close();}
	}