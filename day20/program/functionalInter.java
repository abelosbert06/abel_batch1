import java.util.function.*;

public class functionalInter {
    public static void main(String[] args) {
        Predicate<Integer> isEven = n -> n % 2 == 0;
        Consumer<String> printer = message -> System.out.println(message);
        Supplier<Integer> numberSupplier = () -> 100;

        int input = numberSupplier.get();

        if (isEven.test(input)) {
            printer.accept(input + " is an even number.");
        } else {
            printer.accept(input + " is an odd number.");
        }
    }
}
