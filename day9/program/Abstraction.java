abstract class Animal{
	abstract void sound();
	void eat() {
		IO.println("eating...");
	}
}

class Dog extends Animal {
	void sound(){
		IO.println("bark bark");
	}
}

class Cat extends Animal {
	void sound(){
		IO.println("meow meow");
	}
}

public class Abstraction {
	public static void main(String[] args) {
		var dog = new Dog();
		dog.sound();
		var cat = new Cat();
		cat.sound();
	}
}
