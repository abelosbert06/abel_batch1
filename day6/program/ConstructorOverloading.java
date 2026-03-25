class crOverloading {

    public crOverloading() {
        IO.println("non parameterised constructor");
    }

    public crOverloading(int c) {
        IO.println("parameterised constructor. Passed value: " + c);
    }

    public crOverloading(String s) {
        IO.println("parameterised constructor with different typle" + " " + s);
    }

    public crOverloading(int c, int x) {
        IO.println(
            "multi parameter constructor. Passed values: " + c + " " + x
        );
    }
}

public class ConstructorOverloading {

    public static void main(String[] args) {
        var cr1 = new crOverloading();
        var cr2 = new crOverloading(20);
        var cr3 = new crOverloading(20, 20);
        var cr4 = new crOverloading("hello");
    }
}
