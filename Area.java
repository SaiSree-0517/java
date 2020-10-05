class Square
{
	void area(int a)
	{
		System.out.println("Area="+(a*a));
	}
	void area(float b)
	{
		System.out.println("Area="+(b*b));
	}
	void area(double a)
	{
		System.out.println("Area="+(a*a));
	}
}
class Area
{
	public static void main(String args[])
	{
		Square s=new Square();
		s.area(6);
		s.area(4.5f);
		s.area(5.55);

	}
	
}