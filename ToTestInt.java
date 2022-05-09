package assignment2;
interface Test{
	void square();
}
class Arithmetic implements Test{
	public void square() {
		System.out.println("in Square");
	}
}
public class ToTestInt {
	public static void main(String[] args) {
Arithmetic k=new Arithmetic();
k.square();
}
}
