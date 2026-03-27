public class MethodOverriding {

    public static void main(String[] args) {
        Animal animal;
        animal = new Animal();
        animal.sound();

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

    @Override
    void sound() {
        IO.println("bark");
    }
}

class Cat extends Animal {

    @Override
    void sound() {
        IO.println("meow");
    }
}
