public class HierarchialInheritance {

    public static void main(String[] args) {
        Son son = new Son();
        son.display();
        son.job();

        Daughter don = new Daughter();
        don.display();
        don.business();
    }
}

class Father {

    void display() {
        IO.println("I have 1 son and 1 daughter");
    }
}

class Son extends Father {

    void job() {
        IO.println("Business goes to Daughter");
    }
}

class Daughter extends Father {

    void business() {
        IO.println("I cannot");
    }
}
