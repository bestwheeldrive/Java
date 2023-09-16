package jonathan;
interface carstart
{
	void start();
}
interface carstop
{
	void stop();
}
public class abstraction102 implements carstart,carstop
{
	public void start()
	{
		System.out.println("car engine has started");
	}
	public void stop()
	{
		System.out.println("car engine has stopped");
	}
	public static void main(String[] args) {
		abstraction102 c=new abstraction102();
		c.start();
		c.stop();
	}
}