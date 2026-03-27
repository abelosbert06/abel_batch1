public class EncapImp {

    public static void main(String[] args) {
        var obj = new Encapsulation();
        obj.display();
    }
}

class Encapsulation {

    int a;

    Encapsulation() {
        a = 10;
    }

    void display() {
        IO.println("x: " + a);
    }
}
