public class AdditionPoly {

    public static void main(String[] args) {
        IO.println((new Addition()).add(10, 23));
        IO.println((new Addition()).add(10, 23, 43));
        IO.println((new Addition()).add(10.23, 23.5, 29.23));
        IO.println((new Addition()).add(98.2, 737.34));
    }
}

class Addition {

    int add(int x, int y) {
        return x + y;
    }

    double add(double x, double y) {
        return x + y;
    }

    int add(int x, int y, int z) {
        return x + y + z;
    }

    double add(double x, double y, double z) {
        return x + y + z;
    }
}
