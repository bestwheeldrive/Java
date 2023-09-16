package jonathan;
class inheritance81
{
	String name;
	int age;
	char gender;
	void set(String n,int a,char g)
	{
		name=n;
		age=a;
		gender=g;
	}
	void display()
	{
		System.out.println("Name is"+name);
		System.out.println("Age is"+age);
		System.out.println("gender is"+gender);
	}
}
public class student extends inheritance81{
	int rollno;
	String dept;
	void setstud(int r,String d)
	{
		rollno=r;
		dept=d;
	}
	void displaystud()
	{
		System.out.println("Rollno is"+rollno);
		System.out.println("Department is"+dept);
	}
	public static void main(String[] args) {
		student ob=new student();
		ob.set("loagn",200,'m');
		ob.setstud(05,"Weapon-X");
		ob.display();
		ob.displaystud();
	}
}