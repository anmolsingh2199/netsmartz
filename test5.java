package assignment2;

 class parent {
	void display()
	{
		System.out.println("Inside parent class");
	}

}
class child extends parent{
	void display()
	{
		System.out.println("Inside child class");	
	}
}
public class test5
{
	public static void main(String args[]) 
	{

		parent p=new parent();
		p.display();
		child c=new child();
		c.display();
	}
	
}