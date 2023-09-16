package jonathan;

public class dynamicbinding9b {
	void print()
	{
		System.out.println("in person class");}
	}
	class student extends dynamicbinding9b
	{
		void print()
		{
			System.out.println("in student class");
		}
		class employee extends dynamicbinding9b
		{
			void print()
			{
				System.out.println("in employee class");
			}
			public static void main(String args[])
			{
				dynamicbinding9b ob1= new student();
				ob1.print();
				dynamicbinding9b ob2= new dynamicbinding9b();
				ob2.print();
			}
		}
}
 