package jonathan;
public class calculatorSRP62
{
	int n1,n2,ans;
	int rollno;
	public void set(int x,int y)
	{
		n1=x;
		n2=y;
	}
	void add()
	{
		int ans=n1+n2;
		System.out.println("sum is"+ans);
	}
	void sub()
	{
		int ans=n1-n2;
		System.out.println("difference is"+ans);
	}
	void product()
	{
		int ans=n1*n2;
		System.out.println("product is"+ans);
	}
	void division()
	{
		int ans=n1/n2;
		System.out.println("division is"+ans);
	}
}
class test1
{
	public static void main(String[] args)
	{
		calculatorSRP62 s1=new calculatorSRP62();
		s1.set(45,35);
		s1.add();
		s1.sub();
		s1.product();
		s1.division();
	}
}