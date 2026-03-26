public class SimpleInheritance {

    public static void main(String[] args) {
        var ch = new Child();
        ch.display();
        ch.parentDisplay();

        Parent ch2 = new Child();
        //ch2.display(); cannot access since ch2 is of type Parent and does not have access to .display()
        ch2.parentDisplay();
    }
}

class Parent {

    int x = 29;

    void parentDisplay() {
        IO.println("I am inside parent class");
    }
}

class Child extends Parent {

    void display() {
        IO.println("I am inside child class. Inherited var: " + x);
    }
}
