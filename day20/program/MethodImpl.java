void main(){
	hello h = new hello();
	h.display();
	h.display2();
}

interface method {
	public void display();
	default void display2(){
		IO.println("hello2");
	}
}

class hello implements method {
	public void display(){
		IO.println("hello");
	}
}
