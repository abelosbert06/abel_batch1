public class Polymorphism {

    public static void main(String[] args) {
        Animal animal;
        animal = new Cat();
        animal.sound();

        animal = new Dog();
        animal.sound();
    }
}

class Animal {

    void sound() {
        IO.println("animal sound");
    }
}

class Dog extends Animal {

    void sound() {
        super.sound();
        IO.println("bark");
    }
}

class Cat extends Animal {

    void sound() {
        super.sound();
        IO.println("meow");
    }
}
