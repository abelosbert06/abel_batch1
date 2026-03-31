public class InterfaceExample {
	public static void main(String[] args){
		var c = new C();
		c.display();
		c.show();
	}
}

interface A {
	void show();
}

interface B {
	void display();
}

class C implements A, B {
	public void display(){
		IO.println("hello");
	}

	public void show(){
		IO.println("look");
	}
}

