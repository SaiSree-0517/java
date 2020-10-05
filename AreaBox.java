import java.lang.*;
import java.util.*;
class Box
{
	Scanner obj=new Scanner(System.in);
	int  width;
	int height;
	int depth;
	Box()
	{
		System.out.println("Enter the dimensions:");
		width=obj.nextInt();
		height=obj.nextInt();
		depth=obj.nextInt();
		
	}
	void area()
	{
		System.out.print("Area="+(width*height*depth));
	}

}
 class AreaBox
{
    
	public static void main(String args[])

    	{

       		Box b=new Box();
		b.area();
		
	
}

}