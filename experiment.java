package assignment2;

public class experiment {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
     Outer O=new Outer();
O.display();
Outer.Inner i=O.new Inner();
i.display();
	}

}
class Outer{
	void display() {
		System.out.println("Inside outer display method");
	}
	class Inner{
		void display() {
			System.out.println("Inside inner display method");
		}
	}
}
