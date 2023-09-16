package jonathan;
abstract class abstractclass101 
{
	abstract void display();
}
public class wazza extends abstractclass101{
	void display()
	{
		System.out.println("Abstract method called");
	}
	public static void main(String[] args)
	{
		abstractclass101 obj=new wazza();
		obj.display();
	}
}