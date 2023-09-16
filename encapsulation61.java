package jonathan;
class encapsulation61 {
	String name;
	int rollno;
	public void get()
	{
		System.out.println("Student name is"+name);
		System.out.println("Student rollno is"+rollno);
	}
	public void set(String n,int r)
	{
		name=n;
		rollno=r;
	}
}
class Test{
	public static void main(String args[])
	{
		encapsulation61 s1=new encapsulation61();
		s1.set("logan",200);
		s1.get();
	}
}