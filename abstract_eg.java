package assignment2;

 abstract class parent2 {
	abstract void display();
}
 class child2 extends parent2{
	 void display() {
		 System.out.println("hello");
	 }
 }

public class abstract_eg {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
child2 c2=new child2();
c2.display();
	}

}
