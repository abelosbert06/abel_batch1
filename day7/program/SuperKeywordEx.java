void main(String[] args) {
    var eg = new SuperExample2();
    eg.hello();
}

class SuperExample {

    SuperExample() {
        IO.println("from super");
    }

    void hello() {
        IO.println("hello from SuperExample");
    }
}

class SuperExample2 extends SuperExample {

    SuperExample2() {
        IO.println("from super2");
    }

    void hello() {
        IO.println("Hello from SuperExample2");
        super.hello();
    }
}
