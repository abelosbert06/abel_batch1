public class ParaConst {

    public static void main(String[] args) {
        var ex = new ExampleClass(100);
    }
}

class ExampleClass {

    int num;

    public ExampleClass(int num) {
        this.num = num;
        IO.println("Given number is " + num);
    }
}
