package assignment2;

class example_super {
	void display()
	{
		System.out.println("Inside example_super");
	}
}
class example extends example_super 
{
	void display()
	{
		System.out.println("Inside example");
	super.display();
	}
}
public class test1
{
	public static void main(String args[]) 
	{

		example e=new example();
		e.display();
		
	}
	
}
