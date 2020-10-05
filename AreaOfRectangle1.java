import java.lang.*;
import java.util.*;
class Rectangle
{
	Scanner obj=new Scanner(System.in);
	float length,breadth;
	Rectangle()
	{
		System.out.println("Enter the dimensions:");
		length=obj.nextFloat();
		breadth=obj.nextFloat();
	}
	Rectangle(float l,float b)
	{
		length=l;
		breadth=b;
		
	}
	void display()
	{
		System.out.println("Area="+(length*breadth));
	}

}
 class AreaOfRectangle1
{
    
	public static void main(String args[])

    	{

		Rectangle r1=new Rectangle();
       		Rectangle r=new Rectangle(3.5f,7.5f);
		r1.display();
		r.display();
		
	
}

}