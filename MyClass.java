package assignment2;
interface A4{
	void meth1();
	void meth2();
}

public class MyClass implements A4{
	public void meth1() {
		System.out.println("HI");
	}
public void meth2() {
	System.out.println("Hey");
	}

	public static void main(String[] args) {
		MyClass ob=new MyClass();
		ob.meth1();
		ob.meth2();

	}

}
