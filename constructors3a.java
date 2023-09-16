package jonathan;

public class constructors3a {
	int id;
	String name;
	constructors3a()
	{
		id=0;
		name="";
	}
	constructors3a(int i,String n)
	{
		id=i;
		name=n;
	}
	void display()
	{
		System.out.println("id is"+id);
		System.out.println("name is"+name);
	}
	public static void main(String args[])
	{
		constructors3a s1=new constructors3a();
		constructors3a s2=new constructors3a(222,"Logan");
		s1.display();
		s2.display();
	}
}
