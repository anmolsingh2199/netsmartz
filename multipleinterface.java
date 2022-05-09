package assignment2;
interface A{
	void display1();
}
interface B{
	void display2();
}
class test3 implements A,B{
public	void display1() {
		System.out.print("HI");
	}
public	void display2() {
	System.out.print("Hey");
}
}
class multipleinterface {
public static void main(String args[]) {
	test3 t3=new test3();
	t3.display1();
	t3.display2();
}
}
