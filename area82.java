package jonathan;
interface Shape{
	public double area82();
}
class Rectangle implements Shape{
	double length;
	double width;
	Rectangle(double l,double w)
	{
		length=l;
		width=w;
	}
	public double area82()
	{
		return length*width;
	}
}
class Circle implements Shape{
	public double radius;
	Circle(double r)
	{
		radius=r;
	}
	public double area82()
	{
		return (22/7)*radius*radius;
	}
}
public class areacalculator{
	public double calculateshapearea(Shape shape)
	{
		return shape.area82();
	}
	public static void main(String[] args) {
		areacalculator ob=new areacalculator();
		Shape sh=new Rectangle(10,20);
		double ans=ob.calculateshapearea(sh);
		System.out.println("the rectangle area is"+ans);
		areacalculator ob1=new areacalculator();
		Shape sh1=new Circle(7);
		double ans1=ob1.calculateshapearea(sh1);
		System.out.println("the circle area is"+ans1);
	}
}
