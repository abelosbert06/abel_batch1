public class Inheritance {

    public static void main(String[] args) {
        Dog sound = new Dog();
        sound.bark();
        sound.makeSound();
        sound.displayHash();

        var sound22 = new Puppy();
        sound22.whine();
    }
}

class Animal {

    void makeSound() {
        IO.println("*generic animal sounds*");
    }
}

class Dog extends Animal {

    void bark() {
        IO.println("bark");
    }

    void displayHash() {
        IO.println(this.hashCode());
    }
}

class Puppy extends Dog {

    void whine() {
        IO.println("puppy whines");
    }
}
